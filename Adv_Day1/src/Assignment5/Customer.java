package Assignment5;

public class Customer
{
	private String firstName;
	private String middleName;
	private String lastName;
	private String emailId;
	private String accountType;
	private String dob;
	private char gender;
	private String maritalStatus;
	private static int customerId = 0;
	private static int accountNumber=0;
	
	
	public Customer(String firstName, String middleName, String lastName, String emailId, String accountType,
			String dob, char gender, String maritalStatus) {
		++customerId; 
		++accountNumber;
		this.firstName = firstName;
		this.middleName = middleName;
		this.lastName = lastName;
		this.emailId = emailId;
		this.accountType = accountType;
		this.dob = dob;
		this.gender = gender;
		this.maritalStatus = maritalStatus;
	}
	@Override
	public String toString() {
		return "Customer [firstName=" + firstName + ", middleName=" + middleName + ", lastName=" + lastName
				+ ", emailId=" + emailId + ", accountType=" + accountType + ", dob=" + dob + ", gender=" + gender
				+ ", maritalStatus=" + maritalStatus + ", Customer ID =" + customerId + ", accountNumber=" + accountNumber + "]";
	}
	
	
}


