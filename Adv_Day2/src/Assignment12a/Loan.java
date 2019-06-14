package Assignment12a;

public class Loan {

	private int loanNo;
	private int accountNo;
	private int customerNo;
	private float loanAmount;
	private int loanDuration;
	private float interest;
	static int loanCounter ;
	
	public Loan()
	{
		loanCounter++;
	}
	public Loan(int accountNo, int customerNo, float loanAmount, int loanDuration, float interest) {
		super();
		loanCounter++;
		this.accountNo = accountNo;
		this.customerNo = customerNo;
		this.loanAmount = loanAmount;
		this.loanDuration = loanDuration;
		this.interest = interest;
	}
	public float calculateInstallments()
	{
		return 0.0f;
	}
	public int getAccountNo() {
		return accountNo;
	}
	public void setAccountNo(int accountNo) {
		this.accountNo = accountNo;
	}
	public int getCustomerNo() {
		return customerNo;
	}
	public void setCustomerNo(int customerNo) {
		this.customerNo = customerNo;
	}
	public float getLoanAmount() {
		return loanAmount;
	}
	public void setLoanAmount(float loanAmount) {
		this.loanAmount = loanAmount;
	}
	public int getLoanDuration() {
		return loanDuration;
	}
	public void setLoanDuration(int loanDuration) {
		this.loanDuration = loanDuration;
	}
	public float getInterest() {
		return interest;
	}
	public void setInterest(float interest) {
		this.interest = interest;
	}
	
	public static void main(String[] args) {
		Loan loan1 = new Loan();
		Loan loan2 = new Loan(1, 100, 5000, 3, 0.8f);
		Loan loan3 = new Loan(2, 1001, 999, 5, 2.5f);
		Loan loan4 = new Loan();
		Loan loan5 = new Loan();
		Loan loan6 = new Loan();
		System.out.println("Loan Counter : " + loanCounter);
		
	}
}
