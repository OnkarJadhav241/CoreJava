package com.paymentgateway;

public class NetBanking implements Payment {

	@Override
	public void pay(double amount) {
		System.out.println(amount+"Rs Received");
		System.out.println("Payment by UPI....!");
		
	}

}
