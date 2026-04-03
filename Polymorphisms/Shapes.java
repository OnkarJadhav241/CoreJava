package com.polymorphism;

public class Shapes {

	public void area(double radius) {
		double area = 3.14 * radius * radius;
		System.out.println("Area of Circle = " + area);
	}

	public void area(double length, double breadth) {
		double area = length * breadth;
		System.out.println("Area of Rectangle = " + area);
	}

}
