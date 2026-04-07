package com.paymentgateway;

public class MainClass {

	public static void main(String[] args) {

		Payment p;

		p = new UPI();
		p.pay(1000);

		p = new CreditCard();
		p.pay(5000);

		p = new DebitCard();
		p.pay(4000);

	}

}
