package Assignment5;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Debug {

	public void showRecords(Set<String> set)
	{
		if(set.isEmpty())
		{
			System.out.println("Set is empty");
		}
		else
		{
			Iterator<String> iterator = set.iterator();
			while(iterator.hasNext())
			{
				System.out.println(iterator.next());
			}
		}
	}
	
	public static void main(String[] args) {
		
		Set<String> set = new HashSet<String>();
		set.add("Amy");
		set.add("Richard");
		set.add("Amy");
		set.add("Mark");
		set.add("Lourie");
		
		Debug debug = new Debug();
		System.out.println("Printing the record....");
		debug.showRecords(set);

	}
}
