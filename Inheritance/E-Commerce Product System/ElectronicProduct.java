package com.ecommerceproductsystem;

public class ElectronicProduct extends Product {

	private int warranty;

	public void setElectronicDetails(int warranty) {
		this.warranty = warranty;
	}

	public void displayElectronicDetails() {
		displayProductDetails();
		System.out.println("Warranty: " + warranty + " months");
	}
}
