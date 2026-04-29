package arraypractisesession;

public class Program3 {

//	Write a program to find the length of a 1D array.

	public static void main(String[] args) {
		// by builtIn method
		int arr[]= {15,2,4,14,15,2,69,514,52,45,34,8,7};
		System.out.println("the lenght of an Array=" + arr.length);

		// normal way
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			count++;
		}
		System.out.println("the lenght of an Array=" + count);

	}

}
