package b_List;
import java.util.ArrayList;
import java.util.Iterator;

import javax.rmi.ssl.SslRMIClientSocketFactory;
public class ArrayListDemo {

	public static void main(String[] args) {
		ArrayList a1=new ArrayList();
		
		for(int i=0;i<5;i++){
			a1.add("it-" +i);//�Զ�װ�� �����������ͷ�װ�ɶ���
		}
		
		//������
		for(int i =0;i<a1.size();i++){//����forѭ��
			
		}
		
		
		
		
		for (Iterator iterator = a1.iterator(); iterator.hasNext();) {
			Object object = (Object) iterator.next();
			System.out.println(object);
		}
		
		
		for(Object str:a1){
			System.out.println(str);
		}
	
		Iterator iterator = a1.iterator();
		while(iterator.hasNext()){
			Object object = (Object) iterator.next();
			System.out.println(object);
		}
		
	}

}
