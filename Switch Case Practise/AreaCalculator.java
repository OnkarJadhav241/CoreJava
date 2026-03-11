package switchcase;

public class AreaCalculator {
	public static void main(String[] args) {

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
			double rectangleArea = length * breadth;
			System.out.println("Area of Rectangle  is " + rectangleArea);
			break;
		case 3:
			double squareArea = side * side;
			System.out.println("Area of Square  is " + squareArea);
			break;

		default:
			System.out.println("Invaild Inputs .....!");
		}

	}
}
