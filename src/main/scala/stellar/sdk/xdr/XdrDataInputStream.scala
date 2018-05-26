package stellar.sdk.xdr

import java.io.{DataInputStream, IOException, InputStream}
import java.nio.charset.Charset

class XdrDataInputStream(in: InputStream) extends DataInputStream(new XdrInputStream(in)) {

  def readString: String = {
    val bytes = Array.ofDim[Byte](readInt)
    read(bytes)
    new String(bytes, Charset.forName("UTF-8"))
  }

  def readIntArray: Array[Int] = readIntArray(readInt)

  def readIntArray(size: Int): Array[Int] = (0 until size).map(_ => readInt).toArray

  def readFloatArray: Array[Float] = readFloatArray(readInt)

  def readFloatArray(size: Int): Array[Float] = (0 until size).map(_ => readFloat).toArray

  def readDoubleArray: Array[Double] = readDoubleArray(readInt)

  def readDoubleArray(size: Int): Array[Double] = (0 until size).map(_ => readDouble).toArray

  def readBytes(size: Int): Array[Byte] = {
    val bytes = Array.ofDim[Byte](size)
    read(bytes)
    return bytes
  }
}

class XdrInputStream(in: InputStream) extends InputStream {

  private var count = 0

  override def read: Int = {
    val read = in.read
    if (read >= 0) count += 1
    read
  }

  override def read(bs: Array[Byte]): Int = read(bs, off = 0, len = bs.length)

  override def read(bs: Array[Byte], off: Int, len: Int): Int = {
    val read = in.read(bs, off, len)
    count += read
    pad()
    read
  }

  private def pad(): Unit = {
    val mod = count % 4
    val pad = if (mod > 0) 4 - mod else 0
    (0 until pad).foreach { _ =>
      if (read != 0) throw new IOException("non-zero padding")
    }
  }
}