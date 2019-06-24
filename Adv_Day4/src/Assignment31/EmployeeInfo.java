package Assignment31;

import java.util.ArrayList;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;

public class EmployeeInfo {

	public static void main(String[] args) {
		
	ArrayList<Integer> list = new ArrayList<Integer>();
	
	list.add(1001);
	list.add(1002);
	list.add(1003);
	
	for(int i = 0; i < list.size(); i++)
	{
		System.out.println(list.get(i));
	}
	
	//list.forEach(System.out::println);
	
	//System.out.println(list);
		
		
	}

}
