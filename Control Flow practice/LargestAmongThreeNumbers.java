package ifelsepracticeset;

// Write a program to find the largest among three numbers.

public class LargestAmongThreeNumbers {

	public static void main(String[] args) {
		int num1 = 15, num2 = 10, num3 = 55;

		if (num1 > num2 && num1 > num3) {
			System.out.println(num1 + " is Greater than " + num2 + " and " + num3);
		}else if (num2>num1 && num2 >num3) {
			System.out.println(num2 + " is Greater than " + num1 + " and " + num3);
		}else if (num3>num1 && num3 >num2) {
			System.out.println(num3 + " is Greater than " + num1 + " and " + num2);
		}else {
			System.out.println("All there numbers are equal..!");
		}

	}

}
