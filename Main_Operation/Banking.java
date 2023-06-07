
package Banking.Main_Operation;
import java.util.Scanner;

public class Banking{

    public static void welcome(){
        
        String prompt = " Welcome to Neko First Republic Bank\n" + 
                        "Please choose from the following:\n" +
                        "1) New User\n"+
                        "2) Returning User\n"+
                        "3) Help\n" + 
                        "0) Quit\n";
    }

    public static void main(String[] args) {
        boolean quit = false;
        int input;

        Scanner scan = new Scanner(System.in);
        BankingSystem bs = new BankingSystem();
        Account act = new Account(null, null, null, null, null, 0);

      


        while(!quit){
            welcome();
            input = scan.nextInt();
            // if else statements for the choices here
            // not valid input redo the prompt
        } 


        scan.close();
        
    
         

    }
}