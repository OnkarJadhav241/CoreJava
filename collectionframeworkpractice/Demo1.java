package collectionframeworkpractice;

import java.util.ArrayList;

public class Demo1 {
 
	public static void main(String[] args) {
		
		ArrayList <Integer> list = new ArrayList<Integer>();
		list.add(11);
		list.add(22);
		list.add(33);
		list.add(44);
		list.add(55);
		list.add(66);
		list.add(77);
		list.add(88);
		list.add(99);
		list.add(123);
		
		for (Integer integer : list) {
			System.out.println(integer);
		}
	
        // 4. Size of ArrayList

		 System.out.println(" Size: " + list.size());

		 
		 // 7. Remove element from ArrayList
	        list.remove(Integer.valueOf(55));
	        System.out.println(" After remove 5: " + list);


		
	}
}
