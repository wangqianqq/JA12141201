public class Sub extends Base{
	String str="sub class";//������������
	
	void sub_show(){
		System.out.println("sub�����еķ���");
	}
	
	void show(){
		System.out.println("���ิд�˸���ķ���sub class");
	}
	
	public static void main(String[] args){
		//����ת�ͣ�Ĭ�ϣ����������ָ������Ķ���
		//���ܷ����������������ԡ���=�������еġ������า�ǵ�
		Base base = new Sub();
		
		
		//
		/* System.out.println(base.str);
		base.sub_show(); */
		
		System.out.println(base.a);
		base.base_show();
		
		//
		base.show();
		
		//����ת�ͣ����������ָ����Ķ���
		Sub sub=new Sub();				//sub����һ���������
		Base b=new Base();				//����һ���������
		
		if(b instanceof Sub){			//�������Ķ���ʵ��������
		sub=(Sub)b;					//		��sub������ָ��b	b�Ǹ������������Ҫǿ��ת��
		}		
		System.out.println(sub.a);			 //����ת�ͺ���Է��ʸ��������
		sub.show();							//���Է��ʱ����ิд�ķ���
		sub.base_show();					//���Է��ʸ������еķ���
		sub.sub_show();				//���Է���Sub�����еķ���
/* 
		Base ba = new Sub();
		Sub sub = (Sub)ba;//ǿ������ת��
		
		//���ʸ��������
		System.out.println(sub.a);
		sub.base_show();
		
		//���ิд����ķ���
		sub.show();
		
		//������������� */
	}
}