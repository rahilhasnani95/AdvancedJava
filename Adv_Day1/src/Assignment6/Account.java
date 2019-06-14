package Assignment6;
import Assignment5.*;

public class Account {

	public static void main(String[] args) {

		Customer cust1 = new Customer("Paul", "J", "Anderson", "Paul@Wellsfargo.com", "Salary", "3rd Jan, 1985", 'M', "Single");
		System.out.println(cust1.toString());
		
		//System.out.println(cust1.getAccountNumber());
	//	System.out.println(cust1.getCustomerId());
		Customer cust2 = new Customer("aul", "J", "Anderson", "Paul@Wellsfargo.com", "Salary", "3rd Jan, 1985", 'M', "Single");
		System.out.println(cust2.toString());
		
		
	//	System.out.println(cust1.getAccountNumber());
	//	System.out.println(cust1.getCustomerId());
	}

}

