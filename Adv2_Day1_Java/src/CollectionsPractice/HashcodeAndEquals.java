package CollectionsPractice;

import java.util.HashSet;
import java.util.Set;

class Employee
{
	int id;

	public Employee(int id) 
	{
		this.id = id;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	@Override
	public boolean equals(Object emp) {
		if(this == emp) {
			return true;
		}
		
		Employee empObj = ((Employee) emp);
		
		if(this.id == empObj.id) return true;
		
		return false;
	}

	
	
	  @Override public int hashCode() 
	  {
		  Integer i = new Integer(this.id); 
		  return i.hashCode(); 
		}
	 
	  
	 
//	@Override
//	public int hashCode() {
//		Integer i = new Integer(this.id);
//		// TODO Auto-generated method stub
//		return i.hashCode()	 + this.name.hashCode();
//	}
	
	
	
	
	
}
public class HashcodeAndEquals
{
	public static void main(String[] args) {
		Set<Employee> empSet = new HashSet<>();
		
		Employee emp1  = new Employee(199);
		Employee emp2  = new Employee(199);
		
	
		
		empSet.add(emp1);
		empSet.add(emp2);
		
		for(Employee e: empSet) System.out.println(e.id);
		
		System.out.println(emp1.equals(emp2));
		
		System.out.println(emp1.hashCode());
		System.out.println(emp2.hashCode());
	
		
		System.out.println(empSet.size());
	}
}


	

