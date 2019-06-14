package Assignment9;

public class Wells {

	public static void main(String[] args) {
		
		EmployeeGrade emp = new EmployeeGrade();
		emp.initializeEmployee(1, "Elvis", 4.1f, 3.9f, 4.2f);
		emp.calculateAverageFeedback();
		emp.calculateGrade();
		emp.displayInfo();
		System.out.println();
		EmployeeGrade emp2 = new EmployeeGrade();
		emp2.initializeEmployee(2, "Martha", 4.2f, 4.4f);
		emp2.calculateAverageFeedback();
		emp2.calculateGrade();
		emp2.displayInfo();
		
		
		
	}

}
