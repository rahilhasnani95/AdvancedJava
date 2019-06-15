package Assignment30;

import java.util.ArrayList;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;

public class EmployeeInfo {

	public static void main(String[] args) {
		/*
		 * List <Employee> list = new ArrayList<Employee>();
		 * 
		 * list.add(new Employee(1, "Rahil", new Date("6 March 1995"))); list.add(new
		 * Employee(2, "Ajay", new Date("16 April 1985"))); list.add(new Employee(3,
		 * "Rahul", new Date("2 Jan 1990")));
		 */
		Employee emp1 = new Employee();
		Employee emp2 = new Employee();
		emp1.employeeID = 1;
		emp2.employeeID = 2;
		emp1.employeeName = "Rahil";
		emp2.employeeName = "Ajay";
		
		List list = new ArrayList(); 
		list.add(emp1);
		list.add(emp2);
		
		for(Object e : list)
		{
			System.out.println(e);
		}
		
	}

}
