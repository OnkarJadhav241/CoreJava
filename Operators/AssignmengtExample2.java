package operators;

public class AssignmengtExample2 {

	public static void main(String[] args) {
		
		System.out.println("---------- Example 2 -----------------");

		int i = 4;

		i++; // 4 //5
		--i; // 4
		System.out.println(i++); // 4 //5

		i += 2; // 7
		System.out.println(--i); // 6

		i %= 5; // 1
		System.out.println(i++); // 1 //2

		i++; // 2 //3
		System.out.println(i - 3); // 0

		--i; // 2
		System.out.println(i += 4); // 6

		i++; // 6 //7
		int c = i + 1; // 8
		System.out.println(i++);// 7 //8

		i %= 3; // 2
		System.out.println(i++); // 2 //3

		++i; // 4
		System.out.println(i * 2);// 8

		System.out.println("________________________");
		System.out.println(i);// 4

	}

}
