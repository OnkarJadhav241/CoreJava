package arraypractisesession;

public class Program9 {
//	Write a program to count even and odd numbers in a 1D array.

	public static void main(String[] args) {
		int[] arr = { 10, 5, 70, 15, 50 };
		int evenCount = 0;
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]%2==0) {
			evenCount++;
			}
		}
		
		int oddCount = arr.length- evenCount;
		System.out.println("The count of Even numbers in a  array= " + evenCount);
		System.out.println("The count of Odd numbers in a  array= " + oddCount);

	}

}
