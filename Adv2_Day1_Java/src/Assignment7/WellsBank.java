package Assignment7;

public class WellsBank {

	public static void main(String[] args) throws InterruptedException {
		
		Customer cust1 = new Customer(1001, "Rahil");
		Account acc1 = new Account(2001, cust1, 20000);
		
		Customer cust2 = new Customer(1002, "Ajay");
		Account acc2 = new Account(2002, cust2, 10000);
		
		DepositTransaction depositthread = new DepositTransaction(9001, acc2, 5001, 4000);
		
		depositthread.start();
		
		depositthread.join();
		
		DepositTransaction depositthread2 = new DepositTransaction(9002, acc1, 5002, 7000);
		
		depositthread2.start();
	
		depositthread2.join();
		
		Runnable withdrawtransaction1 = new WithdrawTransaction(10001, acc1, cust2, 5000);
		
		Thread withdrawthread1 = new Thread(withdrawtransaction1);
		
		withdrawthread1.start();
		
		withdrawthread1.join();
		
		Runnable withdrawtransaction2 = new WithdrawTransaction(10002, acc1, cust1, 500);
		
		Thread withdrawthread2 = new Thread(withdrawtransaction2);
		
		withdrawthread2.start();
		
		withdrawthread2.join();
	}
}