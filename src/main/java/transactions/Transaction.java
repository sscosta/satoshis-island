package transactions;

import java.security.PublicKey;

public class Transaction {

    public PublicKey ownerPk;
    public Transaction prev;
    public String hash;
    public byte[] prevOwnerMAC;

}
