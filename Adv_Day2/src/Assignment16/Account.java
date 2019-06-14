package Assignment16;

public abstract class Account {

	private int accountNo;
	private Customer customer;
	protected double balance;
	
	public Account()
	{
		
	}
	public Account(int accountNo, Customer customer, double balance) {
		this.accountNo = accountNo;
		this.customer = customer;
		this.balance = balance;
	}

	public Customer getCustomer() {
		return customer;
	}
	
	public double balanceEnquiry()
	{
		System.out.print("Balance in account is " );
		return balance;
	}
	public abstract void withdraw(double amount);
	
	public void deposit(double amount)
	{
		this.balance = this.balance + amount;
		System.out.println("Deposited amount : " + amount);
		//System.out.println("Updated balance is : " + balance);
	}
}
