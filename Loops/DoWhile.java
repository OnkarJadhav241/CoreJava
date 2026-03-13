package Loops;

public class DoWhile {

	public static void main(String[] args) {

//		Print numbers from 1 to 10 using a loop.
		int i = 1;
		do {
			System.out.println(i);
			i++;
		} while (i <= 10);
//		

//		Print numbers from 10 to 1.
		int i = 10;
		do {
			System.out.println(i);
			i--;
		} while (i >= 1);

//		Print all even numbers between 1 and 50.
		int i = 1;
		do {
			if (i % 2 == 0) {
				System.out.println(i);
			}
			i++;
		} while (i <= 50);

//		Print all odd numbers between 1 and 50.
		int i = 1;
		do {
			if (i % 2 != 0) {
				System.out.println(i);
			}
			i++;
		} while (i <= 50);

//		Print the table of 5 using a loop.
		int i = 1;
		do {
			System.out.println("5 * " + i + " = " + (i * 5));;
			i++;
		} while (i <= 10);

//		Print the table of any number (e.g., n = 7).
		int i = 1, n = 7;
		do {
			System.out.println(n + " * " + i + " = " + (i * n));
			i++;
		} while (i <= 10);

//		Print Hello 10 times.
		int i = 1;
		do {
			System.out.println(i + ". Hello");
			i++;
		} while (i <= 10);

//		Print the sum of first 10 natural numbers.
		int i = 1, sum = 0;
		do {
			sum = sum + i;
			i++;
		} while (i <= 10);
		System.out.println("The sum of first 10 natural numbers = " + sum);

//		Print the sum of even numbers from 1 to 100.
		int i = 1, sum = 0;
		do {
			if (i % 2 == 0) {
				sum = sum + i;
			}
			i++;
		} while (i <= 100);
		System.out.println("the sum of even numbers from 1 to 100 = " + sum);

//		Print the sum of odd numbers from 1 to 100.
		int i = 1, sum = 0;
		do {
			if (i % 2 != 0) {
				sum = sum + i;
			}
			i++;
		} while (i <= 100);
		System.out.println("the sum of odd numbers from 1 to 100 = " + sum);
	}

}
