package Assignmengt33;

public class StringMock {
	@Deprecated
	String capacity;
	
	public StringMock()
	{
		
	}
	public StringMock(String capacity)
	{
		this.capacity = capacity;
	}
	
	@Deprecated
	public static int search(String string, char searchItem)
	{
		int index;
		for(index = 0; index < string.length(); index++)
		{
			if(string.charAt(index) == searchItem)
			{
				return index;
			}
		}
		return -1;
	}
}