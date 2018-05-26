// Automatically generated by xdrgen
// DO NOT EDIT or your changes may be overwritten

package stellar.sdk.xdr

import stellar.sdk.xdr._

// === xdr source ============================================================

//  enum OperationResultCode
//  {
//      opINNER = 0, // inner object result is valid
//  
//      opBAD_AUTH = -1,     // too few valid signatures / wrong network
//      opNO_ACCOUNT = -2,   // source account was not found
//      opNOT_SUPPORTED = -3 // operation not supported at this time
//  };

//  ===========================================================================

sealed class OperationResultCode (val i: Int) {
  def encode(stream: XdrDataOutputStream) = stream.writeInt(i)
}

object OperationResultCode {
  def decode(stream: XdrDataInputStream): OperationResultCode = stream.readInt() match {
    case 0 => OpINNER
    case -1 => opBAD_AUTH
    case -2 => opNO_ACCOUNT
    case -3 => opNOT_SUPPORTED
    case i => throw new IllegalArgumentException(s"OperationResultCode value $i is invalid")
  }

  case object OpINNER extends OperationResultCode(0)
  case object opBAD_AUTH extends OperationResultCode(-1)
  case object opNO_ACCOUNT extends OperationResultCode(-2)
  case object opNOT_SUPPORTED extends OperationResultCode(-3)
}