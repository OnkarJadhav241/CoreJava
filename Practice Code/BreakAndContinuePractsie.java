package practiceprograms;

public class BreakAndContinuePractsie {

	public static void main(String[] args) {

//		Print numbers from 1 to 50 but stop when number becomes 25.
//		for (int i = 1; i <= 50; i++) {
//			if (i == 25) {
//				break;  
//			}
//			System.out.println(i);
//		}

//		Print even numbers from 1 to 100 but stop when you get first odd number.
//		for (int i = 1; i <= 100; i++) {
//			if (i % 2 != 0) {
//				break;	
//			}
//			System.out.println(i);
//		}

//		Print table of 9 but stop when product becomes more than 50.
//		int num = 8, num2 = 1;
//		for (int i = 1; i <= (num * 10); i++) {
//			if (i % 8 != 0) {
//				continue;
//			}
//			
//			if (i>=50) {
//				break;
//			}
//			System.out.println(num + " X " + (num2++) + " = " + i);
//		}

//		Print numbers from 1 to 50 but skip numbers divisible by 7.
//		for (int i = 1; i <= 50; i++) {
//			if (i % 7 == 0) {
//				continue; 
//			}
//			System.out.println(i);
//		}

//		Print numbers from 1 to 100 but skip numbers ending with digit 5.
//		for (int i = 1; i <= 100; i++) {
//			if (i % 10 == 5) {
//				continue; 
//			}
//			System.out.println(i);
//		}

//		Print characters from ‘A’ to ‘Z’ but skip vowels.
		for (char i = 'A'; i <= 'Z'; i++) {
			if (i == 'A' || i == 'E' || i == 'I' || i == 'O' || i == 'U') {
				continue;
			}
			System.out.println(i);
		}

	}

}
