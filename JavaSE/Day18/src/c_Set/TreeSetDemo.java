package c_Set;

import java.util.Iterator;
import java.util.TreeSet;



public class TreeSetDemo {
	public static void main(String[] args) {
		TreeSet ts = new TreeSet();
		
//		
//		ts.add(3);
//		ts.add(23);
//		ts.add(-12);
//		ts.add(0);
//		ts.add(35);
//		ts.add(10);
		
		ts.add("abc");
		ts.add("nba");
		ts.add("cba");
		ts.add("cuba");
		ts.add("apple");
		ts.add("zxa");
		ts.add("hello");

		

		for (Iterator it = ts.iterator(); it.hasNext();) {
			String object = (String) it.next();
			System.out.println(object);
		}
		
		System.out.println(ts);
		System.out.println(ts.first());
		System.out.println(ts.last());

		
	}

}
