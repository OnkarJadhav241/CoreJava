package practiceprograms;

public class SwtichCase {

	public static void main(String[] args) {
//		Input a number (1–5) and print:
//			1 → Java
//			2 → Python
//			3 → C++
//			4 → JavaScript
//			5 → SQL

		int choice = 4;
		switch (choice) {
		case 1:
			System.out.println("Java");
			break;
		case 2:
			System.out.println("Python");
			break;
		case 3:
			System.out.println("C++");
			break;
		case 4:
			System.out.println("JavaScript");
			break;
		case 5:
			System.out.println("SQL");
			break;

		default:
			System.out.println("Invaild Inputs .....!");

		}

//			6 .Create a program to calculate area:
//			1 → Circle
//			2 → Square
//			3 → Rectangle

		float radius = 3.5f;
		float length = 1.5f, breadth = 2.5f;
		float side = 5f;
		int choice = 3;
		switch (choice) {
		case 1:
			double circleArea = 3.14 * radius * radius;
			System.out.println("Area of Circle  is " + circleArea);
			break;

		case 2:
			double squareArea = side * side;
			System.out.println("Area of Square  is " + squareArea);
			break;
		case 3:
			double rectangleArea = length * breadth;
			System.out.println("Area of Rectangle  is " + rectangleArea);
			break;

		default:
			System.out.println("Invaild Inputs .....!");
		}
//
//			7 . Input a number (1–3) and print:
//			1 → "Login Success"
//			2 → "Invalid Password"
//			3 → "Account Locked"

		
		int choice = 1;
		switch (choice) {
		case 1:
			System.out.println("Login Success...!");
			break;
		case 2:
			System.out.println("Invalid Password...!");
			break;
		case 3:
			System.out.println("Account Locked...!");
			break;
		
		default:
			System.out.println("Invaild Inputs .....!");

		}
	}

}
