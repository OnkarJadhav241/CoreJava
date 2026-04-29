package arraypractisesession;

public class Program14 {
//	Write a program to find duplicate elements in a 1D array.

	public static void main(String[] args) {
		// 1d array
		int[] arr = new int[] { 11, 20, 55, 40, 55, 20, 11 };

		for (int i = 0; i < arr.length; i++) {
			int search = arr[i];
			for (int j = i + 1; j < arr.length; j++) {
				if (search == arr[j]) {

					System.out.println(search + " " + " " + arr[j]);
				}
			}
		}



	}

}
