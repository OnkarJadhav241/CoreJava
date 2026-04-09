package com.banksystem;

public abstract class BankAccount {
	
	private double balance;
	
	public abstract void  calculateInterest(double amount ,int year);
	
	public  void displayBalance() {
		System.out.println("Balance = "+ balance );
	}

}
