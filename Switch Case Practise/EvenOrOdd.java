package switchcase;

public class EvenOrOdd {

	public static void main(String[] args) {
		int num = 3;
		
		switch(num % 2) {
		case 0:
			System.out.println(num+" is Even Number");
			break;
		case 1:
			System.out.println(num+" is Odd Number");
			break;
		default:
			System.out.println("Invaild Inputs...!");
		}

	}

}
