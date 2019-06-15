package Assignment31;

import java.util.ArrayList;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;

public class EmployeeInfo {

	public static void main(String[] args) {
		
	//	ArrayList<int> employeeId = new ArrayList<int>();

		ArrayList<Integer> employeeId = new ArrayList<Integer>();

		employeeId.add(1001);
		employeeId.add(1002);
	//	employeeId.add("1003");
		
		for(int count = 0; count < employeeId.size(); count++)
		{
			int x =  employeeId.get(count);
			System.out.println(x);
			//System.out.println(employeeId.get(count));
		}
		
		
		
		
	}

}
