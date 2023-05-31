
package Banking.Main_Operation;

import java.util.Scanner;

public class Banking{

    private void welcome(){
        
        String prompt = " Welcome to Neko First Republic Bank\n" + 
                        "Please choose from the following:\n" +
                        "1) New User\n"+
                        "2) Returning User\n"+
                        "3) Help\n" + 
                        "0) Quit\n";
    }
    public static void main(String[] args) {
        boolean quit = false;

        BankingSystem bs = new BankingSystem();
        Account act = new Account(null, null, null, null, null, 0);

        Scanner scan = new Scanner(System.in);


        int input = scan.nextInt();
        scan.close();
        
        if(input < 0 || input > 4){ System.out.println("ERROR"); }
        if(input == 1){
            bs.newAccount();
        }
        if(input == 2){
            bs.returningUsers();
        }
        if(input == 3){

        }
         

    }
}