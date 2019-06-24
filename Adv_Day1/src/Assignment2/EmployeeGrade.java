package Assignment2;



public class EmployeeGrade {

	public static void main(String[] args) {
	
		int []employeeNo = {1,2,3,4,5};
		float []customer1Feedback = {4.5f, 4.2f, 4.3f, 4.4f, 4.5f};
		float []customer2Feedback = {4,5,4,4.8f,4};
		float []customer3Feedback = {5,5,4,3,5};
		float[]averageFeedback = new float[employeeNo.length];
		char []grade = new char[employeeNo.length];
		
		for(int i = 0; i < employeeNo.length; i++)
		{
			averageFeedback[i] = (customer1Feedback[i] + customer2Feedback[i] + customer3Feedback[i])/3;
			//System.out.println(averageFeedback[i]);
		}
		for(int i = 0; i < averageFeedback.length; i++)
		{
			if(averageFeedback[i] > 4.5)
			{
				grade[i] = 'A';
			}
			else if(averageFeedback[i] <= 4.5 && averageFeedback[i] > 4.0f)
			{
				grade[i] = 'B';
			} 
			else if(averageFeedback[i] <=4.0 && averageFeedback[i] > 3.5f)
			{
				grade[i] = 'C';
			}
			else
			{
				grade[i] = 'D';
			}
		}
		for(int i = 0; i < employeeNo.length; i++)
		{
			System.out.print("Employee No : " + employeeNo[i]);
			System.out.print("  Average Feedback : " +averageFeedback[i]);
			System.out.print("  Grade : " + grade[i]);
			System.out.println();
		}




		
	}
}
