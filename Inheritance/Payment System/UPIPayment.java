package com.paymentsystem;

public class UPIPayment extends Payment {

	private String upiAppName;
	private String upiID;

	public void setUPIAPPDetails(String upiAppName, String upiID) {
		this.upiAppName = upiAppName;
		this.upiID = upiID;

	}

	public void showUPIAPPDetails() {

		System.out.println("Payment APP : " + upiAppName);
		System.out.println("UPI ID : " + upiID);
	}

}
