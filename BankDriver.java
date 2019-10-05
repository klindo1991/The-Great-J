import.java.util.*

public class BankDriver
{
    public static void main(String[] args)
    {
           float bal = (float)(Math.random() * 4000 + 1000);

           SavingsAccount sv = new SavingsAccount(bal);

           for(int i = 0; i < 4; i++)
           {
             float dep = (float)(Math.random() * 100);
             sv.deposit(dep);
             sv.printStatus();
             float with = (float)(Math.random() * 100)
             sv.withdraw(with);
             sv.printStatus();
           }

    }

}
