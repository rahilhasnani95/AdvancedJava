package Assignment22;

import java.util.Vector;

public class Employee {

	public static void main(String[] args) {
		
		Vector empList = new Vector();
		int empNo = 1000;
		for(int count = 0; count < 5; count++)
		{
			++empNo;
			Integer i = empNo;
			empList.add(i);
				
		}
		
		System.out.println(empList);
		for(Object x: empList)
		{
			System.out.println(x);
		}
		
		
	}
	
}
