package arraypractisesession;

import java.util.Arrays;

public class Program13 {
//	Write a program to sort a 1D array in descending order.

	public static void main(String[] args) {

		int[] arr = { 11, 2, 5, 84, 6, 52, 14, 57, 3, 1, 21, 45 };

		System.out.println("Array before sorting");
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		Arrays.sort(arr);
		
		int[] arr1 = new int[arr.length];
		int j= 0;
		 for(int i=arr.length-1;i>=0;i--) {
			 arr1[j]=arr[i];
			 j++;
		 }

		System.out.println("Array After sorting");
		for (int i = 0; i < arr1.length; i++) {
			System.out.println(arr1[i]);
		}

	}

}
