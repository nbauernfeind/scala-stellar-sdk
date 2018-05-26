package stellar.sdk.xdr

import java.io.{DataOutputStream, OutputStream}
import java.nio.charset.Charset

class XdrDataOutputStream(out: XdrOutputStream) extends DataOutputStream(new XdrOutputStream(out)) {

  def writeString(s: String): Unit = {
    val chars = s.getBytes(Charset.forName("UTF-8"))
    writeInt(chars.length)
    write(chars)
  }

  def writeIntArray(a: Array[Int]): Unit = {
    writeInt(a.length)
    a.foreach(writeInt)
  }

  def writeFloatArray(a: Array[Float]): Unit = {
    writeInt(a.length)
    a.foreach(writeFloat)
  }

  def writeDoubleArray(a: Array[Double]): Unit = {
    writeInt(a.length)
    a.foreach(writeDouble)
  }
}

class XdrOutputStream(out: OutputStream) extends OutputStream {

  private var count = 0

  override def write(b: Int): Unit = {
    out.write(b)
    count += 1
  }

  override def write(bs: Array[Byte]): Unit = write(bs, 0, bs.length)

  override def write(bs: Array[Byte], offset: Int, len: Int): Unit = {
    out.write(bs, offset, len)
    count += len
    pad()
  }

  private def pad(): Unit = {
    val mod = count % 4
    val pad = if (mod > 0) 4 - mod else 0
    (0 until pad).foreach(_ => write(0))
  }

}
