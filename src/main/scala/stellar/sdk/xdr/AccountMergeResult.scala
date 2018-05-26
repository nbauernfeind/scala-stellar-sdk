// Automatically generated by xdrgen
// DO NOT EDIT or your changes may be overwritten

package stellar.sdk.xdr

import stellar.sdk.xdr._

// === xdr source ============================================================

//  union AccountMergeResult switch (AccountMergeResultCode code)
//  {
//  case ACCOUNT_MERGE_SUCCESS:
//      int64 sourceAccountBalance; // how much got transfered from source account
//  default:
//      void;
//  };

//  ===========================================================================

sealed trait AccountMergeResult {
  def encode(stream: XdrDataOutputStream): Unit
}

object AccountMergeResult {
  def decode(stream: XdrDataInputStream): AccountMergeResult = AccountMergeResultCode.decode(stream) match {
    case AccountMergeResultCode.ACCOUNT_MERGE_SUCCESS => ACCOUNT_MERGE_SUCCESS(Int64.decode(stream))
    case d => Default(d)
  }

  case class ACCOUNT_MERGE_SUCCESS(x: Int64) extends AccountMergeResult {
    def encode(stream: XdrDataOutputStream): Unit = {
      AccountMergeResultCode.ACCOUNT_MERGE_SUCCESS.encode(stream)
      x.encode(stream)
    }
  }
  case class Default(d: AccountMergeResultCode) extends AccountMergeResult {
    def encode(stream: XdrDataOutputStream): Unit = {
      d.encode(stream)
    }
  }
}