package d_Map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;


/*
 *Map的基本使用： 
 * */


public class MapDemo {

	public static void main(String[] args) {
		Map<Integer, String>map=new HashMap<>();
		
		//1、添加
		System.out.println(map.put(null,"Ash"));
		System.out.println(map.put(null,"Ashe"));

		System.out.println(map.put(123, "Google"));//key不存在，返回null
		System.out.println(map.put(123, "Apple"));//put 返回key上次对应的value
		System.out.println(map);
		map.put(321, "Baidu");
		map.put(11, "Alibaba");
	
		System.out.println(map);

		//2、删除元素
		System.out.println(map.remove(1));//key不存在时，null
		System.out.println(map.remove(11));//存在，移除键值对，并返回value
	
		System.out.println(map);
		//	map.clear();
		//	System.out.println(map);

	
		//判断
		if(map.containsKey(120)){
			System.out.println("key存在");		
		}else{
			System.out.println("key不存在");
		}
	
		if(map.containsValue("Baidu")){
			System.out.println("value存在");		
			}else{
				System.out.println("value不存在");
			}
		
		if(map.isEmpty()){
			System.out.println("map空");
		}else{
			System.out.println("map非空: "+ map.size());
		}
		//4、获取
		
		System.out.println(map.get(119));//不存在返回null
		System.out.println(map.get(123));// 存在返回value的值
		
		/*
		* 5、遍历操作：map没有迭代器
		*a、得到Key的 set集合
		*b、使用该set集合的迭代器，去遍历key
		*c、使用get + 迭代器==遍历value
		*
		*/
		
		Set<Integer> key_set = map.keySet();//keySet方法      返回此映射中包含的 【键 】的 Set 视图。
		Iterator<Integer> it = key_set.iterator();
		while (it.hasNext()) {
			Integer integer = (Integer) it.next();
			System.out.println(integer);
			System.out.println(map.get(integer));//打印出key对应得value值
		}
		System.out.println("-----------");
		
		
		Collection<String> co =map.values();//value方法   返回此映射中包含的【值】的 Collection 视图。
		Iterator<String> it2=co.iterator();
		
		for (Iterator iterator = co.iterator(); iterator.hasNext();) {
			Object object = (Object) iterator.next();
			System.out.println(object);//for循环方法遍历
		}
		
		while (it2.hasNext()) {  // while循环方法遍历
			String string = (String) it2.next();
			System.out.println(string);
		}
		
		
		/*
		 * 使用entrySet()方法把map集合转换成：set集合，使用迭代器
		 * Map.Entry类型：映射项=键值对【键-值】
		 *
		 * 
		 * 
		 * 
		 * */
		Set<Map.Entry<Integer, String>> entry_set=map.entrySet();//entrySet()方法
		Iterator<Map.Entry<Integer, String>> it1 = entry_set.   iterator();
		
		while (it1.hasNext()) {
			Map.Entry<Integer, String> entry = it1.next();
			System.out.println(entry);//entry.toString();
			
			Integer key = entry.getKey();//获取123
			String value = entry.getValue();//获取百度
			System.out.println("key:"+key+"\tvalue:"+value);
			
		}
	}
}
