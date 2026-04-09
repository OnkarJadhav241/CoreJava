package com.banksystem;

public class CurrentAccount extends BankAccount {
	private double balance;

	@Override
	public void calculateInterest(double amount, int year) {

		double balance = ((amount * 7 * year) / 100);
		this.balance = balance;
	}
	
	@Override
	public  void displayBalance() {
		System.out.println("Balance = "+ balance );
	}
}
