package Assignment7;

public class DepositTransaction extends Thread{

	private int transactionId;
	private Account account;
	private int customerId;
	private double amount;
	
	
	public DepositTransaction(int transactionId, Account account, int customerId, double amount) {
		this.transactionId = transactionId;
		this.account = account;
		this.customerId = customerId;
		this.amount = amount;
	}
	
	public synchronized void deposit(Account account, double amount)
	{
		account.setBalance(account.getBalance() + amount);
		System.out.println("Amount deposited : " + amount);
	}
	
	public void run()
	{
		deposit(account, amount);

		System.out.println("Transaction Id: " + transactionId + " transaction Completed!!! " + customerId + " thank you for depositing to the account " + account.getAccountNo());
	}

}
