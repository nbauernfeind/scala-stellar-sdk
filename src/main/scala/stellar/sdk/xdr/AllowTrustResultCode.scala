// Automatically generated by xdrgen
// DO NOT EDIT or your changes may be overwritten

package stellar.sdk.xdr

import stellar.sdk.xdr._

// === xdr source ============================================================

//  enum AllowTrustResultCode
//  {
//      // codes considered as "success" for the operation
//      ALLOW_TRUST_SUCCESS = 0,
//      // codes considered as "failure" for the operation
//      ALLOW_TRUST_MALFORMED = -1,     // asset is not ASSET_TYPE_ALPHANUM
//      ALLOW_TRUST_NO_TRUST_LINE = -2, // trustor does not have a trustline
//                                      // source account does not require trust
//      ALLOW_TRUST_TRUST_NOT_REQUIRED = -3,
//      ALLOW_TRUST_CANT_REVOKE = -4,     // source account can't revoke trust,
//      ALLOW_TRUST_SELF_NOT_ALLOWED = -5 // trusting self is not allowed
//  };

//  ===========================================================================

sealed class AllowTrustResultCode (val i: Int) {
  def encode(stream: XdrDataOutputStream) = stream.writeInt(i)
}

object AllowTrustResultCode {
  def decode(stream: XdrDataInputStream): AllowTrustResultCode = stream.readInt() match {
    case 0 => ALLOW_TRUST_SUCCESS
    case -1 => ALLOW_TRUST_MALFORMED
    case -2 => ALLOW_TRUST_NO_TRUST_LINE
    case -3 => ALLOW_TRUST_TRUST_NOT_REQUIRED
    case -4 => ALLOW_TRUST_CANT_REVOKE
    case -5 => ALLOW_TRUST_SELF_NOT_ALLOWED
    case i => throw new IllegalArgumentException(s"AllowTrustResultCode value $i is invalid")
  }

  case object ALLOW_TRUST_SUCCESS extends AllowTrustResultCode(0)
  case object ALLOW_TRUST_MALFORMED extends AllowTrustResultCode(-1)
  case object ALLOW_TRUST_NO_TRUST_LINE extends AllowTrustResultCode(-2)
  case object ALLOW_TRUST_TRUST_NOT_REQUIRED extends AllowTrustResultCode(-3)
  case object ALLOW_TRUST_CANT_REVOKE extends AllowTrustResultCode(-4)
  case object ALLOW_TRUST_SELF_NOT_ALLOWED extends AllowTrustResultCode(-5)
}
