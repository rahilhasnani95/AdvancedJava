package Assignment3;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class LoginDetails {

	public void addSameKey(Map<Integer,String> mp)
	{
		if(mp.containsKey(1003))
		{
			System.out.println("key is already present in map");
		}
		mp.put(1003, "John");

	}
	
	public void printLoginDetails(Map<Integer, String> mp)
	{
		Set<Integer> set = mp.keySet();
		for(Integer i : set)
		{
			System.out.println("Key: " + i + " Value: " + mp.get(i));
		}
	}
	
	public static void main(String[] args) {
	
		Map<Integer, String> map = new LinkedHashMap<>();
		map.put(1000, "Sam");
		map.put(1001, "Tom");
		map.put(1002, "Zen");
		map.put(1003, "Zen");
		
		System.out.println("Map before adding the same key 1003" + map);

		LoginDetails login = new LoginDetails();
		login.addSameKey(map);
		
		System.out.println("Value for 1003, after addSameKey() : " + map.get(1003));
		
		System.out.println("Map after adding the same key 1003" + map);

		login.printLoginDetails(map);
	}
	
}
