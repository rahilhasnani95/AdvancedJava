package Assignment8;

public class EmployeeGrade {

	private int employeeNo;
	private String employeeName;
	private float customer1Feedback;
	private float customer2Feedback;
	private float customer3Feedback;
	private float averageFeedback;
	private char grade;

	public void initializeEmployee(int empNo, String name, float c1fb , float c2fb, float c3fb)
	{
		employeeNo = empNo;
		employeeName = name;
		customer1Feedback = c1fb;
		customer2Feedback = c2fb;
		customer3Feedback = c3fb;
	}
	public void calculateAverageFeedback()
	{
		averageFeedback = (customer1Feedback + customer2Feedback + customer3Feedback)/3.0f;
	}
	public void calculateGrade()
	{
		if(averageFeedback > 4.5)
		{
			grade = 'A';
		}
		else if(averageFeedback <= 4.5 && averageFeedback > 4)
		{
			grade = 'B';
		}
		else if(averageFeedback <= 4 && averageFeedback > 3.5) 
		{
			grade = 'C';
		}
		else if(averageFeedback <= 3.5)
		{
			grade = 'D';
		}
	}
	
	public void displayInfo()
	{
		System.out.println("Employee No : " + employeeNo);
		System.out.println("Employee Name : " + employeeName);
		System.out.println("Customer 1 FB : " + customer1Feedback);
		System.out.println("Customer 2 FB : " + customer2Feedback);
		System.out.println("Customer 3 FB : " + customer3Feedback);
		System.out.println("Average FeedBack : " + averageFeedback);
		System.out.println("Grade : " + grade);
	}
	
}
