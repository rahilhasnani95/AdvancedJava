package Assignment1;

import java.util.LinkedList;
import java.util.List;

public class AddCustomersLinkedList {
	
		public void printCustomers(LinkedList<String> linkedList)
		{
			
			 /* Iterator i = arrayList.iterator(); System.out.println("Customers are : ");
			  while(i.hasNext()) { System.out.println(i.next()); }
			 */
		
			linkedList.forEach(System.out::println);
		}

		public static void main(String[] args) {
			LinkedList<String> list = new LinkedList<String>();
			list.addFirst("Tom");
			list.addFirst("Rahil");
			list.add("Ajay");
			list.addLast("Ram");
			list.addLast("Akshay");
		

			AddCustomersLinkedList ac = new AddCustomersLinkedList();
			ac.printCustomers(list);
		}
		
	}
