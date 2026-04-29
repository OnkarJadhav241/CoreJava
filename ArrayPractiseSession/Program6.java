package arraypractisesession;

public class Program6 {
//	Write a program to find the maximum element in a 1D array.

	public static void main(String[] args) {
		int[] arr = { 10, 5, 70, 15, 50 };
		int max = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}
		}
		System.out.println(max + " is maxium element");
	}

}
