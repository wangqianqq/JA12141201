/*ʲôʱ��ʹ�þ�̬
static�����ε������ǳ�Ա����Ա������������
�����������֣�
ʲôʱ��ʹ�þ�̬�ĳ�Ա������
������ͬһ�����������ж�����ֹ�������ʱ����Ҫ���洢����������ݵĳ�Ա������static����

ʲôʱ��ʹ�þ�̬����:
�������ڲ�û�з��ʵ��Ǿ�̬�ĳ�Աʱ���������е����ݣ�����ô�ù��ܿ��Զ���ɾ�̬��
*/


public class B{
	public static void main(String[] args){
		Person A = new Person();
		A.name="С��";
		//A.country="�й�";
		Person B = new Person();
		B.name = "���";
		
		A.print();
		B.print();
		//B.country="�й�";
		//System.out.println(B.country);
		//System.out.println(B.name); 
	}
}
class Person{
	String name;
	static String country;
	
	 void print(){
		System.out.println(name + "���");
	}
}