package operators;

public class AssignmentOperator {

	public static void main(String[] args) {
		System.out.println("---------- Example 1 -----------------");

		int i = 5;

		i++; // 5 //6
		--i; //5
		System.out.println(i++); //5 //6

		i += 3; // 9
		System.out.println(--i); // 8

		i %= 4; // 0
		System.out.println(i++); //0 //1

		++i; //2
		System.out.println(i * 2); //4

		System.out.println("________________");
		System.out.println(i); //2


	}

}
