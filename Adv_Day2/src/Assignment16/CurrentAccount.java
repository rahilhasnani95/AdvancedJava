package Assignment16;

public class CurrentAccount extends Account {

	private double currentAmount;
	
	public CurrentAccount()
	{
		
	}

	public CurrentAccount(int accountNo, Customer customer, double balance, double currentAmount) {
		super(accountNo, customer, balance);
		this.currentAmount = currentAmount;
	}
	public void withdraw(double amount)
	{
		if(amount < balance)
		{
			balance = balance - amount;
		}
		else if((balance - amount) >= - currentAmount)
		{
			balance = balance - amount;
			currentAmount = currentAmount + balance;
			balance=0;
		}
		else
		{
			System.out.println("Insuffiecient funds left");
		}
		
	}
	public double getEligibilityAmount()
	{
		 return -currentAmount;
	}
	
	
}

