package com.calculator;

public class SimpleCalculator implements Calculator {
	@Override
	public void add(int num1, int num2) {
		int result = num1 + num2;
		System.out.println("Addition of " + num1 + " and " + num2 + " is " + result);
	}
	@Override
	public void substract(int num1, int num2) {
		int result = num1 - num2;
		System.out.println("Substrcation of " + num1 + " and " + num2 + " is " + result);
	}
	@Override
	public void multiply(int num1, int num2) {
		int result = num1 * num2;
		System.out.println("Multiplication of " + num1 + " and " + num2 + " is " + result);

	}
	@Override
	public void divide(int num1, int num2) {
		int result = num1 / num2;
		System.out.println("Division of " + num1 + " and " + num2 + " is " + result);

	}

	

}
