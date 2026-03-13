package Loops;

public class ForLoop {

	public static void main(String[] args) {

//		Print numbers from 1 to 10 using a loop.
//
		for (int i = 1; i <= 10; i++) {
			System.out.println(i);
		}

//		Print numbers from 10 to 1.

		for (int i = 10; i >= 1; i--) {
			System.out.println(i);
		}

//		Print all even numbers between 1 and 50.

		for (int i = 1; i <= 50; i++) {
			if (i % 2 == 0) {
				System.out.println(i);
			}
		}

//		Print all odd numbers between 1 and 50.

		for (int i = 1; i <= 50; i++) {
			if (i % 2 != 0) {
				System.out.println(i);
			}
		}

//		Print the table of 5 using a loop.

		for (int i = 1; i <= 10; i++) {
			System.out.println("5 * " + i + " = " + (i * 5));
		}

//		Print the table of any number (e.g., n = 7).
		int n = 7;
		for (int i = 1; i <= 10; i++) {
			System.out.println(n + " * " + i + " = " + (i * n));
		}

//		Print Hello 10 times.
		for (int i = 1; i <= 10; i++) {
			System.out.println(i + ". Hello");
		}

//		Print the sum of first 10 natural numbers.
		int sum = 0;
		for (int i = 1; i <= 10; i++) {
			sum = sum + i;
		}
		System.out.println("The sum of first 10 natural numbers = " + sum);
//		

//		Print the sum of even numbers from 1 to 100.
		int sum1 = 0;
		for (int i = 1; i <= 100; i++) {
			if (i % 2 == 0) {
				sum1 = sum1 + i;
			}
		}
		System.out.println(" The sum of even numbers from 1 to 100 = " + sum1);

//		Print the sum of odd numbers from 1 to 100.

		int sum2 = 0;
		for (int i = 1; i <= 100; i++) {
			if (i % 2 != 0) {
				sum2 = sum2 + i;
			}
		}
		System.out.println(" The sum of odd numbers from 1 to 100 = " + sum2);

	}

}
