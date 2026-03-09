package ifelsepracticeset;

//Write a Java program to check if a number is positive.
// Write a program to check whether a number is positive or negative.

public class PositiveNumber {

	public static void main(String[] args) {

		int number = 10;

		if (number > 0) {
			System.out.println(number + " is Positive Number");
		} else if (number == 0) {
			System.out.println("The given number is zero");
		} else {
			System.out.println(number + " is Negative Number ");
		}

	}

}
