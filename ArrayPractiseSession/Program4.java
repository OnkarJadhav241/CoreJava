package arraypractisesession;

public class Program4 {
//	Write a program to find the sum of all elements in a 1D array.

	public static void main(String[] args) {
		int[] arr1 = { 10, 5, 20, 15, 50 };
		int sum = 0;
		for (int i = 0; i < arr1.length; i++) {
			sum += arr1[i];
			System.out.println(arr1[i]);
		}
		System.out.println(" the sum of all elements=" + sum);

	}

}
