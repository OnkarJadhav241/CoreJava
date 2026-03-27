package com.constructor;

public class BankAccount {
	long accountNumber;
	String accountHolderName;
	String bankName;
	String branchName;
	long mobileNumber;
	double balance;

	public BankAccount(long accountNumber, String accountHolderName, String bankName, String branchName,
			long mobileNumber, double balance) {
		this.accountNumber = accountNumber;
		this.accountHolderName = accountHolderName;
		this.bankName = bankName;
		this.branchName = branchName;
		this.mobileNumber = mobileNumber;
		this.balance = balance;
	}

	public void showAccountDetails() {
		System.out.println("Account Number: " + accountNumber);
		System.out.println("Account Holder: " + accountHolderName);
		System.out.println("Bank Name: " + bankName);
		System.out.println("Branch: " + branchName);
		System.out.println("Mobile Number: " + mobileNumber);
		System.out.println("Balance: " + balance);
	}
}
