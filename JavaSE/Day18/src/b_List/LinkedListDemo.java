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
		
		//����
		ll.addFirst("I");
		ll.add("want");
		ll.add("go");
		ll.add("home");
		ll.add("fan");

		hh.add("wq");
		hh.addLast("fuza");

		System.out.println(ll);
		System.out.println(hh);

		//����ָ��λ�õ�Ԫ��
		ll.add(3,"fan");
		System.out.println(ll);
		
		//��hh���Ԫ�ص���ll��
		ll.addAll(hh);
		System.out.println(ll);
		
		//����Ԫ�ص�ָ��λ��
		ll.addAll(2,hh);
		System.out.println(ll);
		
		//�Ƴ��б�������Ԫ��
//		hh.clear();
//		System.out.println(hh);
		
		//��¡
		System.out.println(ll.clone());
		
		//������б����ָ��Ԫ�ء��򷵻�true
		System.out.println(ll.contains("fan"));
		
		Iterator q=ll.descendingIterator();//����������˳���ڴ�˫�˶��е�Ԫ���Ͻ��е����ĵ�������
		while (q.hasNext()) {
			Object object = (Object) q.next();
			System.out.print(object);
		}
			System.out.println();

		for (Iterator iterator = ll.descendingIterator(); iterator.hasNext();) {
			Object object = (Object) iterator.next();
			System.out.print(object);
			
		}
		System.out.println(ll.element());// ��ȡ�����Ƴ����б��ͷ����һ��Ԫ�أ���
	
		System.out.println(ll.get(4));// ���ش��б���ָ��λ�ô���Ԫ�ء�
		System.out.println(ll.getFirst());// ���ش��б��е�һ��Ԫ�ء�
		System.out.println(ll.getLast());// ���ش��б������һ��Ԫ�ء�
		System.out.println(ll.indexOf("fan"));// ���ش��б����״γ��ֵ�ָ��Ԫ�ص�����,������б��в�������Ԫ�أ��򷵻� -1
		System.out.println(ll.lastIndexOf("fan"));//���ش��б��������ֵ�ָ��Ԫ�ص�������������б��в�������Ԫ�أ��򷵻� -1��

		Iterator w =ll.listIterator();//���ش��б��е�Ԫ�ص��б�����������ʵ�˳�򣩣����б���ָ��λ�ÿ�ʼ��
		System.out.println(w);
		
		ll.offer("bengkui");
		System.out.println(ll);//��ָ��Ԫ����ӵ����б��ĩβ�����һ��Ԫ�أ���
		
		ll.offerFirst("tongku");
		System.out.println(ll);//  �ڴ��б�Ŀ�ͷ����ָ����Ԫ�ء�

		
		
	}

}
