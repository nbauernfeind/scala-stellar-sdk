// Automatically generated by xdrgen
// DO NOT EDIT or your changes may be overwritten

package stellar.sdk.xdr

import stellar.sdk.xdr._

// === xdr source ============================================================

//  enum SCPStatementType
//  {
//      SCP_ST_PREPARE = 0,
//      SCP_ST_CONFIRM = 1,
//      SCP_ST_EXTERNALIZE = 2,
//      SCP_ST_NOMINATE = 3
//  };

//  ===========================================================================

sealed class SCPStatementType (val i: Int) {
  def encode(stream: XdrDataOutputStream) = stream.writeInt(i)
}

object SCPStatementType {
  def decode(stream: XdrDataInputStream): SCPStatementType = stream.readInt() match {
    case 0 => SCP_ST_PREPARE
    case 1 => SCP_ST_CONFIRM
    case 2 => SCP_ST_EXTERNALIZE
    case 3 => SCP_ST_NOMINATE
    case i => throw new IllegalArgumentException(s"SCPStatementType value $i is invalid")
  }

  case object SCP_ST_PREPARE extends SCPStatementType(0)
  case object SCP_ST_CONFIRM extends SCPStatementType(1)
  case object SCP_ST_EXTERNALIZE extends SCPStatementType(2)
  case object SCP_ST_NOMINATE extends SCPStatementType(3)
}