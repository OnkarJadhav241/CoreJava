package com.dailypractise;

public class ArmstrongNumber {

	public void checkArmStrongNumber(int num) {
		int originalNumber = num;
		int num1 = num;
		int count = 0;
		int result = 0;
		while (num > 0) {
			count += 1;
			num = num / 10;
		}

		while (num1 > 0) {
			int rem = num % 10;
			for (int i = 1; i < count; i++) {
				result *= rem;

			}
			num1 = num1 / 10;

		}
		if (originalNumber == result) {
			System.out.println(originalNumber + " is an Armstrong Number");
		} else {
			System.out.println(originalNumber + " is not an Armstrong Number");
		}
	}

}
