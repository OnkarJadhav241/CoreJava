package com.encapsulationpractice;

public class Product {
	private String name;
	private double price;
	private int quantity;
	private double discount; 

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public double getPrice() {
		return price;
	}
	
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setDiscount(double discount) {
		this.discount = discount;
	}

	public double getDiscount() {
		return discount;
	}

	// Method to calculate discounted price
	public double calculateDiscountedPrice() {
		double totalAmount = price * quantity;
		return totalAmount - (totalAmount * discount / 100);
	}
}
