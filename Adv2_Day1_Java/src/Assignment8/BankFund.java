package Assignment8;

public class BankFund {

	private double fund;
	
	public BankFund(double fund)
	{
		this.fund = fund;
	}
	
	public int checkFund(double amount) throws InsufficientFundException
	{
		if(fund < amount)
		{
			throw new InsufficientFundException();
		}
		 return 0;
	}
	
	public synchronized double debitFund(double amount)
	{
		fund = fund - amount;
		return fund;
	}
	
}
