package com.methods;

public class EvenOrOdd {
	public void checkEvenOrODD() {
		int num = 45;
		if (num % 2 == 0) {
			System.out.println(num + " is Even Number");
		} else {
			System.out.println(num + " is Odd Number");
		}
	}

	public void printEvenSereies() {
		int num = 50;
		for (int i = 1; i <= num; i++) {
			if (i % 2 == 0) {
				System.out.println(i);
			}
		}
	}
	
	public void printOddSereies() {
		int num = 50;
		for (int i = 1; i <= num; i++) {
			if (i % 2 != 0) {
				System.out.println(i);
			}
		}
	}

}
