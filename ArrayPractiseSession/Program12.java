package arraypractisesession;

import java.util.Arrays;

public class Program12 {

	public static void main(String[] args) {
//		Write a program to sort a 1D array in ascending order.
		
		int[] arr= {11,2,5,84,6,52,14,57,3,1,21,45};
		
		System.out.println("Array before sorting");
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		Arrays.sort(arr);
		
		System.out.println("Array After sorting");
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		

	}

}
