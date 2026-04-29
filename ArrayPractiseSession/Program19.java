package arraypractisesession;

public class Program19 {
//Write a program to merge two 1D arrays.
	public static void main(String[] args) {
		int[] arr1 = { 1, 3, 5 };
		int[] arr2 = { 2, 4, 6, 8 };

		int n1 = arr1.length;
		int n2 = arr2.length;

		int[] mergedarr = new int[n1 + n2];

		for (int i = 0; i < n1; i++) {
			mergedarr[i] = arr1[i];
		}

		
		for (int i = 0; i < n2; i++) {
			mergedarr[n1 + i] = arr2[i];
		}

		// Display merged array
		System.out.println("Merged array:");
		for (int i = 0; i < mergedarr.length; i++) {
			System.out.println(mergedarr[i]);
		}
	}
}
