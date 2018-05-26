// Automatically generated by xdrgen
// DO NOT EDIT or your changes may be overwritten

package stellar.sdk.xdr

import stellar.sdk.xdr._

// === xdr source ============================================================

//  struct TimeBounds
//  {
//      uint64 minTime;
//      uint64 maxTime; // 0 here means no maxTime
//  };

//  ===========================================================================

case class TimeBounds (
  minTime: Uint64, 
  maxTime: Uint64
) {
  def encode(stream: XdrDataOutputStream): Unit = {
    minTime.encode(stream)
    maxTime.encode(stream)
  }
}

object TimeBounds {
  def decode(stream: XdrDataInputStream): TimeBounds = TimeBounds(
    Uint64.decode(stream),
    Uint64.decode(stream)
  )
}
