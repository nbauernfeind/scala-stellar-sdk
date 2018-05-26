// Automatically generated by xdrgen
// DO NOT EDIT or your changes may be overwritten

package stellar.sdk.xdr

import stellar.sdk.xdr._

// === xdr source ============================================================

//  union PaymentResult switch (PaymentResultCode code)
//  {
//  case PAYMENT_SUCCESS:
//      void;
//  default:
//      void;
//  };

//  ===========================================================================

sealed trait PaymentResult {
  def encode(stream: XdrDataOutputStream): Unit
}

object PaymentResult {
  def decode(stream: XdrDataInputStream): PaymentResult = PaymentResultCode.decode(stream) match {
    case PaymentResultCode.PAYMENT_SUCCESS => PAYMENT_SUCCESS
    case d => Default(d)
  }

  case object PAYMENT_SUCCESS extends PaymentResult {
    def encode(stream: XdrDataOutputStream): Unit = {
      PaymentResultCode.PAYMENT_SUCCESS.encode(stream)
    }
  }
  case class Default(d: PaymentResultCode) extends PaymentResult {
    def encode(stream: XdrDataOutputStream): Unit = {
      d.encode(stream)
    }
  }
}