package c_Set;

import java.util.Iterator;
import java.util.TreeSet;

import bean.Person;
/*
 * 让普通类具有可比性：实现comparable接口，复写compareTo方法：自定义比较规则==集合的排序规则
 */

public class TreeSetDemo2 {


	public static void main(String[] args) {
		TreeSet ts = new TreeSet();
		
		ts.add(new Person(12, "Google"));
		ts.add(new Person(1, "Geminno"));
		ts.add(new Person(6, "Badiud"));
		ts.add(new Person(8, "Alibaba"));
		ts.add(new Person(6, "Abcd"));
		
		ts.add(new Person(6, "Oralce"));
		ts.add(new Person(2, "Oralce"));
		ts.add(new Person(3, "Oralce"));
		ts.add(new Person(5, "Oralce"));
		ts.add(new Person(10, "Oralce"));
		
		
		for (Iterator it = ts.iterator(); it.hasNext();) {
			Person object = (Person) it.next();
			System.out.println(object);
		}
		
//		System.out.println(ts.first());
//		System.out.println(ts.last());
	}

}
