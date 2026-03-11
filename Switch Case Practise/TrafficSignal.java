package switchcase;

public class TrafficSignal {

	public static void main(String[] args) {
		String color = "Red";
		switch (color) {

		case "Red":
			System.out.println("STOP");
			break;
		case "Yellow":
			System.out.println("READY");
			break;
		case "Green":
			System.out.println("GO");
			break;

		default:
			System.out.println("Invalid Input");
		}

	}

}
