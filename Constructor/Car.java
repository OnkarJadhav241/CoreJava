package com.constuctor;

public class Car {

	public Car(String model, String name, String color, int enginecc, String type, int modelYear) {
		System.out.println("------Car Information----------");
		System.out.println("Car Model:- " + model);
		System.out.println("Car Name:- " + name);
		System.out.println("Car Color:- " + color);
		System.out.println("Car Enginecc:- " + enginecc);
		System.out.println("Car Type:- " + type);
		System.out.println("Car modelYear:- " + modelYear);
	}

	public void price(double price) {
		System.out.println("Car Price :- " + price);
	}

}
