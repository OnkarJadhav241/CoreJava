package arraypractisesession;

public class Program2 {
//	Write a program to print all elements of a 1D array.

	public static void main(String[] args) {
		int[] arr = { 10, 20, 30, 40, 50 }; // static array

		int[] arr1 = new int[5];// dynamic array

		arr1[0] = 11;
		arr1[1] = 22;
		arr1[2] = 33;
		arr1[3] = 44;
		arr1[4] = 55;

		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}

		for (int i = 0; i < arr1.length; i++) {
			System.out.println(arr1[i]);
		}

	}

}
