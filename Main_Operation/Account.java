package Banking.Main_Operation;

class Account{

    public String name; 
    public String username;
    public String password; 

    public float  accountNumber;
    public int accountBalance;
    public double amount;

    public Account(String name, String username, String password, int accountNumber, int accountBalance, double amount){
      this.name = name;
      this.username = username;
      this.password = password;
      this.accountNumber = accountNumber;
      this.amount = amount;
      this.accountBalance = accountBalance;
    }

}
