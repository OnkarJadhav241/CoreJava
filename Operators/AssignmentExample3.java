package operators;

public class AssignmentExample3 {

	public static void main(String[] args) {
		int i = 10;

		i++; // 10 //11
		--i; // 10
		System.out.println(i++); // 10 //11

		i += 2; // 13
		System.out.println(--i); // 12

		i %= 5; // 2
		System.out.println(i++);// 2  //3

		i++; // 4
		System.out.println(i - 3);// 1

		--i; // 3
		System.out.println(i += 3); // 6

		i++; // 7
		int c = i + 1; // 8
		System.out.println(c++); // 8 //9

		c %= 3; // 0
		System.out.println(c++); // 0 //1

		++c; // 2
		c--;// 1
		c++;// 2
		System.out.println(c + 5);// 7

		++c; // 3
		c /= 3;// 1
		System.out.println(c * 2);// 2

		i += c; // i= i+c //7 +1 = 8
		System.out.println(i); // 8

		int x = i % c; // 0
		x++;// 0 //1
		--x; // 0
		System.out.println(x++);// 0 //1

		int a = x + 2; // 3

		x += 3; // 4
		System.out.println(x);// 4
		System.out.println(--x); // 3

		System.out.println(6 / x);// 2

		x %= 3;//0
		System.out.println(x++); // 0 //1

		++x;// 2
		System.out.println(x * 2); // 4

		int b = 4 + x;// 8

		System.out.println("________________");
		System.out.println(x);// 2

	}

}
