package c_Set;

import java.util.HashSet;
import java.util.Iterator;

import bean.Person;

/*
 * 把自定义对象添加到hashset
 */
public class HashSetTest1 {

	public static void main(String[] args) {
		HashSet hs = new HashSet();
		
		Person person = new Person(111, "IBM");
		
		hs.add(person);
		//hs.add(person);
		hs.add(new Person(12, "google"));
		hs.add(new Person(23, "aPPLE"));
		System.out.println(hs.add(new Person(12, "google")));
		System.out.println(hs.add(new Person(12, "Baidu")));
		
		Iterator it = hs.iterator();
		while (it.hasNext()) {
			Person object = (Person) it.next();
			System.out.println(object.getName() + "-" + object);
		}
		
		
		Person p1 = new Person(12, "jack");
		Person p2 = new Person(12, "jack");
		
		System.out.println(p1.hashCode() + "===" +  p2.hashCode());
		
		
	}

}
