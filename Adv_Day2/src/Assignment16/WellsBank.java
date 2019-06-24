package Assignment16;

public class WellsBank {

	public static void main(String[] args) {

		System.out.println("*****Saving Account****");
		
		Customer john = new Customer(1, "John", "Sugar Land", 77479);
		
		SavingsAccount johnSA = new SavingsAccount(101, john, 1000);
		
		transaction(johnSA, 1000);
		johnSA.withdraw(1600);
		System.out.println(johnSA.balanceEnquiry());
		System.out.println(); System.out.println("****Current Account****");
		
		Customer jenny = new Customer(2, "Jenny", "Dallas", 77000);
		CurrentAccount jennyCA = new CurrentAccount(201, jenny, 500, 5000);

		transaction(jennyCA, 500);
		
		System.out.println(jennyCA.balanceEnquiry());

		jennyCA.withdraw(1000);
		System.out.println(jennyCA.balanceEnquiry());
		System.out.println(jennyCA.getEligibilityAmount());


		jennyCA.withdraw(200);
		System.out.println(jennyCA.balanceEnquiry());
		System.out.println(jennyCA.getEligibilityAmount());

		System.out.println();
		
		jennyCA.withdraw(5000);
		System.out.println(jennyCA.balanceEnquiry());
		System.out.println(jennyCA.getEligibilityAmount());
		
	}
	
	  public static void transaction(Account account, double amount) 
	  {  
		  account.deposit(amount); 
	  }
	 
}
