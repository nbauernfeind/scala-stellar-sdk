// Automatically generated by xdrgen
// DO NOT EDIT or your changes may be overwritten

package stellar.sdk.xdr

import stellar.sdk.xdr._

// === xdr source ============================================================

//  enum AccountFlags
//  { // masks for each flag
//  
//      // Flags set on issuer accounts
//      // TrustLines are created with authorized set to "false" requiring
//      // the issuer to set it for each TrustLine
//      AUTH_REQUIRED_FLAG = 0x1,
//      // If set, the authorized flag in TrustLines can be cleared
//      // otherwise, authorization cannot be revoked
//      AUTH_REVOCABLE_FLAG = 0x2,
//      // Once set, causes all AUTH_* flags to be read-only
//      AUTH_IMMUTABLE_FLAG = 0x4
//  };

//  ===========================================================================

sealed class AccountFlags (val i: Int) {
  def encode(stream: XdrDataOutputStream) = stream.writeInt(i)
}

object AccountFlags {
  def decode(stream: XdrDataInputStream): AccountFlags = stream.readInt() match {
    case 1 => AUTH_REQUIRED_FLAG
    case 2 => AUTH_REVOCABLE_FLAG
    case 4 => AUTH_IMMUTABLE_FLAG
    case i => throw new IllegalArgumentException(s"AccountFlags value $i is invalid")
  }

  case object AUTH_REQUIRED_FLAG extends AccountFlags(1)
  case object AUTH_REVOCABLE_FLAG extends AccountFlags(2)
  case object AUTH_IMMUTABLE_FLAG extends AccountFlags(4)
}
