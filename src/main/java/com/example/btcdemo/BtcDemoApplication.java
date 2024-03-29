package com.example.btcdemo;

import com.google.gson.GsonBuilder;

import java.util.ArrayList;


//@SpringBootApplication
public class BtcDemoApplication {
    public static ArrayList<Block> blockchain = new ArrayList<Block>();
    public static int difficulty = 5;
    public static void main(String[] args) {
        blockchain.add(new Block("Hi im the first block", "0"));
        System.out.println("Trying to Mine block 1... ");
        blockchain.get(0).mineBlock(difficulty);
        blockchain.add(new Block("Yo im the second block",blockchain.get(blockchain.size()-1).hash));
                System.out.println("Trying to Mine block 2... ");
        blockchain.get(1).mineBlock(difficulty);
        blockchain.add(new Block("Hey im the third block",blockchain.get(blockchain.size()-1).hash));
                System.out.println("Trying to Mine block 3... ");
        blockchain.get(2).mineBlock(difficulty);
        blockchain.add(new Block("Try to transaction", blockchain.get(blockchain.size()-1).hash));
        blockchain.get(3).newTransation("dsfalkjfdsa","daslfjklsdjaf","100BTC", difficulty);
        System.out.println("Blockchain is Valid: " + isChainValid());
        String blockchainJson = new GsonBuilder().setPrettyPrinting().create().toJson(blockchain);
        System.out.println("The block chain: ");
        System.out.println(blockchainJson);

    }

    public static Boolean isChainValid() {
        Block currentBlock;
        Block previousBlock;
//loop through blockchain to check hashes:
        for(int i=1; i < blockchain.size(); i++) {
            currentBlock = blockchain.get(i);
            previousBlock = blockchain.get(i-1);
//compare registered hash and calculated hash:
            if(!currentBlock.hash.equals(currentBlock.caculateHash()) ){
                System.out.println("Current Hashes not equal");
                return false;
            }
//compare previous hash and registered previous hash
            if(!previousBlock.hash.equals(currentBlock.previousHash) ) {
                System.out.println("Previous Hashes not equal");
                return false;
            }
        }
        return true;
    }
}
