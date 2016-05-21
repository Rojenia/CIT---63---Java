import java.text.DecimalFormat;
	
public class BankAccountDemo
{
	public static void main(String[] args)
	{
		BankAccount account1 = new BankAccount (1200.0);
		BankAccount account2 = new BankAccount (account1);
		
		DecimalFormat dollar = new DecimalFormat ("#,##0.00");
        
        System.out.println();
        
        
        System.out.println("The balance in account #1 is $" +
                           dollar.format(account1.getBalance()));
        
        
        System.out.println("The balance in account #2 is $" +
                           dollar.format(account2.getBalance()));
        
        System.out.println();
        
        System.out.println("We are depositing $200 and then withrawing $50 from account #1. After that we will create a thrid" +
                           " bank account with the same ammount of money as the first.");
        System.out.println();
        
        account1.deposit(200);
        account1.withdraw(50);
        
        BankAccount account3 = new BankAccount (account1);
        
        System.out.println("The balance in account #1 is now $" +
                           dollar.format(account1.getBalance()));
        
        System.out.println("The balance in account #3 is $" +
                           dollar.format(account3.getBalance()));

        
	}
}