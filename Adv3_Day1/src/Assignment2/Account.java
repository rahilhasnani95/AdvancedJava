package Assignment2;

public class Account {

	private static int accountNo = 10;
	private Customer customer;
	protected int balance;

	public Account()
	{
		this.accountNo = ++ accountNo;
	}
	public Account(int accountNo, Customer customer, int balance) {
		this();
		this.customer = customer;
		this.balance = balance;
	}
	public int getAccountNo() {
		return accountNo;
	}
	public void setAccountNo(int accountNo) {
		this.accountNo = accountNo;
	}
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	
	
}