package Assignment6;

public class InsufficientBalanceException extends Exception 
{

	public InsufficientBalanceException()
	{
		super("Insufficient balance in the account");	
	}
	
}
