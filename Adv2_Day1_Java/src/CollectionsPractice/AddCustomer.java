package CollectionsPractice;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class AddCustomer {

	public void printCustomers(List<String> arrayList)
	{
		
		  Iterator i = arrayList.iterator(); System.out.println("Customers are : ");
		  while(i.hasNext()) { System.out.println(i.next()); }
		 
		
		//arrayList.forEach(System.out::println);
	}

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("Jack");
		list.add("Tom");
		list.add("Dick");
		list.add("Harry");
		
		AddCustomer ac = new AddCustomer();
		ac.printCustomers(list);
	}
	
}

