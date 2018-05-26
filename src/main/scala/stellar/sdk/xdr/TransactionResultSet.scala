// Automatically generated by xdrgen
// DO NOT EDIT or your changes may be overwritten

package stellar.sdk.xdr

import stellar.sdk.xdr._

// === xdr source ============================================================

//  struct TransactionResultSet
//  {
//      TransactionResultPair results<>;
//  };

//  ===========================================================================

case class TransactionResultSet (
  results: Array[TransactionResultPair]
) {
  def encode(stream: XdrDataOutputStream): Unit = {
    stream.writeInt(results.length)
    results.foreach { _.encode(stream) }
  }
}

object TransactionResultSet {
  def decode(stream: XdrDataInputStream): TransactionResultSet = TransactionResultSet(
    (0 until stream.readInt).map(_ => TransactionResultPair.decode(stream)).toArray
  )
}