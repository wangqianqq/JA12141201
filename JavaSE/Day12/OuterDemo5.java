
//�ֲ��ڲ���
class Outer{
	public void method(){
		//���뱻final���� A����ֹ��ʹ�ú����ݷ����ı� B����final��Ϊ���ӳ���������������
		final int num =100;
		class Inner{//�ڲ����ڷ����ڲ�  �ֲ��ڲ���
			public void show(){ //�ڲ�������ķ���show
				System.out.println("show" +num);//�ڲ�����ʾֲ��������뱻final����
			}
		}
		Inner i= new Inner();//���ⲿ���д���һ���ڲ���Ķ���
		i.show();//����show����	
	}
}

class OuterDemo5{
	public static void main(String[] args){
		Outer o= new Outer();//����һ���ⲿ��Ķ���
		o.method();//����method����
	}
}