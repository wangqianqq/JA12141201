package a_Collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

public class CollectionTest {

	public static void main(String[] args) {
		Collection c=new ArrayList();
		
		//���Ԫ��
		c.add("�����");
		//��Ȼ�����ﲻ�ܷŻ������͵�ֵ����java֧���Զ�װ��
		c.add(6);
		System.out.println("c���ϵ�Ԫ�ظ���Ϊ��"+c.size());
		
		//ɾ��ָ��Ԫ��
		c.remove(6);
		System.out.println("c���ϵ�Ԫ�ظ���Ϊ��"+c.size());
		
		//�ж��Ƿ����ָ���ַ�
		System.out.println("c�����Ƿ����\"�����\"�ַ�����"+c.contains("�����"));
		
		c.add("������Java EE��ҵӦ��ʵս");
		System.out.println("c���ϵ�Ԫ�أ�"+c);
		
		Collection books = new HashSet();
		books.add("������Java EE��ҵӦ��ʵս");
		books.add("���Java����");
		System.out.println("c�����Ƿ����books���ϣ�"+c.containsAll(books));
		
		//��c���ϼ�ȥbooks�������Ԫ��
		c.removeAll(books);
		System.out.println("c���ϵ�Ԫ�أ�"+c);
		
		//ɾ��c�����������Ԫ��
		c.clear();
		System.out.println("c���ϵ�Ԫ�أ�"+c);
		
		//books������ֻʣ��c������Ҳ������Ԫ��
		books.retainAll(c);//ȡ����
		System.out.println("books���ϵ�Ԫ�أ�"+books);

	}

}
