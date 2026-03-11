package switchcase;

public class Calculator {

	public static void main(String[] args) {
		int num1 = 10, num2 = 20;
		int choice = 3;
		switch (choice) {
		case 1:
			int result = num1 + num2;
			System.out.println("Addition of " + num1 + " and " + num2 + " is " + result);
			break;
		case 2:
			result = num1 - num2;
			System.out.println("Substrction of " + num1 + " and " + num2 + " is " + result);
			break;
		case 3:
			result = num1 * num2;
			System.out.println("Multiplication of " + num1 + " and " + num2 + " is " + result);
			break;
		case 4:
			result = num1 / num2;
			System.out.println("Division of " + num1 + " and " + num2 + " is " + result);
			break;

		default:
			System.out.println("Invaild Inputs .....!");

		}

	}

}
