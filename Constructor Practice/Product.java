package com.constructor;

public class Product {
	int productId;
	String productName;
	double price;
	int quantity;
	String brand;

	public Product(int productId, String productName, double price, int quantity, String brand) {
		this.productId = productId;
		this.productName = productName;
		this.price = price;
		this.quantity = quantity;
		this.brand = brand;
	}

	public void showProductDetails() {
		System.out.println("ID: " + productId);
		System.out.println("Name: " + productName);
		System.out.println("Price: " + price);
		System.out.println("Quantity: " + quantity);
		System.out.println("Brand: " + brand);
	}

	public void displayBill() {
		double totalAmount = price * quantity;
		System.out.println("Total amount :- " + totalAmount);
	}
}
