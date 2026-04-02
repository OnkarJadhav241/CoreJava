package com.paymentsystem;

public class MainClass {

	public static void main(String[] args) {
		
		
		UPIPayment upi=new UPIPayment();
		upi.setBankDetails("SBI", "Chichwad", 987654823155l);
		upi.setUPIAPPDetails("Phone Pay", "9865321470oolj");
		upi.showBankDetails();
		upi.showUPIAPPDetails();
		

     
	}

}
