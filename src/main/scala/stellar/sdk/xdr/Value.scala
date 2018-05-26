// Automatically generated by xdrgen
// DO NOT EDIT or your changes may be overwritten

package stellar.sdk.xdr

import stellar.sdk.xdr._

// === xdr source ============================================================

//  typedef opaque Value<>;

//  ===========================================================================

case class Value (self: Array[Byte]) {
  def encode(stream: XdrDataOutputStream): Unit = {
    stream.writeInt(self.length)
    stream.write(self, 0, self.length)
  }
}
object Value {
  def decode(stream: XdrDataInputStream): Value = Value(stream.readBytes(stream.readInt))
}