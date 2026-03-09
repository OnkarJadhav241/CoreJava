package ifelsepracticeset;

// Write a program to check if a number is greater than 100.

public class NumberGreaterThanHundred {

	public static void main(String[] args) {

		int number = 105;
		if (number > 100) {
			System.out.println(number + " is Greater Than 100");
		} else if (number == 100) {
			System.out.println("The given number is equal to 100");
		} else {
			System.out.println(number + " is less Than 100");
		}
	}

}
