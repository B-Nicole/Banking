package Banking.Main_Operation;

import java.util.Scanner;

class Account{

    private String name; 
    private String username;
    private String password; 

    private Integer accountNumber;
    private Integer accountBalance;
    public double amount;

    public Account(String name, String username, String password, Integer accountNumber, Integer accountBalance, double amount){
        this.name = name;
        this.username = username;
        this.password = password;
        this.accountNumber = accountNumber;
        this.amount = amount;
        this.accountBalance = accountBalance;
    }

}

public class BankingSystem {
  

   public void newAccount(){

        Scanner scan = new Scanner(System.in);
        scan.close();
   }
   public void returningUsers(){


   }
}
