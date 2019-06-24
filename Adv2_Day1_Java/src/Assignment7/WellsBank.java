package Assignment7;

public class WellsBank {

	public static void main(String[] args) throws InterruptedException {
		
		Customer cust1 = new Customer(1001, "Rahil");
		Account acc1 = new Account(2001, cust1, 20000);
		
		Customer cust2 = new Customer(1002, "Ajay");
		Account acc2 = new Account(2002, cust2, 10000);
		
		DepositTransaction depositthread = new DepositTransaction(9001, acc2, 5001, 4000);

		DepositTransaction depositthread2 = new DepositTransaction(9002, acc1, 5002, 7000);

		depositthread.start();
		
		//depositthread.join();
		
		depositthread2.start();
	
		//depositthread2.join();
		
		Runnable withdrawtransaction1 = new WithdrawTransaction(10001, acc1, cust1, 1000);
		
		Thread withdrawthread1 = new Thread(withdrawtransaction1);
		
		Runnable withdrawtransaction2 = new WithdrawTransaction(10002, acc1, cust1, 2000);
		
		Thread withdrawthread2 = new Thread(withdrawtransaction2);
		
		Runnable withdrawtransaction3 = new WithdrawTransaction(10003, acc1, cust1, 3000);
		
		Thread withdrawthread3 = new Thread(withdrawtransaction3);
		
		withdrawthread1.start();
				
		withdrawthread2.start();
		
		withdrawthread3.start();

		
		//withdrawthread2.join();
	}
}
