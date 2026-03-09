package ifelsepracticeset;

// Write a program to check if a character is uppercase.

public class UpperCaseCharacter {

	public static void main(String[] args) {

		char character = 'A';

		if (character >= 'A' && character <= 'Z') {
			System.out.println(character + " is in UpperCase");
		} else {
			System.out.println(character + " is not in UpperCase");
		}

	}

}
