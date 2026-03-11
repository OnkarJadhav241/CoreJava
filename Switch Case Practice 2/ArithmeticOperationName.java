package swtichcasepractice;

public class ArithmeticOperationName {

	public static void main(String[] args) {

		int choice = 3;
		switch (choice) {
		case 1:
			System.out.println("Addition ");
			break;
		case 2:
			System.out.println("Substrction ");
			break;
		case 3:
			System.out.println("Multiplication ");
			break;
		case 4:
			System.out.println("Division ");
			break;

		default:
			System.out.println("Invaild Inputs .....!");
		}
	}
}
