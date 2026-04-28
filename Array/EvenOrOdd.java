package arrays2d;

public class EvenOrOdd {
	public static void main(String[] args) {
		// 1d array
		int[] arr = { 11, 20, 35, 40, 55, 60 };
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 == 0) {
				System.out.println(arr[i] + " is an Even Number");
			} else {
				System.out.println(arr[i] + " is an Odd Number");
			}
		}

//		// 2d array
		System.out.println("============2D Array=========");

		int[][] arr1 = { { 15, 20, 32 }, { 17, 35, 85 }, { 45, 65, 92 } };

		for (int i = 0; i < arr1.length; i++) {
			for (int j = 0; j < arr1.length; j++) {
				if (arr1[i][j] % 2 == 0) {
					System.out.println(arr1[i][j] + " is an Even Number");
				} else {
					System.out.println(arr1[i][j] + " is an Odd Number");
				}
			}
		}
		
	}
}
