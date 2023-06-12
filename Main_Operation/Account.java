package Banking.Main_Operation;

class Account{

    public String name; 
    public String username;
    public String password; 

    public float  accountNumber;
    public float routingNumber;
    public int accountBalance;
    public double amount;

    public Account(String name, String username, String password, float accountNumber, float routingNumber, int accountBalance, double amount){
      this.name = name;
      this.username = username;
      this.password = password;
      this.accountNumber = accountNumber;
      this.routingNumber = routingNumber;
      this.amount = amount;
      this.accountBalance = accountBalance;
    }

}
