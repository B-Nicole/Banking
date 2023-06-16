
package Banking.Main_Operation;
import java.util.Scanner;

public class Banking{

    public static void main(String[] args) {
        boolean quit = false;
        int input;

        Scanner scan = new Scanner(System.in);
        BankingSystem bs = new BankingSystem();
        bs.newAccount();
        

      
        scan.close();
        
    
         

    }
}