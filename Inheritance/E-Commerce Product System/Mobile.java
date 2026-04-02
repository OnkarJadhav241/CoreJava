package com.ecommerceproductsystem;

public class Mobile extends ElectronicProduct {

	private String brand;
	private int storage;

	public void setMobileDetails(String brand, int storage) {
		this.brand = brand;
		this.storage = storage;
	}

	public void displayMobileDetails() {
		displayElectronicDetails();
		System.out.println("Brand: " + brand);
		System.out.println("Storage: " + storage + "GB");
	}

}
