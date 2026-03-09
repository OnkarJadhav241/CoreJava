package ifelsepracticeset;

//Write a program to check whether a number is positive and even.

public class PositiveAndEven {

	public static void main(String[] args) {

		int number = -4;

		if (number > 0 ) {
			if(number %2 ==0) {
				System.out.println("The number " + number + " is Positive and Even");
			}else {
				System.out.println("The number " + number + " is Positive and Odd");
			}
			
		}else {
			System.out.println("The number "+ number +" is neagitve ");
		}

	}

}
