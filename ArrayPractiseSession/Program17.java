package arraypractisesession;

import java.util.Arrays;

public class Program17 {
//Write a program to find the second largest element in a 1D array.
	public static void main(String[] args) {
		int[] arr = { 11, 2, 5, 84, 6, 52, 14, 57, 3, 1, 21, 45 };

		System.out.println("Array");
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		Arrays.sort(arr);

	
		
		System.out.println("the second largest numberis "+arr[arr.length-2]);

	}

}
