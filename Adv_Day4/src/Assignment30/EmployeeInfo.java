package Assignment30;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
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
		
		/*
		 * SimpleDateFormat sdf = new SimpleDateFormat("yyyy MMM dd"); Calendar calendar
		 * = new GregorianCalendar(2013,0,31);
		 * System.out.println(sdf.format(calendar.getTime()));
		 */
		
		Employee emp1 = new Employee();
		Employee emp2 = new Employee();
		emp1.setEmployeeID(1001);
		emp2.setEmployeeID(1002);
		emp1.setEmployeeName("Rahil");
		emp2.setEmployeeName("Ajay");
		emp1.setDateOfBirth(new GregorianCalendar(1995,6,3));
		
		
		List list = new ArrayList(); 
		list.add(emp1);
		list.add(emp2);

		for(Object e : list)
		{
			System.out.println(e);
		}
		
	}

}
