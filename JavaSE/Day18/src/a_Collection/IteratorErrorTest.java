package a_Collection;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;

public class IteratorErrorTest {

	public static void main(String[] args) {
		//����һ������
		Collection books = new HashSet();//Set
		books.add("���Java����");
		books.add("������Java EE��ҵӦ��ʵս");
		books.add("���Android����");

		//��ȡbooks���϶�Ӧ�ĵ�����
		Iterator it=books.iterator();
		while (it.hasNext()) {
			String	book=(String)it.next();
			System.out.println(book);
			if(book.equals("���Android����")){
				//ʹ��Iterator���������У������޸ļ���Ԫ�أ�������������쳣
				books.remove(book);
			}
		}
	}

}
