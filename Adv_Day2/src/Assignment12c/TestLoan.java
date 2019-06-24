package Assignment12c;

import java.io.ObjectInputStream.GetField;

public class TestLoan {

	public static void main(String[] args) {
		
		Loan.getLoanInstance();
		
		System.out.println("No of Objects  : " + Loan.getNumberOfObjects());
	
	}

}
