package com.paymentgateway;

public class UPIPayment implements Payment{
	
	@Override
	public void pay(double amount) {
		System.out.println(amount+"Rs Received");
		System.out.println("Payment by DebitCard....!");
		
	}

}
