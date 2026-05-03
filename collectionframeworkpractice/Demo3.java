package collectionframeworkpractice;

import java.util.Collections;
import java.util.LinkedList;

public class Demo3 {

	public static void main(String[] args) {

		LinkedList<String> list = new LinkedList<String>();
		list.add("onkar");
		list.add("Shlok");
		list.add("Shivam");
		list.add("Ram");
		list.add(null);
		list.add("B407");
	

		for (String string : list) {
			System.out.println(string);
		}
		
		  // 6. First & last element LinkedList
        System.out.println("6. First: " + list.getFirst() + ", Last: " + list.getLast());

     // 10. Reverse LinkedList
        Collections.reverse(list);
        System.out.println("10. Reversed LinkedList: " + list);

	}
}
