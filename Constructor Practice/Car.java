package com.constructor;

public class Car {
	String model;
	String name;
	String color;
	int enginecc;
	String type;
	int modelYear;
	double price;

	public Car(String model, String name, String color, int enginecc, String type, int modelYear, double price) {
		this.model = model;
		this.name = name;
		this.color = color;
		this.enginecc = enginecc;
		this.type = type;
		this.modelYear = modelYear;
		this.price = price;
	}

	public void displayCarDetails() {
		System.out.println("------Car Information----------");
		System.out.println("Car Model:- " + model);
		System.out.println("Car Name:- " + name);
		System.out.println("Car Color:- " + color);
		System.out.println("Car Enginecc:- " + enginecc);
		System.out.println("Car Type:- " + type);
		System.out.println("Car modelYear:- " + modelYear);
		System.out.println("Car Price :- " + price);
	}

}
