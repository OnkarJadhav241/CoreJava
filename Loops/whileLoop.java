package Loops;

public class whileLoop {

	public static void main(String[] args) {

//		Print numbers from 1 to 10 using a loop.
		int i=1;
		while(i<=10) {
			System.out.println(i);
			i++;
		}

//		Print numbers from 10 to 1.
		int i=10;
		while(i>=1) {
			System.out.println(i);
			i--;
		}

//		Print all even numbers between 1 and 50.
		int i=1;
		while(i<=50) {
			if (i % 2 == 0) {
				System.out.println(i);
			}
			i++;
		}

//		Print all odd numbers between 1 and 50.
		int i=1;
		while(i<=50) {
			if (i % 2 != 0) {
				System.out.println(i);
			}
			i++;
		}

//		Print the table of 5 using a loop.
		int i=1;
		while(i<=10) {
			System.out.println("5 * " + i + " = " + (i * 5));
			i++;
		}

//		Print the table of any number (e.g., n = 7).
		int i=1,n=7;
		while(i<=10) {
			System.out.println(n + " * " + i + " = " + (i * n));
			i++;
		}

//		Print Hello 10 times.
		int i=1;
		while(i<=10) {
			System.out.println(i+". Hello");
			i++;
		}

//		Print the sum of first 10 natural numbers.
		int i=1,sum = 0;
		while (i<=10) {
			sum = sum + i;
			i++;
		}
//		System.out.println("The sum of first 10 natural numbers = " + sum);
//		

//		Print the sum of even numbers from 1 to 100.
		int i = 1, sum1 = 0;
		while (i <= 100) {
			if (i % 2 == 0) {
				sum1 = sum1 + i;
			}
			i++;
		}
		System.out.println(" The sum of even numbers from 1 to 100 = " + sum1);

//		Print the sum of odd numbers from 1 to 100.
		
		int i = 1, sum1 = 0;
		while (i <= 100) {
			if (i % 2 != 0) {
				sum1 = sum1 + i;
			}
			i++;
		}
		System.out.println(" The sum of even numbers from 1 to 100 = " + sum1);
	}

}
