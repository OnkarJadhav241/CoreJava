package ifelsepracticeset;

public class TypesOfTriangle {

	public static void main(String[] args) {
		float side1 = 4.5f, side2 = 3.5f, side3 = 3.5f;
		int angle1 = 45, angle2 = 45, angle3 = 90;
		if (angle1 + angle2 + angle3 == 180) {
			if (side1 == side2 && side2 == side3 && side3 == side1) {
				if (angle1 == 60 && angle2 == 60 && angle3 == 60) {
					System.out.println("Equilateral triangle");
				}else {
					System.out.println("It is a Triangle");
				}
			} else if ((side1 == side2 && side1 != side3 && side2 != side3)
					|| (side2 == side3 && side2 != side1 && side3 != side1)
					|| (side1 == side3 && side1 != side2 && side3 != side2)) {
				if ((angle1 == angle2 && angle1 != angle3 && angle2 != angle3)
						|| (angle2 == angle3 && angle2 != angle1 && angle3 != angle1)
						|| (angle3 == angle1 && angle3 != angle2 && angle3 != angle2)) {
					System.out.println("Isosceles triangle");
				}else {
					System.out.println("It is a Triangle");
				}
			} else if (side1 != side2 && side2 != side3 && side3 != side1) {
				if (angle1 != angle2 && angle2 != angle3 && angle3 != angle1) {
					System.out.println("Scalene triangle");
				}

			}

		} else {
			System.out.println("The Given Angles cannot form a Triangle");
		}
	}
}