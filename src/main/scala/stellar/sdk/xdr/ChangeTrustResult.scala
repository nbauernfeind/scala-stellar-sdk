// Automatically generated by xdrgen
// DO NOT EDIT or your changes may be overwritten

package stellar.sdk.xdr

import stellar.sdk.xdr._

// === xdr source ============================================================

//  union ChangeTrustResult switch (ChangeTrustResultCode code)
//  {
//  case CHANGE_TRUST_SUCCESS:
//      void;
//  default:
//      void;
//  };

//  ===========================================================================

sealed trait ChangeTrustResult {
  def encode(stream: XdrDataOutputStream): Unit
}

object ChangeTrustResult {
  def decode(stream: XdrDataInputStream): ChangeTrustResult = ChangeTrustResultCode.decode(stream) match {
    case ChangeTrustResultCode.CHANGE_TRUST_SUCCESS => CHANGE_TRUST_SUCCESS
    case d => Default(d)
  }

  case object CHANGE_TRUST_SUCCESS extends ChangeTrustResult {
    def encode(stream: XdrDataOutputStream): Unit = {
      ChangeTrustResultCode.CHANGE_TRUST_SUCCESS.encode(stream)
    }
  }
  case class Default(d: ChangeTrustResultCode) extends ChangeTrustResult {
    def encode(stream: XdrDataOutputStream): Unit = {
      d.encode(stream)
    }
  }
}
