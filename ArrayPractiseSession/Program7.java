package arraypractisesession;

public class Program7 {
//	Write a program to find the minimum element in a 1D array.


	public static void main(String[] args) {
		int[] arr = { 10, 5, 70, 15, 50 };
		int min = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < min) {
				min = arr[i];
			}
		}
		System.out.println(min + " is mininum element");
	}
}
