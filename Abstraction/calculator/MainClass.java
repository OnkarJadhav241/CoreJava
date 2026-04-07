package com.calculator;

public class MainClass {

	public static void main(String[] args) {
		Calculator cal = new SimpleCalculator();
		cal.add(10, 20);
		cal.substract(30, 10);
		cal.multiply(5, 6);
		cal.divide(100, 25);
	}

}
