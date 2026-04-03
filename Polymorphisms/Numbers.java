package com.polymorphism;

public class Numbers {

	static void print(int num) {
		System.out.println("Number: " + num);
	}

	static void print(int num1, int num2) {
		System.out.println("Numbers: " + num1 + " and " + num2);
	}

	public void max(int num1, int num2) {
		if (num1 > num2) {
			System.out.println(num1 + " is Greater than " + num2);
		} else if (num2 > num1) {
			System.out.println(num2 + " is Greater than " + num1);
		} else {
			System.out.println("Invalid Inputs..!");
		}
	}

	public void max(int num1, int num2, int num3) {
		if (num1 > num2 && num1 > num3) {
			System.out.println(num1 + " is Greater than " + num2 + " and " + num3);
		} else if (num2 > num1 && num2 > num3) {
			System.out.println(num2 + " is Greater than " + num1 + " and " + num3);
		} else if (num3 > num1 && num3 > num2) {
			System.out.println(num3 + " is Greater than " + num1 + " and " + num2);
		} else {
			System.out.println("Invalid Inputs..!");
		}
	}
}
