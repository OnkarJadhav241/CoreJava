package swtichcasepractice;

public class FruitPriceMenu {

	public static void main(String[] args) {
		int choice = 2;
		switch (choice) {
		case 1:
			System.out.println("Apple --> ₹100");
			break;
		case 2:
			System.out.println("Mango --> ₹80");
			break;
		case 3:
			System.out.println("Banana--> ₹40");
			break;
		case 4:
			System.out.println("Orange --> ₹60");
			break;

		default:
			System.out.println("Invaild Inputs .....!");
		}

	}

}
