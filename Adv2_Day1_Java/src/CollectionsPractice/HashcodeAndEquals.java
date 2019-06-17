package CollectionsPractice;

import java.util.HashMap;
import java.util.Map;

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
	public String toString() {
		return "Employee [id=" + id + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		if (id != other.id)
			return false;
		return true;
	}
	
}

public class HashcodeAndEquals {

	public static void main(String[] args) {
		Employee emp1 = new Employee(1);
		Employee emp2 = new Employee(1);
		
		Map<Employee, String> map = new HashMap<Employee, String>();
		map.put(emp1, "one");
		map.put(emp2, "one");
		
		System.out.println(map.size());

		Integer i = new Integer(1);
		Integer i1 = new Integer(20/20);
		
		
		Map<Integer, String> map2 = new HashMap<Integer, String>();
		map2.put(i, "one");
		map2.put(i1, "onvhe");
		
		System.out.println(map2.size());

		Float f = new Float(1);
		Float f1 = new Float(20/20);
		
		
		Map<Float, String> map3 = new HashMap<Float, String>();
		map3.put(f, "one");
		map3.put(f1, "onvhe");
		
		System.out.println(map2.size());
		
	}
	
	
}
