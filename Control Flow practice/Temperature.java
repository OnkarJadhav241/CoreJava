package ifelsepracticeset;

public class Temperature {

	public static void main(String[] args) {
		int degree = 15;
		if (degree >= 25) {
			System.out.println("HOT");
		} else if (degree >= 20 && degree <= 24) {
			System.out.println("WARM");
		} else if (degree >= 10 && degree <= 19) {
			System.out.println("COOL");
		} else if (degree <= 10) {
			System.out.println("COLD");
		} else {
			System.out.println("Invaild Inputs...!");
		}
	}
}
