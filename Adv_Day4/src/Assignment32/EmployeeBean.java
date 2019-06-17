package Assignment32;

import java.util.Calendar;

public class EmployeeBean {

	private int employeeId;
	private String employeeName;
	private Calendar dateOfBirth;
	
	public EmployeeBean() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public EmployeeBean(int employeeId, String employeeName, Calendar dateOfBirth) {
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.dateOfBirth = dateOfBirth;
	}
	
	public EmployeeBean(String employeeName, Calendar dateOfBirth) {
		super();
		this.employeeName = employeeName;
		this.dateOfBirth = dateOfBirth;
	}
	
	public int getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public Calendar getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(Calendar dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	
	
	
}
