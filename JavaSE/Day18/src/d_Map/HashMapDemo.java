package d_Map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import bean.Person;

public class HashMapDemo {

	public static void main(String[] args) {
		//Person--City
		HashMap<Person,String> hm = new HashMap<>();
		
		//HashSetԪ���Ƿ���ͬ�����ݣ�hashCode equals
		//HashMapԪ���Ƿ���ͬ�����ݣ�
		hm.put(new Person(100,"IBM"), "USA");
		hm.put(new Person(15,"Alibaba"), "Hangzhou");
		hm.put(new Person(123,"Google"), "Sfancisco");
		hm.put(new Person(12,"Baidu"), "Beijing");
		System.out.println(hm.put(new Person(12,"Baidu"), "Suzhou"));
		
		//������
//		Set<Map.Entry<Person, String>> entry_set=hm.entrySet();
//		for (Iterator iterator = entry_set.iterator(); iterator.hasNext();) {
//			Entry<Person, String> entry = (Entry<Person, String>) iterator.next();
//			
//		}
		
		Iterator<Person> it =hm.keySet().iterator();
		while (it.hasNext()) {
			Person person = (Person) it.next();
			System.out.println("Age:" + person.getAge()+"\tName"+person.getName()+"\tCity	"+hm.get(person));

		}
	}

}
