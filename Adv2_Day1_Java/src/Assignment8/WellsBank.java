package Assignment8;

public class WellsBank {

	public static void main(String[] args) throws InterruptedException {
		
		BankFund wellsBankFund = new BankFund(9000000);
		
		/*
		 * LoanTransaction loantransaction1 = new LoanTransaction(wellsBankFund, 1001,
		 * 5000000);
		 * 
		 * loantransaction1.start(); loantransaction1.join();
		 * 
		 * LoanTransaction loantransaction2 = new LoanTransaction(wellsBankFund, 1002,
		 * 5000000);
		 * 
		 * loantransaction2.start(); loantransaction2.join();
		 */
		
		LoanTransaction [] loantransactions = new LoanTransaction[100];
		
		for(int i = 0; i < loantransactions.length; i++)
		{
			loantransactions[i] = new LoanTransaction(wellsBankFund, (1000 + i), 1000000);
		}
		
		for(int i = 0; i < loantransactions.length; i++)
		{
			loantransactions[i].start();
			loantransactions[i].join();

		}
		
	}
	
	
	
}
