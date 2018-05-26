// Automatically generated by xdrgen
// DO NOT EDIT or your changes may be overwritten

package stellar.sdk.xdr

import stellar.sdk.xdr._

// === xdr source ============================================================

//  typedef opaque Hash[32];

//  ===========================================================================

case class Hash (self: Array[Byte]) {
  def encode(stream: XdrDataOutputStream): Unit = {
    stream.write(self, 0, self.length)
  }
}
object Hash {
  def decode(stream: XdrDataInputStream): Hash = Hash(stream.readBytes(32))
}