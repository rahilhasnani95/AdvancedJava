package Assignment8;

public class WellsBank {

	public static void main(String[] args) throws InterruptedException {
		
		BankFund wellsBankFund = new BankFund(9000000);
	
		LoanTransaction [] loantransactions = new LoanTransaction[100];
		
		for(int i = 0; i < loantransactions.length; i++)
		{
			loantransactions[i] = new LoanTransaction(wellsBankFund, (1000 + i), 250000);
		}
		
		for(int i = 0; i < loantransactions.length; i++)
		{
			loantransactions[i].start();

		}
		
	}
	
	
	
}
