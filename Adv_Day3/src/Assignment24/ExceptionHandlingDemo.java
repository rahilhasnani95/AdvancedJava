package Assignment24;

public class ExceptionHandlingDemo {

	public static void main(String[] args) {
		
		String name = "john";
		int total = 100, count = 0;
		try
		{
			int avg = total/count;
			System.out.println(avg);
			System.out.println(name.length());
			System.out.println("End of try block");
		}
		catch(ArithmeticException e)
		{
			System.out.println("Arithmetic Exception " + e.getMessage());
		}
		catch(NullPointerException n)
		{
			System.out.println("Object is null");
		}
		finally
		{
			System.out.println("within finally block");
		}
		System.out.println("Continuing the execution");
		
	}
}
