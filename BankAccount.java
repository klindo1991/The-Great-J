public class BankAccount{
    private float balance;
    private float numDeposit;
    private float numWithdraw;

    public BankAccount()
    {
      balance = 0;
      numDeposit = 0;
      numWithdraw = 0;
    }
    public BankAccount(float bal)
    {
      balance = bal
    }
    public void deposit(float amount){
       balance += amount;
       numDeposit++;
      }
    public void withdraw(float amount){
       balance -= amount;
       numWithdraw++;
    }
    public float getBalance(){
       return balance;
    }
}
