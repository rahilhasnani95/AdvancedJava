package Assignment17;

public class WellsBank {

	public static void main(String[] args) {

		System.out.println("****Saving Account****");
		
		Customer john = new Customer(1, "John", "Sugar Land", 77479);
		
		SavingsAccount johnSA = new SavingsAccount(101, john, 2000);
		
		transaction(johnSA, 1000);
		
		System.out.println(johnSA.balanceEnquiry());
		System.out.println(); System.out.println("****Current Account****");
		
		Customer jenny = new Customer(2, "Jenny", "Dallas", 77000);
		CurrentAccount jennyCA = new CurrentAccount(201, jenny, 500, 2000);

		transaction(jennyCA, 1500);
		
		System.out.println(jennyCA.balanceEnquiry());
	
	}
	
	  public static void transaction(Account account, double amount) 
	  {  
		  account.deposit(amount); 
		  account.withdraw(amount);
		  
	  }
	 
}
