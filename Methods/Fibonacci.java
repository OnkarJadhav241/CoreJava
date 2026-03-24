package com.methods;

public class Fibonacci {

	public void printFibonacciSeries() {
		int num1 = 0, num2 = 1, result = 0;
		while (result<=50) {
			result = num1 + num2;
			num1 = num2;
			num2 = result;
			
			if(result<=50) {
				System.out.println(result);
			}
		}
	}
}
