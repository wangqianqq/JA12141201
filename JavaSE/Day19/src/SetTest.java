import java.util.HashSet;
import java.util.Set;


public class SetTest {
	public static void main(String[] args) {
		Set books=new HashSet();
		
		//���һ���ַ�������
		books.add(new String("���java����"));
		
		//�ٴ����һ���ַ�������
		//��Ϊ�����ַ�������ͨ��equals�����Ƚ����
		//�������ʧ�ܣ�����false
		boolean result = books.add(new String("���java����"));
		//�����������������ֻ��һ��Ԫ��
		System.out.println(result+"-->"+books);
	}

}