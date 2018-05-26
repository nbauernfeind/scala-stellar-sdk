// Automatically generated by xdrgen
// DO NOT EDIT or your changes may be overwritten

package stellar.sdk.xdr

import stellar.sdk.xdr._

// === xdr source ============================================================

//  enum IPAddrType
//  {
//      IPv4 = 0,
//      IPv6 = 1
//  };

//  ===========================================================================

sealed class IPAddrType (val i: Int) {
  def encode(stream: XdrDataOutputStream) = stream.writeInt(i)
}

object IPAddrType {
  def decode(stream: XdrDataInputStream): IPAddrType = stream.readInt() match {
    case 0 => IPv4
    case 1 => IPv6
    case i => throw new IllegalArgumentException(s"IPAddrType value $i is invalid")
  }

  case object IPv4 extends IPAddrType(0)
  case object IPv6 extends IPAddrType(1)
}
