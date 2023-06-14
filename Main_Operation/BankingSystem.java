package Banking.Main_Operation;

import java.util.Random;
import java.util.Scanner;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class BankingSystem {
  
  public static void welcome(){
        
    String prompt = " Welcome to Neko First Republic Bank\n" + 
                    "Please choose from the following:\n" +
                    "1) New User\n"+
                    "2) Returning User\n"+
                    "3) Help\n" + 
                    "0) Quit\n";
  }

  public void newAccount(){

      Scanner scan = new Scanner(System.in);
      Random rand = new Random();

      Account act = new Account(null, null, null, null, null, 0, 0);
      //Security seq = new Security();

      act.name = scan.nextLine();
      act.username = scan.nextLine();
      act.password = scan.nextLine();
      act.accountNumber = accountGeneration();
      act.accountBalance = 0;

      passwordValidation(act.password);
      scan.close();
  }

  public void passwordValidation(String password){
      
  }
  public static String accountGeneration(){
    
    String accountNumber = "NEKO";

    Random rand = new Random();
    for (int i = 0; i < 20; i++){
        int n = rand.nextInt(10) + 0;
        accountNumber += Integer.toString(n);
      }
      for (int i = 0; i < 15; i++){
        System.out.print(accountNumber.charAt(i));
      }

    return accountNumber;

  }


  public static String routingGeneration(){
    
    String routingNumber = "";

    Random rand = new Random();
    for (int i = 0; i < 20; i++){
        int n = rand.nextInt(10) + 0;
        routingNumber += Integer.toString(n);
      }
      for (int i = 0; i < 15; i++){
        System.out.print(routingNumber.charAt(i));
      }

    return routingNumber;

  }






  public static void Deposit(Account act, int amount){
    act.accountBalance +=amount;
  }
  public static void Widthdraw(Account act, int amount){
    act.accountBalance -= amount;
  }

  public void statement(Account act){
    System.out.print("Account: " + act.accountNumber + " ----------------- $" + act.accountBalance);
  }
}
