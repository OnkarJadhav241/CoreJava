package com.paymentsystem;

public class Payment {

	private String bankName;
	private String branchName;
	private long accountno;

	public void setBankDetails(String bankName, String branchName, long accountno) {
		this.bankName = bankName;
		this.branchName = branchName;
		this.accountno = accountno;
	}

	public void showBankDetails() {
		System.out.println("---------- BANK INFORMATION ------------------");
		System.out.println("Bank Name : " + bankName);
		System.out.println("Bank Branch : " + branchName);
		System.out.println("Acoount No. : " + accountno);
	}

}
