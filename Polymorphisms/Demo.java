package com.polymorphism;

public class Demo {

	public void show(int rollno, String name) {
		System.out.println("Roll No. : " + rollno);
		System.out.println("Name : " + name);
	}

	public void show(String name, int rollno) {
		System.out.println("Name : " + name);
		System.out.println("Roll No. : " + rollno);
	}

	public void display(int price) {
		System.out.println("Price : " + price);
	}

	public void display(String productName) {
		System.out.println("Product Name : " + productName);
	}

	public void details(String name) {
		System.out.println("Name : " + name);
	}

	public void details(String name, int age) {
		System.out.println("Name : " + name);
		System.out.println("Age : " + age);
	}

	

}
