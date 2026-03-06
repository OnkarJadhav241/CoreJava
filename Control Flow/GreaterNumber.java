package flowcontrolstatements;

public class GreaterNumber {

	public static void main(String[] args) {
		int num1 = 20, num2 = 30;
		if (num1 > num2) {
			System.out.println("The Numbers are " + num1 + " , " + num2);
			System.out.println(num1 + " is Greater than " + num2);
		} else if (num1 < num2) {
			System.out.println("The Numbers are " + num1 + " , " + num2);
			System.out.println(num2 + " is Greater than " + num1);
		} else {
			System.out.println("The Numbers are " + num1 + " , " + num2);
			System.out.println("The given numbers are equal");
		}

	}

}
