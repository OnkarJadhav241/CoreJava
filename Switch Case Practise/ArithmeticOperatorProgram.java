package switchcase;

public class ArithmeticOperatorProgram {

	public static void main(String[] args) {
		int num1 = 30, num2 = 20;
		char choice = '-';
		switch (choice) {
		case '+':
			int result = num1 + num2;
			System.out.println("Addition of " + num1 + " and " + num2 + " is " + result);
			break;
		case '-':
			result = num1 - num2;
			System.out.println("Substrction of " + num1 + " and " + num2 + " is " + result);
			break;
		case '*':
			result = num1 * num2;
			System.out.println("Multiplication of " + num1 + " and " + num2 + " is " + result);
			break;
		case '/':
			result = num1 / num2;
			System.out.println("Division of " + num1 + " and " + num2 + " is " + result);
			break;

		default:
			System.out.println("Invaild Inputs .....!");
		}

	}

}
