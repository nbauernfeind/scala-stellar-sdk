// Automatically generated by xdrgen
// DO NOT EDIT or your changes may be overwritten

package stellar.sdk.xdr

import stellar.sdk.xdr._

// === xdr source ============================================================

//  struct Price
//  {
//      int32 n; // numerator
//      int32 d; // denominator
//  };

//  ===========================================================================

case class Price (
  n: Int32, 
  d: Int32
) {
  def encode(stream: XdrDataOutputStream): Unit = {
    n.encode(stream)
    d.encode(stream)
  }
}

object Price {
  def decode(stream: XdrDataInputStream): Price = Price(
    Int32.decode(stream),
    Int32.decode(stream)
  )
}
