// Automatically generated by xdrgen
// DO NOT EDIT or your changes may be overwritten

package stellar.sdk.xdr

import stellar.sdk.xdr._

// === xdr source ============================================================

//  enum MessageType
//  {
//      ERROR_MSG = 0,
//      AUTH = 2,
//      DONT_HAVE = 3,
//  
//      GET_PEERS = 4, // gets a list of peers this guy knows about
//      PEERS = 5,
//  
//      GET_TX_SET = 6, // gets a particular txset by hash
//      TX_SET = 7,
//  
//      TRANSACTION = 8, // pass on a tx you have heard about
//  
//      // SCP
//      GET_SCP_QUORUMSET = 9,
//      SCP_QUORUMSET = 10,
//      SCP_MESSAGE = 11,
//      GET_SCP_STATE = 12,
//  
//      // new messages
//      HELLO = 13
//  };

//  ===========================================================================

sealed class MessageType (val i: Int) {
  def encode(stream: XdrDataOutputStream) = stream.writeInt(i)
}

object MessageType {
  def decode(stream: XdrDataInputStream): MessageType = stream.readInt() match {
    case 0 => ERROR_MSG
    case 2 => AUTH
    case 3 => DONT_HAVE
    case 4 => GET_PEERS
    case 5 => PEERS
    case 6 => GET_TX_SET
    case 7 => TX_SET
    case 8 => TRANSACTION
    case 9 => GET_SCP_QUORUMSET
    case 10 => SCP_QUORUMSET
    case 11 => SCP_MESSAGE
    case 12 => GET_SCP_STATE
    case 13 => HELLO
    case i => throw new IllegalArgumentException(s"MessageType value $i is invalid")
  }

  case object ERROR_MSG extends MessageType(0)
  case object AUTH extends MessageType(2)
  case object DONT_HAVE extends MessageType(3)
  case object GET_PEERS extends MessageType(4)
  case object PEERS extends MessageType(5)
  case object GET_TX_SET extends MessageType(6)
  case object TX_SET extends MessageType(7)
  case object TRANSACTION extends MessageType(8)
  case object GET_SCP_QUORUMSET extends MessageType(9)
  case object SCP_QUORUMSET extends MessageType(10)
  case object SCP_MESSAGE extends MessageType(11)
  case object GET_SCP_STATE extends MessageType(12)
  case object HELLO extends MessageType(13)
}