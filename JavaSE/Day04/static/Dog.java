public class Dog{
	//����
	//�����  �������ڶ�������.�������    //Ʒ��
	static String  type; 
	
	//ʵ�������������ڶ��󡾶������� .ʵ��������
	int     age;        
	String  color;
	//��̬�����
	static {   //ʹ������ʼ�� �����
		type = "XXXXXXX";
		System.out.println("������static�������");
		
		//age = 321;  //!��ֹʵ������
		//color = "YYY";
	
	}

	//����
	Dog(){
	}
	Dog(int age, String color){
		this.type ="��ʿ��";
		this.age = age;
		this.color=color;
	}
	//ʵ������:this��������ߵ�����
	void bark(){
		this.type = "̩��";
		System.out.println("barking......" + age "\t" + color);
	}
	//�෽�������ܷ��ʡ�ʵ��������===���������ڶ���
	//static��abstract����ͬʱ����
	static void bark1(){
	//û�ж������Բ��ܷ���ʵ��������ʵ������
		//ֻ�ܷ�����������ֲ�����
		type = "����";
		System.out.println("�෽��");
	}
	
}