/*
 * ���̣��ǲ���ϵͳ��Ӧ�ó�����Դ�������С��λ�������ڽ��еĳ���
 * �̣߳���ϵͳ��ִ���������С��λ���������ִ�е���С��λ�����̵Ķ��ִ������
 * 		�߳����Լ����е�����
 * 			
 * 			����ִ��/ͬʱ
 * ������
 * ����̣�
 * ���̣߳�
 * 	����ϵͳ�����̡��̷߳���ǳ�С��ʱ��Ƭ����OSȡ���ȡ�����л�
 *
 *JVM������Ķ��̣߳�
 *		1��main�̣߳�
 *		2�����������̣߳�
 *	Java��Object
 */
class A{
	//�漰��ϵͳ����Դ��ʱ����Ҫ����дһ�¸÷���
	protected void finalize() throws Throwable{
		System.out.println("�ֶ���������");
		System.out.println(Thread.currentThread().getName());
		super.finalize();
	}
}

public class Demo {
	public static void main(String[] args) {
		System.out.println(Thread.currentThread().getId()+" "+Thread.currentThread().getName());
		A a=new A();
		new A();
		new A();
		System.gc(); //  ��������������

		new A();
		new A();
		new A();
		System.out.println("main����");
			
		}
	}
	


