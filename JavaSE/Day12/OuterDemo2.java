/* 
������main�������ܲ���ȥ����show�����أ�
����ֱ�Ӵ������󣬵��ǿ��Լ�ӵ�ʹ�á�
�ⲿ����.�ڲ����� ���� = �ⲿ����.�ڲ������
 */

class Outer{
	private String name = "HelloWorld";
	
	
	//��Ա�ڲ���
	class Inner{
		public void show(){
			System.out.println(name);
		
		}
	}

}

class OuterDemo2{
	public static void main(String[] args){
		
		//����ֱ�Ӵ����ڲ���Ķ���
		//Inner i= new Inner();
		//i.show();
		
		//���Լ�ӵĴ����ڲ���Ķ���
		//�ⲿ����.�ڲ����� ����=�ⲿ����.�ڲ�����
		Outer.Inner oi=new Outer().new Inner();
		oi.show();
	}

}