package Assignment32;

import java.lang.reflect.*;

public class TestReflection {

	public static void main(String[] args) {
		
		try {
			Class classObj = Class.forName("Assignment32.EmployeeBean");
			
			Field[] fields = classObj.getDeclaredFields();
			Method[] methods = classObj.getDeclaredMethods();
			 Constructor[] constructor = classObj.getDeclaredConstructors();
			Class x = fields[0].getDeclaringClass();

			 for(int i = 0; i < fields.length ; i++)
			{
				System.out.println(fields[i]);
			}
			System.out.println();
			for(int i = 0; i < methods.length; i++)
			{
				System.out.println(methods[i]);
			}
			System.out.println();
			for(int i = 0; i < constructor.length; i++)
			{
				System.out.println(constructor[i]);
			}
			System.out.println();
			System.out.println(x);
			
		} 
		catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	
	}
	
}
