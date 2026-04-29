package arraypractisesession;

public class Program11 {
//	Write a program to reverse a 1D array.

	public static void main(String[] args) {
		int[] arr = { 10, 20, 30, 40, 50 };
		int size = arr.length;
		int[] arr1 = new int[size];
		int j = 0;
		for (int i = arr.length-1; i >= 0; i--) {
			arr1[j] = arr[i];
			j++;
		}

		System.out.println("array 1");
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}

		System.out.println("array 2");
		for (int i = 0; i < arr1.length; i++) {
			System.out.println(arr1[i]);
		}
	}

}