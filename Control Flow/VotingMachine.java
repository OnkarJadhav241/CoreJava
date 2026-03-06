package flowcontrolstatements;

public class VotingMachine {

	public static void main(String[] args) {
		int age = 19;

		// using if-else statement

		if (age > 18 || age == 18) {
			System.out.println("You are eligible for voting");
		} else {
			System.out.println("You are not eligible for voting");
		}

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