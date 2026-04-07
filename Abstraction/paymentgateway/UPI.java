package com.paymentgateway;

public class UPI implements Payment {

	@Override
	public void pay(double amount) {
		System.out.println(amount+"Rs Received");
		System.out.println("Payment by UPI....!");
		
	}

}
