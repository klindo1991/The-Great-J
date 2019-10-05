public class SavingsAccount extends BankAccount
{
   private boolean active;

   public SavingsAccount(float bal)
   {
      super.bal();
      if(bal < 25)
            active = false;
      else
            active = true;
   }
   public void withdraw(float amount)
   {
      if(active)
              super.withdraw(amount);
   }
   public void deposit(float amount)
   {
      if(!active)
      {
              if(amount + balance < 25)
                        return;
      }
              super.deposit(amount);
   }
   public void printStatus()
   {
         System.out.println("Balance: " + balance);

   }
 }
