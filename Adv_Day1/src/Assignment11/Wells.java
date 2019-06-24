package Assignment11;

public class Wells {

	public static void main(String[] args) {

	EmployeeGrade [] emp = new EmployeeGrade[5];
	
	emp[0] = new EmployeeGrade(1, "Rahil", 4.2f, 5.0f, 4.6f);
	emp[1] = new EmployeeGrade(2, "Ajay", 2.2f, 4.0f, 4.3f);
	emp[2] = new EmployeeGrade(3, "Ram", 3.2f, 3.9f, 3.3f);
	emp[3] = new EmployeeGrade(4, "Mahesh", 4.4f, 5.0f, 4.3f);
	emp[4] = new EmployeeGrade(5, "Asif", 3.2f, 4.0f, 4.1f);
	//emp[5] = new EmployeeGrade(1, "Rahil", 4.2f, 5.0f, 4.3f);

	for(int i = 0; i < emp.length; i++)
	{
		emp[i].calculateAverageFeedback();
		emp[i].calculateGrade();
		emp[i].displayInfo();
		System.out.println();
	}
	
	}

}
