package a_Collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class CollectionDemo {

		 
	public static void main(String[] args) {
		
		Collection coll = new ArrayList();
		Collection co=new ArrayList();
		Collection com=new ArrayList();

		//1�����Ӳ���
		coll.add("Google");
		coll.add("Apple");
		coll.add("Oracle");
		coll.add("Xiaomi");

		
		co.add("Baidu");
		co.add("Alibaba");
		co.add("Tencent");
		coll.add("Xiaomi");

		System.out.println("����"+co);
		System.out.println("����"+coll);

		co.addAll(coll);

		System.out.println("����"+co);
		System.out.println("����"+coll);
		
		//2��ɾ������
//		System.out.println(coll.remove("Xiaomi"));
//		System.out.println(coll.remove("Apple"));
//		System.out.println("����"+coll);
		
		//coll.removeAll(co);//ɾ������===���е�Ԫ��
		//coll.clear();
		//System.out.println("����"+coll);
		
//		coll.retainAll(co);//ȡ����
//		System.out.println("����"+coll);

		//3���жϲ���
//		System.out.println("coll.isEmpty=" + coll.isEmpty());
//		System.out.println("co.isEmpty()=" + co.isEmpty());
//		System.out.println("co.contains=Google=?" + co.contains("Google"));
		
		//�Ӽ��жϣ�
		System.out.println(coll.containsAll(co));
		coll.add("Geminno");
		System.out.println(""+co.containsAll(coll)+co.size());
		
		
		
		Iterator it=co.iterator();
		//����������
			while (it.hasNext()){
				Object object=(Object)it.next();
				//co.add("geminno");	
				co.remove("Baidu");
				System.out.println(object);
				}
			
			System.out.println("----------");	
			for(Iterator it1=co.iterator();it1.hasNext();){
				Object object=(Object)it1.next();
					System.out.println(object);
				}
			
			System.out.println("----------");
			for(Object object:coll){
				coll.add("tes");
				System.out.println("coll:"+object);
			}
				
				
//		System.out.println(""+it.next()+co.size());
//		System.out.println(""+it.next()+co.size());
//
//		it.remove();
//		System.out.println(""+co+co.size());

		
		
	}

}
