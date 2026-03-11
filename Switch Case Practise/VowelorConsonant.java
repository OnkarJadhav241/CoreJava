package switchcase;

public class VowelorConsonant {

	public static void main(String[] args) {
		char character = 'b';
		switch (character) {
		case 'A', 'E', 'I', 'O', 'U', 'a', 'e', 'i', 'o', 'u':
			System.out.println("Vowel");
			break;
		case 'B', 'C', 'D', 'F', 'G', 'H', 'J', 'K', 'L', 'M', 'N', 'P', 'Q', 'R', 'S', 'T', 'V', 'W', 'X', 'Y', 'Z',
				'b', 'c', 'd', 'f', 'g', 'h', 'j', 'k', 'l', 'm', 'n', 'p', 'q', 'r', 's', 't', 'v', 'w', 'x', 'y', 'z':
			System.out.println(" Consonant");
			break;

		default:
			System.out.println("Invaild Inputs .....!");

		}

	}

}
