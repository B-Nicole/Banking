package Banking.Main_Operation;

import java.util.Random;
import java.util.Scanner;

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
    act.routingNumber = routingGeneration();
    act.accountBalance = 0;
     
    System.out.println("Account Number: " + act.accountNumber);
    System.out.println("Routing Number: " + act.routingNumber);
    System.out.println("Balance: " + act.accountBalance);
    System.out.println("Username: " + act.username);
    System.out.println("Password: " + act.password);
    scan.close();
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

  /*public void statement( ){
    System.out.println("Account Number: " + act.accountNumber);
    System.out.println("Routing Number: " + act.routingNumber);
    System.out.println("Balance: " + act.accountBalance);
    System.out.println("Username: " + act.username);
    System.out.println("Password: " + act.password);

  }*/


}
