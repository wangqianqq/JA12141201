class Outer{
	int a=123;
	private String str = "geminno";
	
	void run(){
		String local_var = "�ֲ�����";
		final int num = 1111;
		
		//�ֲ��ڲ���
		//public class Inner{//error �ֲ��ڲ��಻��ʹ�÷������η�����
		//static class Inner{//error ����ʹ��static
		
		class Inner{
			int aaa = 888;
			//static String var="static var";//error ���ܶ��徲̬����
			
			void inner_run(){	
			//System.out.println("�ڲ���:��Ա����"+local_var);
			//���ܷ��ʾֲ�����local_var,�ֲ�����
			System.out.println("�ڲ���:��Ա����"+num);
			System.out.println(a + "\t"+ str);
			System.out.println(Outer.this.str);//�ⲿ�� ��Ա����
			}
		}
	
		Inner in = new Inner();
		in.inner_run();
	}
}

public class LocalInner{
	public static void main(String[] args){
		Outer out =new Outer();
		out.run();
	}
}