package Assignment4;

import java.util.LinkedHashMap;
import java.util.Map;

public class Login {

	Map<Integer, String> loginMap = new LinkedHashMap<>();
	
	public void addLogin(int customerId, String password)
	{
		loginMap.put(customerId, password);
		System.out.println("User Added successfully login id : " + customerId);
	}
	
}
