import java.util.Scanner;
public class Test1{
	public static void main(String[] args) {
		long a = 0;
			System.out.println("����һ����");
		
		// �Ӽ��̻�ȡһ����
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		long i = sc.nextInt();
		
		// ��Ϊ֮���i��ı� �����ȸ�ֵ��l
		long L = i;
		
		// ���������Ǽ�λ��
			System.out.println("�������  " + (i + "") + " ��  " + (i + "").length()+ "λ��");
		
		// ͨ��for ѭ�� ���������β���� �õ�a
		for (int k = 0; k < (L + "").length(); k++) {
		a = a * 10 + i % 10;
		i = i / 10;
	    }
	
	
	// �ж���β�������Ƿ����ԭֵ
		if (a == L) {
			System.out.println("�������" + L + "�ǻ�����");
		} else {
			System.out.println("�������" + L + "���ǻ�����");
	    }
	}
}