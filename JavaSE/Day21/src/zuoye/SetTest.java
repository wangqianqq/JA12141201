package zuoye;

import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

public class SetTest {

	public static void main(String[] args) {
		TreeSet hs=new TreeSet();
		
		
		hs.add(new Person("Cindy",78));
		hs.add(new Person("Jerry",89));
		hs.add(new Person("Jack",80));
		hs.add(new Person("WQQQQ",100));
		hs.add(new Person("Dog",69));
		hs.add(new Person("Cat",59));
		hs.add(new Person("xiaohua",79));
		hs.add(new Person("Xiaom",89));
		hs.add(new Person("Hoooo",80));

		
		for (Iterator iterator = hs.iterator(); iterator.hasNext();) {
			Person person = (Person) iterator.next();
			System.out.println(person);

		}
	}

}
