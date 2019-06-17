package Assignment2;

import java.util.HashSet;
import java.util.Set;
import java.util.LinkedHashSet;

public class LinkedHashSetExample {

	public void printSetRecords(Set<String> linkedhashset)
	{
		System.out.println(linkedhashset.size());
		
		  if(linkedhashset.isEmpty()) 
		  {
			  System.out.println("The set is empty"); 
		  }
		  else
		  {
			  System.out.println("Set elements are : " + linkedhashset);
		  }
		 
		
		//hashset.forEach(System.out::println);
	}
	
	
	public static void main(String[] args) {
		
		Set<String> set = new LinkedHashSet<>();
		/*
		 * System.out.println(set.add("First Entry")); 
		 * System.out.println(set.add("Second Entry"));
		 * System.out.println(set.add("Third Entry"));
		 * System.out.println(set.add("First Entry"));
		 */
	
		set.add("First Entry");
		
		set.add("First Entry");
		set.add("Third Entry");
		set.add("Second Entry");
		LinkedHashSetExample setDemo = new LinkedHashSetExample();
		
		setDemo.printSetRecords(set);
		
		Set<String> emptySet = new LinkedHashSet<>();
		setDemo.printSetRecords(emptySet);
	}
	
}
