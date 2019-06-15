package com.Wellsbank.account;
import com.Wellsbank.customer.*;

public class SavingsAccount extends Account{

	private double minimumBalance = 500;
	private int interestRate = 12;
	
	public SavingsAccount()
	{
		
	}

	public SavingsAccount(int accountNo, Customer customer, double balance) 
	{
		super(accountNo, customer, balance);
	}
	
	public void withdraw(double amount)
	{
		if((balance - amount) >= minimumBalance)
		{
			balance = balance-amount;
			System.out.println("Amount withdrawn successfully: " + amount);
			System.out.println("Balance Left : " + balance);
		}
		else
		{
			System.out.println("Your minimum balance should be 500 if you remove " + amount + " balance left will be " + (balance-amount));
			//System.out.println("Infufficient balance, reduce the withdraw amount");
		}
	}
	
	public void calculateInterest()
	{
		System.out.println("Interest calculated: " + (balance*(interestRate/100)));
	}
	
	
}
