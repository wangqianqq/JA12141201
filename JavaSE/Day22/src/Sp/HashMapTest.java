package Sp;
import java.util.HashMap;
import java.util.Iterator;

public class HashMapTest {

	public static void main(String[] args) {
		HashMap ee = new HashMap();
		Sp sp1=new Sp("1", "香肠",20);
		Sp sp2=new Sp("2", "果脯",10);
		
		ee.put("1",sp1);
		ee.put("2",sp2);
		
		if(ee.containsKey("2")){ //不需要遍历
			System.out.println("该食品信息为");
			
			Sp sp=(Sp)ee.get("2");//转型
			System.out.println(sp.getMingcheng());
			System.out.println(sp.getJiage());
		}else{
			System.out.println("对不起，没有该食品！");
		}
		
		Iterator it = ee.keySet().iterator();
		while (it.hasNext()) {
			String k = (String)it.next();
			Sp sp = (Sp)ee.get(k);
			
			System.out.println("食品名称："+sp.getMingcheng());
			System.out.println("食品价格："+sp.getJiage());
		}
	}

}
