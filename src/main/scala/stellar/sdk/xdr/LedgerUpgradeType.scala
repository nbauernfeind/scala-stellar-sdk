// Automatically generated by xdrgen
// DO NOT EDIT or your changes may be overwritten

package stellar.sdk.xdr

import stellar.sdk.xdr._

// === xdr source ============================================================

//  enum LedgerUpgradeType
//  {
//      LEDGER_UPGRADE_VERSION = 1,
//      LEDGER_UPGRADE_BASE_FEE = 2,
//      LEDGER_UPGRADE_MAX_TX_SET_SIZE = 3,
//      LEDGER_UPGRADE_BASE_RESERVE = 4
//  };

//  ===========================================================================

sealed class LedgerUpgradeType (val i: Int) {
  def encode(stream: XdrDataOutputStream) = stream.writeInt(i)
}

object LedgerUpgradeType {
  def decode(stream: XdrDataInputStream): LedgerUpgradeType = stream.readInt() match {
    case 1 => LEDGER_UPGRADE_VERSION
    case 2 => LEDGER_UPGRADE_BASE_FEE
    case 3 => LEDGER_UPGRADE_MAX_TX_SET_SIZE
    case 4 => LEDGER_UPGRADE_BASE_RESERVE
    case i => throw new IllegalArgumentException(s"LedgerUpgradeType value $i is invalid")
  }

  case object LEDGER_UPGRADE_VERSION extends LedgerUpgradeType(1)
  case object LEDGER_UPGRADE_BASE_FEE extends LedgerUpgradeType(2)
  case object LEDGER_UPGRADE_MAX_TX_SET_SIZE extends LedgerUpgradeType(3)
  case object LEDGER_UPGRADE_BASE_RESERVE extends LedgerUpgradeType(4)
}