package Assignment26;

public class SavingsAccount extends Account{

	private double minimumBalance = 500;
	private int interestRate = 12;
	
	public SavingsAccount()
	{
		
	}

	public SavingsAccount(int accountNo, Customer customer, double balance) 
	{
		super(accountNo, customer, balance);
	}
	
	public void withdraw(double amount) throws InsuffiecientBalanceException 
	{
		if((balance - amount) >= minimumBalance)
		{
			balance = balance-amount;
			System.out.println("Amount withdrawn successfully: " + amount);
			System.out.println("Balance Left : " + balance);
		}
		else 
		{
			throw new InsuffiecientBalanceException();
			//System.out.println("Your minimum balance should be 500 if you remove " + amount + " balance left will be " + (balance-amount));		
		}
	}
	
	public void calculateInterest()
	{
		System.out.println("Interest calculated: " + (balance*(interestRate/100)));
	}
	
	
}
