package Assignment13;

public class WellsBank {

	public static void main(String[] args) {

		System.out.println("****Saving Account****");
		Customer john = new Customer(1, "John", "Sugar Land", 77479);
		
		SavingsAccount johnSA = new SavingsAccount(101, john, 1000);
		johnSA.deposit(1000);
		System.out.println(johnSA.balanceEnquiry());
		johnSA.withdraw(1600);
		
		//johnSA.withdraw(1400);
		//johnSA.deposit(200);
		System.out.println(johnSA.balanceEnquiry());
		System.out.println();System.out.println("****Current Account****");
		
		Customer jenny = new Customer(2, "Jenny", "Dallas", 77000);
		CurrentAccount jennyCA = new CurrentAccount(201, jenny, 500, 3000);
		
		jennyCA.deposit(1500);
		System.out.println(jennyCA.balanceEnquiry());
		
		jennyCA.withdraw(4000);
		System.out.println(jennyCA.balanceEnquiry());
		System.out.println(jennyCA.getEligibilityAmount());


		jennyCA.withdraw(2000);
		System.out.println(jennyCA.balanceEnquiry());
		System.out.println(jennyCA.getEligibilityAmount());

		/*
		 * jennyCA.withdraw(1900); System.out.println(jennyCA.balanceEnquiry());
		 * System.out.println(jennyCA.getEligibilityAmount());
		 * 
		 * jennyCA.withdraw(200); System.out.println(jennyCA.balanceEnquiry());
		 * System.out.println(jennyCA.getEligibilityAmount());
		 */

	}

}
