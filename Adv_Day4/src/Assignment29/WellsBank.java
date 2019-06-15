package Assignment29;

public class WellsBank {

	public static void main(String[] args) {

		Customer john = new Customer();
		john.setCustomerId(1);
		john.setCustomerName("Rahil");
		john.setCustomerAddress("Sugarland");
		john.setPinCode(77479);
		
		System.out.println(john.getCustomerId());
		System.out.println(john.getCustomerName());
		System.out.println(john.getCustomerAddress());
		System.out.println(john.getPinCode());
		
	}

}
