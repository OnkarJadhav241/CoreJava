package swtichcasepractice;

public class PasswordStrengthLevel {

	public static void main(String[] args) {
		int choice = 2;
		switch (choice) {
		case 1:
			System.out.println("Weak Password");
			break;
		case 2:
			System.out.println("Medium Password");
			break;
		case 3:
			System.out.println("Strong Password");
			break;

		default:
			System.out.println("Invaild Inputs .....!");
		}

	}

}
