package practiceprograms;

public class BreakAndcontinue {

	public static void main(String[] args) {
//		1] program to use break keyword
//			for (int i = 1; i <= 10; i++) {
//				if (i == 5) {
//					break;  
//				}
//				System.out.println(i);
//			}

//		2] program to use continue keyword
//			for (int i = 1; i <= 10; i++) {
//				if (i == 5) {
//					continue; 
//				}
//				System.out.println(i);
//			}

//		3] write a program to print Even no:
//			for (int i = 1; i <= 10; i++) {
//				if (i % 2 != 0) {
//					continue; // it is used to skip one iteration
//				}
//				System.out.println(i);
//			}

//		4] write a program to print Odd no:
//			for (int i = 1; i <= 30; i++) {
//				if (i % 3 == 0) {
//					continue; 
//				}
//				System.out.println(i);
//			}

//     5] write a program to print number which is not divisible by 3 and 5
//			for (int i = 1; i <= 30; i++) {
//				if (i % 3 == 0 || i % 5 == 0) {
//					continue; 
//				}
//				System.out.println(i);
//			}

//		6] write a program to print number is divisible by 8 up to 50 
//			for (int i = 1; i <= 50; i++) {
//				if (i % 3 != 0 ) {
//					continue; // it is used to skip one iteration
//				}
//				System.out.println(i);
//			}

//		7] write a program to print number is divisible by 2 but not divisible by 5 upto 100
//		for (int i = 1; i <= 100; i++) {
//			if (i % 2 != 0 || i % 5 == 0) {
//				continue; 
//			}
//			System.out.println(i);
//		}

//		8] write a program to print table of any number
		int num = 8, num2 = 1;
		for (int i = 1; i <= (num * 10); i++) {
			if (i % 8 != 0) {
				continue;
			}
			System.out.println(num + " X " + (num2++) + " = " + i);
		}

	}

}
