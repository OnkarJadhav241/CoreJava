package com.encapsulationpractice;

//6. Write a method printMessage() (no parameter, no return) that prints "Welcome to Java".
//7. Write a method add(int a, int b) (parameterized, no return) that prints the sum.
//8. Write a method multiply(int a, int b) (parameterized, returns result).
//Call it from main and print the answer.**
//
//9. Write a method getName() (no parameter, returns a String) that returns your name.
//10. Write a method isEven(int n) (parameterized return type boolean) that checks even/odd.

public class MethodsExamplePractice {

	public void printMessage() {
		System.out.println("Welcome to Java");
	}

	public void add(int a, int b) {
		int c = a + b;
		System.out.println("sum of " + a + " + " + b + " is " + c);
	}

	public String multiply(int a, int b) {
		int c = a * b;
		return "sum of " + a + " * " + b + " is " + c;
	}

	public String getName() {
		String name = "onkar";
		return name;
	}

	public boolean isEven(int n) {
		return n % 2 == 0;
	}

}
