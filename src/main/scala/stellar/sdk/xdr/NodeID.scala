// Automatically generated by xdrgen
// DO NOT EDIT or your changes may be overwritten

package stellar.sdk.xdr

import stellar.sdk.xdr._

// === xdr source ============================================================

//  typedef PublicKey NodeID;

//  ===========================================================================

case class NodeID (self: PublicKey) {
  def encode(stream: XdrDataOutputStream): Unit = {
    self.encode(stream)
  }
}
object NodeID {
  def decode(stream: XdrDataInputStream): NodeID = NodeID(PublicKey.decode(stream))
}
