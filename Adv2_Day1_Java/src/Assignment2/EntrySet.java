package Assignment2;

import java.util.HashSet;
import java.util.Set;

public class EntrySet {

	public void printSetRecords(Set<String> hashset)
	{
		System.out.println(hashset.size());
		
		  if(hashset.isEmpty()) 
		  {
			  System.out.println("The set is empty"); 
		  }
		  else
		  {
			  System.out.println("Set elements are : " + hashset);
		  }
		 
		
		//hashset.forEach(System.out::println);
	}
	
	
	public static void main(String[] args) {
	
		Set<String> set = new HashSet<>();
		/*
		 * System.out.println(set.add("First Entry"));
		 * System.out.println(set.add("Second Entry"));
		 * System.out.println(set.add("Third Entry"));
		 * System.out.println(set.add("First Entry"));
		 */
	
		set.add("First Entry");
		
		set.add("Third Entry");
		set.add("First Entry");
		set.add("Second Entry");
		EntrySet setDemo = new EntrySet();
		setDemo.printSetRecords(set);
		
		Set<String> emptySet = new HashSet<String>();
		setDemo.printSetRecords(emptySet);
		
	}
	
}
