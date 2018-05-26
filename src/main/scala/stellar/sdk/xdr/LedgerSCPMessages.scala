// Automatically generated by xdrgen
// DO NOT EDIT or your changes may be overwritten

package stellar.sdk.xdr

import stellar.sdk.xdr._

// === xdr source ============================================================

//  struct LedgerSCPMessages
//  {
//      uint32 ledgerSeq;
//      SCPEnvelope messages<>;
//  };

//  ===========================================================================

case class LedgerSCPMessages (
  ledgerSeq: Uint32, 
  messages: Array[SCPEnvelope]
) {
  def encode(stream: XdrDataOutputStream): Unit = {
    ledgerSeq.encode(stream)
    stream.writeInt(messages.length)
    messages.foreach { _.encode(stream) }
  }
}

object LedgerSCPMessages {
  def decode(stream: XdrDataInputStream): LedgerSCPMessages = LedgerSCPMessages(
    Uint32.decode(stream),
    (0 until stream.readInt).map(_ => SCPEnvelope.decode(stream)).toArray
  )
}
