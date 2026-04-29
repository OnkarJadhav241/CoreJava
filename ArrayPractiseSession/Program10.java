package arraypractisesession;

public class Program10 {
//	Write a program to copy elements from one array to another.

	public static void main(String[] args) {
		int[] arr= {10,20,30,40,50};
		int size= arr.length;
		int[] arr1 =new int[size];
		for(int i=0;i<arr.length;i++) {
			arr1[i]=arr[i];
		}
		
		
	System.out.println("array 1");
	for(int i=0;i<arr.length;i++) {
		System.out.println(arr[i]);
	}
	
	System.out.println("array 2");
	for(int i=0;i<arr1.length;i++) {
		System.out.println(arr1[i]);
	}
	}
}
