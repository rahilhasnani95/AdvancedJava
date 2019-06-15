package Assignmengt33;

public class TestStringMock {

	public static void main(String[] args) {
		String message = "What's in the name";
	
		//System.out.println(StringMock.search(message, 't'));
		
	StringMock sm = new StringMock();
	System.out.println(sm.search(message, 's'));
	System.out.println(sm.search(message, 'z'));
	
	System.out.println(sm.capacity);
	
	}
	
}
