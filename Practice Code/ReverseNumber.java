package practiceprograms;

public class ReverseNumber {

	public static void main(String[] args) {
		int num = 12345, reverse = 0;
		while (num > 0) {
			int rem = num % 10; // 5
			reverse = reverse * 10 + rem; // 0 * 10 +4 =4
			num = num / 10; // 12345/10 =1234
		}
		System.out.println(reverse);

	}

}
