package swtichcasepractice;

public class CheckNumberRange {

	public static void main(String[] args) {
		int num = 10;
		switch (num / 10) {
		case 0, 1, 2, 3:
			System.out.println("Low");
			break;
		case 4, 5, 6, 7:
			System.out.println("Medium");
			break;
		case 8, 9, 10:
			System.out.println("High");
			break;

		default:
			System.out.println("Invaild Inputs .....!");
		}

	}

}
