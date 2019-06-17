package Assignment4;

import java.util.List;
import java.util.Set;

public class WellsBank {

	private static final CustomerDB customerDB = new CustomerDB();
	
	private static final Login login = new Login();
	
	public static void main(String[] args) {
	
		Customer cust1 = new Customer(1001, "Tan", false);
		customerDB.saveCustomer(cust1);
		login.addLogin(1001, "Wells123");
		
		Customer cust2 = new Customer(1002, "John", true);
		customerDB.saveCustomer(cust2);
		login.addLogin(1002, "Wells123");
		
		Customer cust3 = new Customer(1003, "Sam", true);
		customerDB.saveCustomer(cust3);
		login.addLogin(1003, "Mys@123");
		
		Customer cust4 = new Customer(1004, "Raj", false);
		customerDB.saveCustomer(cust4);
		login.addLogin(1004, "Wells123");
		
//display details of all customers
		System.out.println();
		List<Customer> customersList = customerDB.getCustomerList();
		
		if(customersList.isEmpty())
		{
			System.out.println("Customers list is empty");
		}
		else
		{
			printCustomersList(customersList);
		}	
		
		//displaylist of customers who have availed the loans
		System.out.println();
		System.out.println("Customer Id whose loan are availed : ");
		Set<Integer> loanAvailedCust = customerDB.getLoanAvailedCustomers();
		
		for(int custid : loanAvailedCust)
		{
			System.out.println(custid);
		}
	}
	
	public static void printCustomersList(List<Customer> customersList)
	{
		System.out.println("Customer ID " + "\t Customer Name " + "\t Availed Loan?");
		String loanavailed;
		for(Customer c : customersList)
		{
			System.out.print(c.getCustomerId() + "\t");
			System.out.print(c.getCustomerName() + "\t");
			
			if(c.isLoanAvailed()== true)
			{
				loanavailed = "YES";
			}
			else
			{
				loanavailed = "NO";
			}
			System.out.print(loanavailed);
			System.out.println();
		}
		
	}
	
	
	
}
