package Assignment8;

public class Wells {

	public static void main(String[] args) {

		EmployeeGrade emp = new EmployeeGrade();
		emp.initializeEmployee(1, "Rahil",5.0f, 4.5f, 4.75f);
		emp.calculateAverageFeedback();
		emp.calculateGrade();
		emp.displayInfo();
		
	}

}
