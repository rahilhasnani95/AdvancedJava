package Assignment7;

public class Security {

	public void authorization(Account account, Customer customer) throws UnAuthorizedWithdrawTransactionException
	{
		if(account.getCustomer().getCustomerId() != customer.getCustomerId())
		{
			throw new UnAuthorizedWithdrawTransactionException();
		}
	}
	
}
