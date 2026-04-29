package arraypractisesession;

public class Program5 {

//	Write a program to find the average of elements in a 1D array.

	public static void main(String[] args) {
		int[] arr = { 10, 5, 20, 15, 50 };
		int sum = 0;
		int avg = 0;
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
			System.out.println(arr[i]);
		}
		int arr_len = arr.length;
		avg = sum / arr_len;
		System.out.println(" the sum of all elements=" + sum);
		System.out.println(" the average of elements =" + avg);
	}
}
