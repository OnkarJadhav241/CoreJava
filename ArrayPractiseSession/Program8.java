package arraypractisesession;

public class Program8 {
//	Write a program to search an element in a 1D array.

	public static void main(String[] args) {
		int[] arr5 = { 10, 5, 70, 15, 50 };
		int search_num=70;
		for (int i = 0; i < arr5.length; i++) {
			if(arr5[i]==search_num) {
			System.out.println(arr5[i]+"Element found...!");
			break;
			}
		}

	}

}
