package com.banksystem;

public class MainClass {

	public static void main(String[] args) {
		
		BankAccount sbi = new SavingAccount();
		sbi.calculateInterest(15000, 1);
		sbi.displayBalance();

	}

}
