package collectionframeworkpractice;

import java.util.Vector;

public class Demo2 {
	public static void main(String[] args) {
		
		Vector <Integer> list = new Vector<Integer>();
		list.add(111);
		list.add(222);
		list.add(333);
		list.add(444);
		list.add(555);
		list.add(666);
		list.add(777);
		list.add(888);
		list.add(999);
		list.add(123);
		
		for (Integer integer : list) {
			System.out.println(integer);
		}
		// 5. Check element in Vector
		 System.out.println(" Contains 444: " + list.contains(444));
         
		// 8. Update element in Vector
		 list.set(1, 99);
	        System.out.println("8. Updated Vector: " + list);
	}
}

