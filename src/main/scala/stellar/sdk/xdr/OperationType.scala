// Automatically generated by xdrgen
// DO NOT EDIT or your changes may be overwritten

package stellar.sdk.xdr

import stellar.sdk.xdr._

// === xdr source ============================================================

//  enum OperationType
//  {
//      CREATE_ACCOUNT = 0,
//      PAYMENT = 1,
//      PATH_PAYMENT = 2,
//      MANAGE_OFFER = 3,
//      CREATE_PASSIVE_OFFER = 4,
//      SET_OPTIONS = 5,
//      CHANGE_TRUST = 6,
//      ALLOW_TRUST = 7,
//      ACCOUNT_MERGE = 8,
//      INFLATION = 9,
//      MANAGE_DATA = 10,
//      BUMP_SEQUENCE = 11
//  };

//  ===========================================================================

sealed class OperationType (val i: Int) {
  def encode(stream: XdrDataOutputStream) = stream.writeInt(i)
}

object OperationType {
  def decode(stream: XdrDataInputStream): OperationType = stream.readInt() match {
    case 0 => CREATE_ACCOUNT
    case 1 => PAYMENT
    case 2 => PATH_PAYMENT
    case 3 => MANAGE_OFFER
    case 4 => CREATE_PASSIVE_OFFER
    case 5 => SET_OPTIONS
    case 6 => CHANGE_TRUST
    case 7 => ALLOW_TRUST
    case 8 => ACCOUNT_MERGE
    case 9 => INFLATION
    case 10 => MANAGE_DATA
    case 11 => BUMP_SEQUENCE
    case i => throw new IllegalArgumentException(s"OperationType value $i is invalid")
  }

  case object CREATE_ACCOUNT extends OperationType(0)
  case object PAYMENT extends OperationType(1)
  case object PATH_PAYMENT extends OperationType(2)
  case object MANAGE_OFFER extends OperationType(3)
  case object CREATE_PASSIVE_OFFER extends OperationType(4)
  case object SET_OPTIONS extends OperationType(5)
  case object CHANGE_TRUST extends OperationType(6)
  case object ALLOW_TRUST extends OperationType(7)
  case object ACCOUNT_MERGE extends OperationType(8)
  case object INFLATION extends OperationType(9)
  case object MANAGE_DATA extends OperationType(10)
  case object BUMP_SEQUENCE extends OperationType(11)
}