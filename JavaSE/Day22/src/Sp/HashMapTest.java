package Sp;
import java.util.HashMap;
import java.util.Iterator;

public class HashMapTest {

	public static void main(String[] args) {
		HashMap ee = new HashMap();
		Sp sp1=new Sp("1", "�㳦",20);
		Sp sp2=new Sp("2", "����",10);
		
		ee.put("1",sp1);
		ee.put("2",sp2);
		
		if(ee.containsKey("2")){ //����Ҫ����
			System.out.println("��ʳƷ��ϢΪ");
			
			Sp sp=(Sp)ee.get("2");//ת��
			System.out.println(sp.getMingcheng());
			System.out.println(sp.getJiage());
		}else{
			System.out.println("�Բ���û�и�ʳƷ��");
		}
		
		Iterator it = ee.keySet().iterator();
		while (it.hasNext()) {
			String k = (String)it.next();
			Sp sp = (Sp)ee.get(k);
			
			System.out.println("ʳƷ���ƣ�"+sp.getMingcheng());
			System.out.println("ʳƷ�۸�"+sp.getJiage());
		}
	}

}
