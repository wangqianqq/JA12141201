package bean;

import java.util.ArrayList;
import bean.Person;
public class ArrayListDemo2 {

	
	public static void main(String[] args) {
		ArrayList a1 =new ArrayList();
		
		for(int i=0;i<5;i++){
			a1.add(new Person(i,"it-"+i));
		}
		Person p=new Person(3,"it-3");
		a1.add(p);
		a1.add(new Person(3,"it-3"));
		
		System.out.println(a1);
		System.out.println(a1.indexOf(p)+"---"+a1.lastIndexOf(p));

		System.out.println(a1.indexOf(new Person(3,"it-3"))+"---"+a1.lastIndexOf(new Person(3,"it-3")));

	}

}
