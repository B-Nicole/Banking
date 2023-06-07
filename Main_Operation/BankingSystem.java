package Banking.Main_Operation;

import java.util.Random;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class Account{

    public String name; 
    public String username;
    public String password; 

    public float  accountNumber;
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
        Random rand = new Random();

        Account act = new Account(null, null, null, null, null, 0);
        act.name = scan.nextLine();
        act.username = scan.nextLine();
        act.password = scan.nextLine();
        act.accountNumber = accountGeneration();
        act.accountBalance = 0;
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
  public static float accountGeneration(){
    
      float accountNumber = 0F;

      return accountNumber;

  }
}
