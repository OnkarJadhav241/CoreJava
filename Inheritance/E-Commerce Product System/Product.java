package com.ecommerceproductsystem;

public class Product {

	private String productName;
	private double price;

	public void setProductDetails(String name, double price) {
		this.productName = name;
		this.price = price;
	}

	public void displayProductDetails() {
		System.out.println("Product Name: " + productName);
		System.out.println("Price: ₹" + price);
	}

}
