package practiceprograms;

public class Patterns {

	public static void main(String[] args) {
//		1.
//		A
//		AB
//		ABC
//		ABCD
//		ABCDE
//		
		for (int i=1;i<=5;i++) {
			char ch='A';
			for(int j=1;j<=i;j++) {
				System.out.print(ch);
				ch++;
			}System.out.println("");
		}

//		2. 
//
//		*
//		**
//		***
//		****
//		*****
//		****
//		***
//		**
//		*
		for (int i=1;i<=5;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}System.out.println("");
		}
		for (int i=5-1;i>=1;i--) {
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}System.out.println("");
		}

//		3. 
//		1
//		01
//		101
//		0101
//		10101
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= i; j++) {
				if (i % 2 == 0) {
					if (j % 2 == 0) {
						System.out.print("1");
					} else {
						System.out.print("0");
					}
				} else if (i % 2 != 0) {
					if (j % 2 == 0) {
						System.out.print("0");
					} else {
						System.out.print("1");
					}
				}
			}
			System.out.println("");
		}

//		4. 
//
//
//		*   *
//		 * *
//		  *
//		 * *
//		*   *
		for (int i = 3; i >= 1; i--) {
			for (int j = 1; j <=3- i; j++) {
				System.out.print(" ");
			}
			for (int j = 1; j <= i; j++) {
				System.out.print("* ");
				
			}
			System.out.println("");
		}

		for (int i = 1; i <= 3; i++) {
			for (int j = 1; j <=3- i; j++) {
				System.out.print(" ");
			}
			for (int j = 1; j <= i; j++) {
				System.out.print("* ");
				
			}
			System.out.println("");
		}

	}

}
