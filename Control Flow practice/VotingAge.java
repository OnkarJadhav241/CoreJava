package ifelsepracticeset;

//Write a program to check if a person is eligible for voting (age ≥ 18).

public class VotingAge {

	public static void main(String[] args) {

		int age = 21;

		// using if-else statement
		// first condition

//		if (age > 18 || age == 18) {
//			System.out.println("You are eligible for voting");
//		} else {
//			System.out.println("You are not eligible for voting");
//		}

		// Second condition

//		if (age >= 18) {
//			System.out.println("You are eligible for voting");
//		} else {
//			System.out.println("You are not eligible for voting");
//		}

		// by using if-else ladder

		if (age > 18) {
			System.out.println("You are eligible for voting");
		} else if (age == 18) {
			System.out.println("You are eligible for voting");
		} else {
			System.out.println("You are not eligible for voting");
		}

	}

}
