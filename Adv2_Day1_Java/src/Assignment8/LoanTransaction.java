package Assignment8;

public class LoanTransaction extends Thread {

	private BankFund bankFund;
	private int customerId;
	private double loanAmount;
	
	public LoanTransaction(BankFund bankFund, int customerId, double loanAmount) {
		this.bankFund = bankFund;
		this.customerId = customerId;
		this.loanAmount = loanAmount;
	}
	
	public synchronized void run()
	{
		try
		{
			bankFund.checkFund(loanAmount);
			
		Thread.sleep((long)(2000*Math.random()));
			//Thread.sleep(500);
		
			double fundAvailable = bankFund.debitFund(loanAmount);
			System.out.println(customerId + " The loan of amount " + loanAmount + " is disbursed. Please collect cash ");
			
			System.out.println("Fund left in the bank is : " + fundAvailable);
		}
		catch(InsufficientFundException in)
		{
			System.out.println("Sorry!! " + customerId + " Please try some other day today we are short of funds");
		} catch (InterruptedException e) {
			System.out.println(e.getMessage());
		}
		
		
	}
	
	
	
}
