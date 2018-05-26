// Automatically generated by xdrgen
// DO NOT EDIT or your changes may be overwritten

package stellar.sdk.xdr

import stellar.sdk.xdr._

// === xdr source ============================================================

//  enum PaymentResultCode
//  {
//      // codes considered as "success" for the operation
//      PAYMENT_SUCCESS = 0, // payment successfuly completed
//  
//      // codes considered as "failure" for the operation
//      PAYMENT_MALFORMED = -1,          // bad input
//      PAYMENT_UNDERFUNDED = -2,        // not enough funds in source account
//      PAYMENT_SRC_NO_TRUST = -3,       // no trust line on source account
//      PAYMENT_SRC_NOT_AUTHORIZED = -4, // source not authorized to transfer
//      PAYMENT_NO_DESTINATION = -5,     // destination account does not exist
//      PAYMENT_NO_TRUST = -6,       // destination missing a trust line for asset
//      PAYMENT_NOT_AUTHORIZED = -7, // destination not authorized to hold asset
//      PAYMENT_LINE_FULL = -8,      // destination would go above their limit
//      PAYMENT_NO_ISSUER = -9       // missing issuer on asset
//  };

//  ===========================================================================

sealed class PaymentResultCode (val i: Int) {
  def encode(stream: XdrDataOutputStream) = stream.writeInt(i)
}

object PaymentResultCode {
  def decode(stream: XdrDataInputStream): PaymentResultCode = stream.readInt() match {
    case 0 => PAYMENT_SUCCESS
    case -1 => PAYMENT_MALFORMED
    case -2 => PAYMENT_UNDERFUNDED
    case -3 => PAYMENT_SRC_NO_TRUST
    case -4 => PAYMENT_SRC_NOT_AUTHORIZED
    case -5 => PAYMENT_NO_DESTINATION
    case -6 => PAYMENT_NO_TRUST
    case -7 => PAYMENT_NOT_AUTHORIZED
    case -8 => PAYMENT_LINE_FULL
    case -9 => PAYMENT_NO_ISSUER
    case i => throw new IllegalArgumentException(s"PaymentResultCode value $i is invalid")
  }

  case object PAYMENT_SUCCESS extends PaymentResultCode(0)
  case object PAYMENT_MALFORMED extends PaymentResultCode(-1)
  case object PAYMENT_UNDERFUNDED extends PaymentResultCode(-2)
  case object PAYMENT_SRC_NO_TRUST extends PaymentResultCode(-3)
  case object PAYMENT_SRC_NOT_AUTHORIZED extends PaymentResultCode(-4)
  case object PAYMENT_NO_DESTINATION extends PaymentResultCode(-5)
  case object PAYMENT_NO_TRUST extends PaymentResultCode(-6)
  case object PAYMENT_NOT_AUTHORIZED extends PaymentResultCode(-7)
  case object PAYMENT_LINE_FULL extends PaymentResultCode(-8)
  case object PAYMENT_NO_ISSUER extends PaymentResultCode(-9)
}
