package ifelsepracticeset;

// Write a program to check whether a character is vowel, consonant, digit, or special character.

public class CharacterCheck {

	public static void main(String[] args) {
		char character = 5;

		if ((character >= 'a' && character <= 'z') || (character >= 'A' && character <= 'Z')) {

			if (character == 'a' || character == 'e' || character == 'i' || character == 'o' || character == 'u'
					|| character == 'A' || character == 'E' || character == 'I' || character == 'O'
					|| character == 'U') {
				System.out.println("It is a Vowel.");
			} else {
				System.out.println("It is a Consonant.");
			}
		} else if (character >= '0' && character <= '9') {
			System.out.println("It is a Digit.");
		} else {
			System.out.println("It is a Special Character.");
		}

	}

}
