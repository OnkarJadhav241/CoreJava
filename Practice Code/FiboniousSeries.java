package practiceprograms;

// 0 1 1 2 3 5 8 13 ......

public class FiboniousSeries {

	public static void main(String[] args) {
		int num1 = 0, num2 = 1, result = 0;
		System.out.println("0"+"\n1");
		
		while (result<=50) {
			result = num1 + num2;
			num1 = num2;
			num2 = result;
			
			if(result<=50) {
				System.out.println(result);
			}
		}

	}

}
