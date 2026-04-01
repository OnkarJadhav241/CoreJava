package com.dailypractise;

public class Factorial {

	public void printFactorial(int num) {
		int fact = 1;
		for (int i = 1; i <= num; i++) {
			fact *= i;
		}
		System.out.println("Factorial of " + num + " is " + fact);
	}

	public void printSeriesOfFactorial(int num) {
		//int fact=1;
		for (int i = 1; i <= num; i++) {
			int fact=1;
			for (int j = 1; j <= i; j++) {
                 fact *= j; 
			}System.out.println("Factorial of " + i + " is " + fact);
		}

	}

}
