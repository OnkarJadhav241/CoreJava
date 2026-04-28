package arrays2d;

public class AdditionArray {
	public static void main(String[] args) {
		// 1d array
		int[] arr = { 10, 20, 30, 40, 50, 60 };
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		System.out.println("The addition of " + sum);

		// 2d array

		int[][] arr1 = { { 10, 20, 30 }, { 40, 50, 60 }, { 70, 80, 90 } };
		int sum1 = 0;
		for (int i = 0; i < arr1.length; i++) {
			for (int j = 0; j < arr1.length; j++) {
				sum1 += arr1[i][j];
			}
		}
		System.out.println("The addition of " + sum1);
	}

}
