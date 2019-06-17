package Assignment2;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetExample {

	public void print(Set<String> tree)
	{
		if(tree.isEmpty())
		{
			System.out.println("Treeset empty");
		}
		else
		{
			System.out.println("treeset : " + tree);
		}
	}
	
	
	
	public static void main(String[] args) {
		Set<String> treeset = new TreeSet<String>();
		treeset.add("Tom");
		treeset.add("Dick");
		treeset.add("Zain");
		treeset.add("Harry");
		treeset.add("Asif");
		
		TreeSetExample treeex = new TreeSetExample();
		
		treeex.print(treeset);
		
	}
	
}
