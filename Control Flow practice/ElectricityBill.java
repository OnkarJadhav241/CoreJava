package ifelsepracticeset;

//Write a program to calculate electricity bill based on units.

//Example:
//0–100 → ₹5 per unit
//101–200 → ₹7 per unit
//Above 200 → ₹10 per unit

public class ElectricityBill {

	public static void main(String[] args) {
		int billUnits = 201;

		if (billUnits >= 0 && billUnits <= 100) {
			System.out.println("It will Cost ₹5 per unit ");
		} else if (billUnits >= 101 && billUnits <= 200) {
			System.out.println("It will Cost ₹7 per unit ");
		} else if (billUnits >= 200) {
			System.out.println("It will Cost ₹10 per unit ");
		} else {
			System.out.println("Invalid Units....!");
		}

	}

}
