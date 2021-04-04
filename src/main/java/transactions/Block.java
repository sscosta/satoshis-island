package transactions;

import java.sql.Timestamp;
import java.util.LinkedList;

public class Block {
    public String prevHash;
    public long nonce;
    public final LinkedList<Transaction> transactions = new LinkedList<Transaction>();
    public Timestamp ts;
}
