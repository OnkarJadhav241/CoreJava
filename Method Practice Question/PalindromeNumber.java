package com.methods;

public class PalindromeNumber {

//	public void checkplaindrome() {
//		int num = 12321, reverse = 0;
//		int originalnum = num;
//		while (num > 0) {
//			int rem = num % 10; // 5
//			reverse = reverse * 10 + rem; // 0 * 10 +4 =4
//			num = num / 10; // 12345/10 =1234
//		}
//
//		if (originalnum == reverse) {
//			System.out.println(originalnum + " is a Palindrome number ");
//		} else {
//			System.out.println(originalnum + " is not a Palindrome Number");
//		}
//
//	}

//	public String checkplaindrome() {
//		int num = 12321, reverse = 0;
//		int originalnum = num;
//		while (num > 0) {
//			int rem = num % 10; // 5
//			reverse = reverse * 10 + rem; // 0 * 10 +4 =4
//			num = num / 10; // 12345/10 =1234
//		}
//
//		if (originalnum == reverse) {
//			return originalnum + " is a Palindrome number";
//		} else {
//			return originalnum + " is not a Palindrome Number";
//		}
//
//	}

//	public void checkplaindrome(int num) {
//		int reverse = 0;
//		int originalnum = num;
//		while (num > 0) {
//			int rem = num % 10; // 5
//			reverse = reverse * 10 + rem; // 0 * 10 +4 =4
//			num = num / 10; // 12345/10 =1234
//		}
//
//		if (originalnum == reverse) {
//			System.out.println(originalnum + " is a Palindrome number ");
//		} else {
//			System.out.println(originalnum + " is not a Palindrome Number");
//		}
//
//	}

	public String checkplaindrome(int num) {
		int  reverse = 0;
		int originalnum = num;
		while (num > 0) {
			int rem = num % 10; // 5
			reverse = reverse * 10 + rem; // 0 * 10 +4 =4
			num = num / 10; // 12345/10 =1234
		}

		if (originalnum == reverse) {
			return originalnum + " is a Palindrome number";
		} else {
			return originalnum + " is not a Palindrome Number";
		}

	}
}
