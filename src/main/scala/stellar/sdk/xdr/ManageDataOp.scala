// Automatically generated by xdrgen
// DO NOT EDIT or your changes may be overwritten

package stellar.sdk.xdr

import stellar.sdk.xdr._

// === xdr source ============================================================

//  struct ManageDataOp
//  {
//      string64 dataName;
//      DataValue* dataValue; // set to null to clear
//  };

//  ===========================================================================

case class ManageDataOp (
  dataName: String64, 
  dataValue: Option[DataValue]
) {
  def encode(stream: XdrDataOutputStream): Unit = {
    dataName.encode(stream)
    dataValue match {
      case Some(x) => 
        stream.writeInt(1)
        x.encode(stream)
      case None => stream.writeInt(0)
    }
  }
}

object ManageDataOp {
  def decode(stream: XdrDataInputStream): ManageDataOp = ManageDataOp(
    String64.decode(stream),
    if (stream.readInt == 0) None else Some(DataValue.decode(stream))
  )
}
