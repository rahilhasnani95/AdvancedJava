package Assignment23;

public class ExceptionHandlingDemo {

	public static void main(String[] args) {
		
		String name = null;
		int total = 100, count = 0;
		try
		{
			int avg = total/count;
			System.out.println(avg);
			System.out.println(name.length());
			System.out.println("End of try block");
		}
		
		catch(NullPointerException n)
		{
			System.out.println("Object is null");
		}
		catch(ArithmeticException e)
		{
			System.out.println("Arithmetic Exception " + e.getMessage());
		}
		System.out.println("Continuing the execution");
		name = "John";
		System.out.println(name.length());
	}
}
