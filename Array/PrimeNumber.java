package arrays2d;

public class PrimeNumber {

	public static void main(String[] args) {
		// 1d array
//		 int[] arr = {10, 11, 13, 15, 17, 19, 23, 25, 30};
//		for (int i = 0; i < arr.length; i++) {
//			boolean flag = true;
//			
//			for(int j =2; j<arr[i];j++) {
//				
//				if(arr[i] % j == 0) {
//					flag = false;
//				}
//			}
//			if (flag) {
//				System.out.println(arr[i] + " is an Prime Number");
//			} else {
//				System.out.println(arr[i] + " is an Not Prime Number");
//			}
//		}

		// 2d array
		System.out.println("============2D Array=========");

		int[][] arr1 = { { 10, 11, 13 }, { 15, 17, 19 }, { 23, 25, 30 } };

		for (int i = 0; i < arr1.length; i++) {
			for (int j = 0; j < arr1.length; j++) {
				boolean flag = true;

				for (int k = 2; k < arr1[i][j]; k++) {

					if (arr1[i][j] % k == 0) {
						flag = false;
					}
				}
				if (flag) {
					System.out.println(arr1[i][j] + " is an Prime Number");
				} else {
					System.out.println(arr1[i][j] + " is an Not Prime Number");
				}
			}
		}
	}
}
