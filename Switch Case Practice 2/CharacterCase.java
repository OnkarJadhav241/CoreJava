package swtichcasepractice;

public class CharacterCase {

	public static void main(String[] args) {
		char character = 'b';
		switch (character) {
		case 'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z':
			System.out.println(character +" is in Uppercase");
			break;
		case 'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z':
			System.out.println(character +" is in Lowercase");
			break;
			
		default:
			System.out.println("Invaild Inputs .....!");

		}
	}

}
