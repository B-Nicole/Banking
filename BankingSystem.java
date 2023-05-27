package Banking;

import java.util.HashMap;
import java.util.LinkedList;

// class where each customer establishes their account and transactions 
class Transaction{
    private String date;
    private String type;
    private double amount;

    public Transaction(String date, String type, double amount){
        this.date = date;
        this.type = type;
        this.amount = amount;
    }

    public void statement(){
        return;
    }
}






public class BankingSystem {
    
    private HashMap<String, LinkedList<Transaction>> userTransactions;

    public BankingSystem(){
        userTransactions = new HashMap<>();
    }

    public void addTransaction(String userId, Transaction transaction){
        LinkedList<Transaction> transactions = userTransactions.getOrDefault(userId, new LinkedList<>());
        transactions.add(transaction);
        userTransactions.put(userId, transactions);
    }

    public LinkedList<Transaction> getTransactions(String userId){
        return userTransactions.getOrDefault(userId, new LinkedList<>());
    }
}
