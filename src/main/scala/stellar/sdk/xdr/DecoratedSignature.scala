// Automatically generated by xdrgen
// DO NOT EDIT or your changes may be overwritten

package stellar.sdk.xdr

import stellar.sdk.xdr._

// === xdr source ============================================================

//  struct DecoratedSignature
//  {
//      SignatureHint hint;  // last 4 bytes of the public key, used as a hint
//      Signature signature; // actual signature
//  };

//  ===========================================================================

case class DecoratedSignature (
  hint: SignatureHint, 
  signature: Signature
) {
  def encode(stream: XdrDataOutputStream): Unit = {
    hint.encode(stream)
    signature.encode(stream)
  }
}

object DecoratedSignature {
  def decode(stream: XdrDataInputStream): DecoratedSignature = DecoratedSignature(
    SignatureHint.decode(stream),
    Signature.decode(stream)
  )
}