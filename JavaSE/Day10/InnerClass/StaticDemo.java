class Outer{
	//��Ա����
	static int a = 123;
	static private String str="�ⲿ��ı���";
	
	
	//��̬�ڲ���
		static class Inner{
			String str = "gem";
		
		//��̬�ڲ��಻�ܷ����ⲿ�Ǿ�̬�ĳ�Ա��ֻ�ܷ����ⲿ��ľ�̬��Ա
			void run(){
				System.out.println(a);
				System.out.println(str);
		
		}
		static String static_str = "�ڲ��ྲ̬����";
		static void static_run(){
			System.out.println("�ڲ��ྲ̬����");
		}
		
	}
	void run(){
			//���ڲ������������෽��
			System.out.println(Inner.static_str);
			Inner.static_run();
	
			//���ڲ����ʵ��������ʵ������
			Inner in = new Inner();
			System.out.println(in.str);
			in.run();
	
	}
	
	
}

public class StaticDemo{
	public static void main(String[] args){
		Outer.Inner in = new Outer.Inner();
	}
}