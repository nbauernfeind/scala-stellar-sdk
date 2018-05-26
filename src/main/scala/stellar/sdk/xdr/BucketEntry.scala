// Automatically generated by xdrgen
// DO NOT EDIT or your changes may be overwritten

package stellar.sdk.xdr

import stellar.sdk.xdr._

// === xdr source ============================================================

//  union BucketEntry switch (BucketEntryType type)
//  {
//  case LIVEENTRY:
//      LedgerEntry liveEntry;
//  
//  case DEADENTRY:
//      LedgerKey deadEntry;
//  };

//  ===========================================================================

sealed trait BucketEntry {
  def encode(stream: XdrDataOutputStream): Unit
}

object BucketEntry {
  def decode(stream: XdrDataInputStream): BucketEntry = BucketEntryType.decode(stream) match {
    case BucketEntryType.LIVEENTRY => LIVEENTRY(LedgerEntry.decode(stream))
    case BucketEntryType.DEADENTRY => DEADENTRY(LedgerKey.decode(stream))
    case d => throw new IllegalArgumentException(s"BucketEntryType value $d is invalid")
  }

  case class LIVEENTRY(x: LedgerEntry) extends BucketEntry {
    def encode(stream: XdrDataOutputStream): Unit = {
      BucketEntryType.LIVEENTRY.encode(stream)
      x.encode(stream)
    }
  }
  case class DEADENTRY(x: LedgerKey) extends BucketEntry {
    def encode(stream: XdrDataOutputStream): Unit = {
      BucketEntryType.DEADENTRY.encode(stream)
      x.encode(stream)
    }
  }
}
