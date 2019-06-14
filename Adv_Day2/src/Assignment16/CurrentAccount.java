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
	@Override
	public double balanceEnquiry()
	{
		System.out.print("Balance in account is " );
		return (Math.abs(balance) + Math.abs(currentAmount));
	}

	public void withdraw(double amount)
	{

		if(amount <= (Math.abs(balance) + Math.abs(currentAmount)))
		{
			if(amount < balance)
			{
				currentAmount = currentAmount;
				
			}
			else
			{
				currentAmount = amount - (Math.abs(balance) + Math.abs(currentAmount));
			}
			if(amount >= balance)
			{
				balance = 0;
				System.out.println("Amount withdrawn: " + amount);
			}
			else
				{
				balance = balance - amount;
				System.out.println("Amount withdrawn: " + amount);
				}
		}
		else
		{
			System.out.println("Insuffucient Balance");
		}
	}
	public double getEligibilityAmount()
	{
		return Math.abs(currentAmount);
	}
	
	
	
	
	
	public double getCurrentAmount() {
		return currentAmount;
	}
	
	
}

