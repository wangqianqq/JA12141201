package b_List;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ListDemo {

	public static void main(String[] args) {
		/*
		 * List:存储各种数据、元素可以重复、有序【可以使用索引访问元素】
		 * 相对Collection::特有方法：带索引index的方法
		 * */
		
		List list = new ArrayList<>();
		
		//1、增操作
		list.add("android-001");
		list.add("android-002");
		list.add("android-003");
		list.add("android-004");
		list.add("android-005");
		
		list.add(3,"Google");
		
//		
//		for(int i=0;i<list.size();i++){
//			System.out.println(list.get(i));
//		}
		
		System.out.println("----------");
		//2、删除操作
		try{
			System.out.println(list.remove(10));
		}catch(Exception e){
			e.printStackTrace();
		}
		
		System.out.println(list.remove("android-103"));
		
		
		//3、修改
		System.out.println(list.set(0, "GDG"));
		
		System.out.println("----------");

		for(int i=0;i<list.size();i++){
			System.out.println(list.get(i));
		}	
		//4、遍历
//		for(Iterator iterator=list.iterator();iterator.hasNext();){
//			Object object=(Object)iterator.next();
//			System.out.println(object);
//		}
//		
//		Iterator it=list.iterator();
//		while (it.hasNext()) {
//			Object object = (Object) it.next();
//			//list.add("test");
//			System.out.println(object);
//		}
//		
		
		System.out.println("--------ListIterator-------");
		//ListIterator:
		ListIterator iit=list.listIterator();
		while(iit.hasNext()){
			Object object=(Object)iit.next();
			iit.add("Alibaba");
			System.out.println(object);
		}
			System.out.println(list);

	}
}
