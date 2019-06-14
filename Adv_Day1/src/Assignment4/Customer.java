package Assignment4;

public class Customer {

	private String customerID;
	private String customerName;
	private String address;
	private int pinCode;
	
	public static void main(String[] args) {
		Customer customer = new Customer();
		customer.customerID = "1234";
		customer.customerName = "Rahil";
		customer.address = "3100 Sugarland Texas";
		customer.pinCode = 77479;
		
		System.out.println("Customer ID " + customer.customerID);
		System.out.println("Customer Name " + customer.customerName);
		System.out.println("Customer Address " + customer.address);
		System.out.println("Customer PinCode " + customer.pinCode);
	}
}
