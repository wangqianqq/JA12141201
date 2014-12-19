package d_Map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;


/*
 *Map�Ļ���ʹ�ã� 
 * */


public class MapDemo {

	public static void main(String[] args) {
		Map<Integer, String>map=new HashMap<>();
		
		//1�����
		System.out.println(map.put(null,"Ash"));
		System.out.println(map.put(null,"Ashe"));

		System.out.println(map.put(123, "Google"));//key�����ڣ�����null
		System.out.println(map.put(123, "Apple"));//put ����key�ϴζ�Ӧ��value
		System.out.println(map);
		map.put(321, "Baidu");
		map.put(11, "Alibaba");
	
		System.out.println(map);

		//2��ɾ��Ԫ��
		System.out.println(map.remove(1));//key������ʱ��null
		System.out.println(map.remove(11));//���ڣ��Ƴ���ֵ�ԣ�������value
	
		System.out.println(map);
		//	map.clear();
		//	System.out.println(map);

	
		//�ж�
		if(map.containsKey(120)){
			System.out.println("key����");		
		}else{
			System.out.println("key������");
		}
	
		if(map.containsValue("Baidu")){
			System.out.println("value����");		
			}else{
				System.out.println("value������");
			}
		
		if(map.isEmpty()){
			System.out.println("map��");
		}else{
			System.out.println("map�ǿ�: "+ map.size());
		}
		//4����ȡ
		
		System.out.println(map.get(119));//�����ڷ���null
		System.out.println(map.get(123));// ���ڷ���value��ֵ
		
		/*
		* 5������������mapû�е�����
		*a���õ�Key�� set����
		*b��ʹ�ø�set���ϵĵ�������ȥ����key
		*c��ʹ��get + ������==����value
		*
		*/
		
		Set<Integer> key_set = map.keySet();//keySet����      ���ش�ӳ���а����� ���� ���� Set ��ͼ��
		Iterator<Integer> it = key_set.iterator();
		while (it.hasNext()) {
			Integer integer = (Integer) it.next();
			System.out.println(integer);
			System.out.println(map.get(integer));//��ӡ��key��Ӧ��valueֵ
		}
		System.out.println("-----------");
		
		
		Collection<String> co =map.values();//value����   ���ش�ӳ���а����ġ�ֵ���� Collection ��ͼ��
		Iterator<String> it2=co.iterator();
		
		for (Iterator iterator = co.iterator(); iterator.hasNext();) {
			Object object = (Object) iterator.next();
			System.out.println(object);//forѭ����������
		}
		
		while (it2.hasNext()) {  // whileѭ����������
			String string = (String) it2.next();
			System.out.println(string);
		}
		
		
		/*
		 * ʹ��entrySet()������map����ת���ɣ�set���ϣ�ʹ�õ�����
		 * Map.Entry���ͣ�ӳ����=��ֵ�ԡ���-ֵ��
		 *
		 * 
		 * 
		 * 
		 * */
		Set<Map.Entry<Integer, String>> entry_set=map.entrySet();//entrySet()����
		Iterator<Map.Entry<Integer, String>> it1 = entry_set.   iterator();
		
		while (it1.hasNext()) {
			Map.Entry<Integer, String> entry = it1.next();
			System.out.println(entry);//entry.toString();
			
			Integer key = entry.getKey();//��ȡ123
			String value = entry.getValue();//��ȡ�ٶ�
			System.out.println("key:"+key+"\tvalue:"+value);
			
		}
	}
}
