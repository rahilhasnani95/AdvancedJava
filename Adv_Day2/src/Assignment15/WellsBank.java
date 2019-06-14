package Assignment15;

public class WellsBank {

	public static void main(String[] args) {

		
		System.out.println("****Saving Account****");
		Customer john = new Customer(1, "John", "Sugar Land", 77479);
		
		SavingsAccount johnSA = new SavingsAccount(101, john, 1000);
		
		transaction(johnSA, 1000);
		johnSA.withdraw(1600);
		System.out.println(johnSA.balanceEnquiry());
		System.out.println(); System.out.println("****Current Account****");
		
		Customer jenny = new Customer(2, "Jenny", "Dallas", 77000);
		CurrentAccount jennyCA = new CurrentAccount(201, jenny, 500, 2000);

		transaction(jennyCA, 1500);
		
		System.out.println(jennyCA.balanceEnquiry());

		jennyCA.withdraw(1000);
		System.out.println(jennyCA.balanceEnquiry());

		jennyCA.withdraw(4000);
		System.out.println(jennyCA.balanceEnquiry());
		System.out.println();
		
		jennyCA.withdraw(3000);
		System.out.println(jennyCA.balanceEnquiry());
		System.out.println(jennyCA.getCurrentAmount());
		
	}
	
	  public static void transaction(Account account, double amount) 
	  {  
		  account.deposit(amount); 
		
	  }
	 
}
