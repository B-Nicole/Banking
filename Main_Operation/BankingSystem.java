package Banking.Main_Operation;

import java.util.Scanner;

class Account{

    public String name; 
    public String username;
    public String password; 

    public Integer accountNumber;
    public Integer accountBalance;
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
        Account act = new Account(null, null, null, null, null, 0);
        act.name = scan.nextLine();
        
        scan.close();
   }

    /**
     * Password must be at least 8 characters
     * Contain at least 1 uppercase letter
     * Contain at least 1 lowercase letter
     * Must contain at least 1 number 
     * Must contain a special character
    */
   public void passwordValidation(String password){
    
   }
   public void returningUsers(){


   }
}
