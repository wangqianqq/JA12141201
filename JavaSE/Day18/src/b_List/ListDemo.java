package b_List;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ListDemo {

	public static void main(String[] args) {
		/*
		 * List:�洢�������ݡ�Ԫ�ؿ����ظ������򡾿���ʹ����������Ԫ�ء�
		 * ���Collection::���з�����������index�ķ���
		 * */
		
		List list = new ArrayList<>();
		
		//1��������
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
		//2��ɾ������
		try{
			System.out.println(list.remove(10));
		}catch(Exception e){
			e.printStackTrace();
		}
		
		System.out.println(list.remove("android-103"));
		
		
		//3���޸�
		System.out.println(list.set(0, "GDG"));
		
		System.out.println("----------");

		for(int i=0;i<list.size();i++){
			System.out.println(list.get(i));
		}	
		//4������
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
