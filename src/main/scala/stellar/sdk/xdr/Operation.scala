// Automatically generated by xdrgen
// DO NOT EDIT or your changes may be overwritten

package stellar.sdk.xdr

import stellar.sdk.xdr._

// === xdr source ============================================================

//  struct Operation
//  {
//      // sourceAccount is the account used to run the operation
//      // if not set, the runtime defaults to "sourceAccount" specified at
//      // the transaction level
//      AccountID* sourceAccount;
//  
//      union switch (OperationType type)
//      {
//      case CREATE_ACCOUNT:
//          CreateAccountOp createAccountOp;
//      case PAYMENT:
//          PaymentOp paymentOp;
//      case PATH_PAYMENT:
//          PathPaymentOp pathPaymentOp;
//      case MANAGE_OFFER:
//          ManageOfferOp manageOfferOp;
//      case CREATE_PASSIVE_OFFER:
//          CreatePassiveOfferOp createPassiveOfferOp;
//      case SET_OPTIONS:
//          SetOptionsOp setOptionsOp;
//      case CHANGE_TRUST:
//          ChangeTrustOp changeTrustOp;
//      case ALLOW_TRUST:
//          AllowTrustOp allowTrustOp;
//      case ACCOUNT_MERGE:
//          AccountID destination;
//      case INFLATION:
//          void;
//      case MANAGE_DATA:
//          ManageDataOp manageDataOp;
//      case BUMP_SEQUENCE:
//          BumpSequenceOp bumpSequenceOp;
//      }
//      body;
//  };

//  ===========================================================================

case class Operation (
  sourceAccount: Option[AccountID], 
  body: Operation.Body
) {
  def encode(stream: XdrDataOutputStream): Unit = {
    sourceAccount match {
      case Some(x) => 
        stream.writeInt(1)
        x.encode(stream)
      case None => stream.writeInt(0)
    }
    body.encode(stream)
  }
}

object Operation {
  def decode(stream: XdrDataInputStream): Operation = Operation(
    if (stream.readInt == 0) None else Some(AccountID.decode(stream)),
    Body.decode(stream)
  )

  sealed trait Body {
    def encode(stream: XdrDataOutputStream): Unit
  }

  object Body {
    def decode(stream: XdrDataInputStream): Body = OperationType.decode(stream) match {
      case OperationType.CREATE_ACCOUNT => CREATE_ACCOUNT(CreateAccountOp.decode(stream))
      case OperationType.PAYMENT => PAYMENT(PaymentOp.decode(stream))
      case OperationType.PATH_PAYMENT => PATH_PAYMENT(PathPaymentOp.decode(stream))
      case OperationType.MANAGE_OFFER => MANAGE_OFFER(ManageOfferOp.decode(stream))
      case OperationType.CREATE_PASSIVE_OFFER => CREATE_PASSIVE_OFFER(CreatePassiveOfferOp.decode(stream))
      case OperationType.SET_OPTIONS => SET_OPTIONS(SetOptionsOp.decode(stream))
      case OperationType.CHANGE_TRUST => CHANGE_TRUST(ChangeTrustOp.decode(stream))
      case OperationType.ALLOW_TRUST => ALLOW_TRUST(AllowTrustOp.decode(stream))
      case OperationType.ACCOUNT_MERGE => ACCOUNT_MERGE(AccountID.decode(stream))
      case OperationType.INFLATION => INFLATION
      case OperationType.MANAGE_DATA => MANAGE_DATA(ManageDataOp.decode(stream))
      case OperationType.BUMP_SEQUENCE => BUMP_SEQUENCE(BumpSequenceOp.decode(stream))
      case d => throw new IllegalArgumentException(s"OperationType value $d is invalid")
    }

    case class CREATE_ACCOUNT(x: CreateAccountOp) extends Body {
      def encode(stream: XdrDataOutputStream): Unit = {
        OperationType.CREATE_ACCOUNT.encode(stream)
        x.encode(stream)
      }
    }
    case class PAYMENT(x: PaymentOp) extends Body {
      def encode(stream: XdrDataOutputStream): Unit = {
        OperationType.PAYMENT.encode(stream)
        x.encode(stream)
      }
    }
    case class PATH_PAYMENT(x: PathPaymentOp) extends Body {
      def encode(stream: XdrDataOutputStream): Unit = {
        OperationType.PATH_PAYMENT.encode(stream)
        x.encode(stream)
      }
    }
    case class MANAGE_OFFER(x: ManageOfferOp) extends Body {
      def encode(stream: XdrDataOutputStream): Unit = {
        OperationType.MANAGE_OFFER.encode(stream)
        x.encode(stream)
      }
    }
    case class CREATE_PASSIVE_OFFER(x: CreatePassiveOfferOp) extends Body {
      def encode(stream: XdrDataOutputStream): Unit = {
        OperationType.CREATE_PASSIVE_OFFER.encode(stream)
        x.encode(stream)
      }
    }
    case class SET_OPTIONS(x: SetOptionsOp) extends Body {
      def encode(stream: XdrDataOutputStream): Unit = {
        OperationType.SET_OPTIONS.encode(stream)
        x.encode(stream)
      }
    }
    case class CHANGE_TRUST(x: ChangeTrustOp) extends Body {
      def encode(stream: XdrDataOutputStream): Unit = {
        OperationType.CHANGE_TRUST.encode(stream)
        x.encode(stream)
      }
    }
    case class ALLOW_TRUST(x: AllowTrustOp) extends Body {
      def encode(stream: XdrDataOutputStream): Unit = {
        OperationType.ALLOW_TRUST.encode(stream)
        x.encode(stream)
      }
    }
    case class ACCOUNT_MERGE(x: AccountID) extends Body {
      def encode(stream: XdrDataOutputStream): Unit = {
        OperationType.ACCOUNT_MERGE.encode(stream)
        x.encode(stream)
      }
    }
    case object INFLATION extends Body {
      def encode(stream: XdrDataOutputStream): Unit = {
        OperationType.INFLATION.encode(stream)
      }
    }
    case class MANAGE_DATA(x: ManageDataOp) extends Body {
      def encode(stream: XdrDataOutputStream): Unit = {
        OperationType.MANAGE_DATA.encode(stream)
        x.encode(stream)
      }
    }
    case class BUMP_SEQUENCE(x: BumpSequenceOp) extends Body {
      def encode(stream: XdrDataOutputStream): Unit = {
        OperationType.BUMP_SEQUENCE.encode(stream)
        x.encode(stream)
      }
    }
  }
}
