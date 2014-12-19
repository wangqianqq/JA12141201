package c_Set;

import java.util.Iterator;
import java.util.TreeSet;

import bean.ComparatorByAge;
import bean.Person;

public class TreeSetDemo3 {

	public static void main(String[] args) {
		TreeSet ts = new TreeSet(new ComparatorByAge());//使用Treeset比较器：先年龄后名字
		//TreeSet ts = new TreeSet();//默认使用Person的自然排序，先名字、后年龄
		
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
	}
	

}
