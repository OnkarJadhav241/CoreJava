package ifelsepracticeset;

//Write a program to check whether a character is vowel or consonant.

public class VowelOrConsonant {

	public static void main(String[] args) {
		char character = 'b';

		if (character == 'A' || character == 'E' || character == 'I' || character == 'O' || character == 'U'
				|| character == 'a' || character == 'e' || character == 'i' || character == 'o' || character == 'u') {
			System.out.println("The given Character " + character + " is vowel");

		} else {
			System.out.println("The given Character " + character + " is Consonant");
		}

	}

}
