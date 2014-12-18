package b_List;

import java.io.ObjectInputStream.GetField;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;

import javax.lang.model.element.Element;

import org.omg.CosNaming.NamingContextExtPackage.AddressHelper;

public class LinkedListDemo {

	public static void main(String[] args) {
		LinkedList ll =new LinkedList();
		LinkedList hh =new LinkedList();
		
		//增加
		ll.addFirst("I");
		ll.add("want");
		ll.add("go");
		ll.add("home");
		ll.add("fan");

		hh.add("wq");
		hh.addLast("fuza");

		System.out.println(ll);
		System.out.println(hh);

		//增加指定位置的元素
		ll.add(3,"fan");
		System.out.println(ll);
		
		//将hh里的元素导入ll里
		ll.addAll(hh);
		System.out.println(ll);
		
		//导入元素到指定位置
		ll.addAll(2,hh);
		System.out.println(ll);
		
		//移除列表中所有元素
//		hh.clear();
//		System.out.println(hh);
		
		//克隆
		System.out.println(ll.clone());
		
		//如果此列表包含指定元素。则返回true
		System.out.println(ll.contains("fan"));
		
		Iterator q=ll.descendingIterator();//返回以逆向顺序在此双端队列的元素上进行迭代的迭代器。
		while (q.hasNext()) {
			Object object = (Object) q.next();
			System.out.print(object);
		}
			System.out.println();

		for (Iterator iterator = ll.descendingIterator(); iterator.hasNext();) {
			Object object = (Object) iterator.next();
			System.out.print(object);
			
		}
		System.out.println(ll.element());// 获取但不移除此列表的头（第一个元素）。
	
		System.out.println(ll.get(4));// 返回此列表中指定位置处的元素。
		System.out.println(ll.getFirst());// 返回此列表中第一个元素。
		System.out.println(ll.getLast());// 返回此列表中最后一个元素。
		System.out.println(ll.indexOf("fan"));// 返回此列表中首次出现的指定元素的索引,如果此列表中不包含该元素，则返回 -1
		System.out.println(ll.lastIndexOf("fan"));//返回此列表中最后出现的指定元素的索引，如果此列表中不包含该元素，则返回 -1。

		Iterator w =ll.listIterator();//返回此列表中的元素的列表迭代器（按适当顺序），从列表中指定位置开始。
		System.out.println(w);
		
		ll.offer("bengkui");
		System.out.println(ll);//将指定元素添加到此列表的末尾（最后一个元素）。
		
		ll.offerFirst("tongku");
		System.out.println(ll);//  在此列表的开头插入指定的元素。

		
		
	}

}
