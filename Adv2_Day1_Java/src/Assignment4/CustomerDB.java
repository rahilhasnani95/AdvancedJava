package Assignment4;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class CustomerDB {

	private List<Customer> customerList = new ArrayList<Customer>();
	
	public boolean saveCustomer(Customer customer)
	{
		boolean status = false;
		
		status = customerList.add(customer);
		
		return status;
	}

	public List<Customer> getCustomerList() {
		return customerList;
	}

	public Set<Integer> getLoanAvailedCustomers() {
		
		Set<Integer> loanAvailedCustomers = new TreeSet<Integer>();
		for(Customer c : customerList)
		{
			if(c.isLoanAvailed())
			{
				loanAvailedCustomers.add(c.getCustomerId());
			}
		}
		return loanAvailedCustomers;
	}
	
	
	
}
