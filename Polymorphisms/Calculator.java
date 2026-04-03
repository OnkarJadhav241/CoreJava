package com.polymorphism;

public class Calculator {

	public void add(int num1, int num2) {
		int result = num1 + num2;
		System.out.println("The sum is : " + result);
	}

	public void add(int num1, int num2, int num3) {
		int result = num1 + num2 + num3;
		System.out.println("The sum is : " + result);

	}

	public void multiply(int num1, int num2) {
		int result = num1 * num2;
		System.out.println("The Multiplication is : " + result);
	}

	public void multiply(double num1, double num2) {
		double result = num1 * num2;
		System.out.println("The Multiplication is : " + result);

	}

	public String sum(int num1, int num2) {
		int result = num1 + num2;
		return "The sum is : " + result;
	}

	public String sum(float num1, float num2) {
		float result = num1 + num2;
		return "The sum is : " + result;
	}
}
