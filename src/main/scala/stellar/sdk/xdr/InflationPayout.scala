// Automatically generated by xdrgen
// DO NOT EDIT or your changes may be overwritten

package stellar.sdk.xdr

import stellar.sdk.xdr._

// === xdr source ============================================================

//  struct InflationPayout // or use PaymentResultAtom to limit types?
//  {
//      AccountID destination;
//      int64 amount;
//  };

//  ===========================================================================

case class InflationPayout (
  destination: AccountID, 
  amount: Int64
) {
  def encode(stream: XdrDataOutputStream): Unit = {
    destination.encode(stream)
    amount.encode(stream)
  }
}

object InflationPayout {
  def decode(stream: XdrDataInputStream): InflationPayout = InflationPayout(
    AccountID.decode(stream),
    Int64.decode(stream)
  )
}