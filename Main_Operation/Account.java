package Banking.Main_Operation;

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
