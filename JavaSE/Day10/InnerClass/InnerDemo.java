class Outer{
	//��Ա����
	int a = 123;
	private String str="�ⲿ��ı���";
	/* Inner in = new Inner();
	in.run(); */  //error ���в����������
	
	
	//��Ա�ڲ���
		class Inner{//�ڲ��಻�����徲̬����
		//static
		final static int a=123;
		String str = "�ڲ���ı���";
		void run(){
			String str="�ֲ�����";//���ڲ���û�����ⲿ��ͬ���ı���
			System.out.println("�ڲ���run()");
			System.out.println(a);
			System.out.println(str);
			System.out.println(this.str);
			System.out.println(Outer.this.str);//�ڲ����з���ͬ�����ⲿ��ķ��� this
			//�ڲ������ֱ�ӷ����ⲿ���еĳ�Ա������˽�г�Ա
		}
		
	}
	
	
	//��Ա����
	void run(){
		System.out.println("�ⲿ��run()");
		Inner in=new Inner();
		in.run();
	}
	//static ����
	static void static_run(){
		System.out.println("�ⲿ���static_run()");
		Outer.Inner in = new Outer().new Inner();
		in.run();
	}
}

public class InnerDemo{
	public static void main(String[] args){
		//�ⲿ���ʹ��
		Outer outer = new Outer();
		//outer.run();
		outer.static_run();	
		
		
		
		//3��Ա�ڲ���
		//Outer out = new Outer();
		//Outer.Inner in = out.new Inner();
		//in.run();
		
		Outer.Inner inner = new Outer().new Inner();//��������
		//Outer.Inner inner = (new Outer()).new Inner();
		inner.run();
	}
}