package com.example.btcdemo;
import java.util.Date;

public class Block {
    public String hash;
    public String previousHash;
    private String data;
    private long timeStamp;

    private Transaction transaction;
    /**
     * 'sender': sender,
     *          *             'recipient': recipient,
     *          *             'amount': amount,
     */
    private int nonce;

    public Block(String data, String previousHash) {
        this.previousHash = previousHash;
        this.data = data;
        this.timeStamp = new Date().getTime();
        this.hash = caculateHash();
    }

    public String caculateHash() {
        String calculatehash = StringUtil
                .applySha256( previousHash + Long.toString(timeStamp) + data +Integer.toString(nonce));
        return calculatehash;
    }

    public void mineBlock(int difficulty) {
        String target = new String(new char[difficulty]).replace('\0', '0');
        //Create a string withdifficulty * "0"
        while(!hash.substring( 0, difficulty).equals(target)) {
            nonce ++;
            hash = caculateHash();
        }
        System.out.println("Block Mined!!! : " + hash);
    }

    public void newTransation(String sender, String recipient, String amount, int difficulty){
        /**
         *  'sender': sender,
         *  'recipient': recipient,
         *  'amount': amount,
         */
        /*nonce++;
        hash = caculateHash();*/
        String target = new String(new char[difficulty]).replace('\0', '0');
        while(!hash.substring( 0, difficulty).equals(target)) {
            nonce ++;
            hash = caculateHash();
        }
        transaction = new Transaction(sender, recipient, amount);
        System.out.println("Successful transaction,hash:"+hash);
    }


}
