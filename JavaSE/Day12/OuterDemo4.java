class Outer{
		static class Inner{//��̬���ڲ���
		public void show(){
			System.out.println("show");
		}
		
		public static void show2(){//�ڲ�������ľ�̬����
			System.out.println("show2");
		}
	}

		/* public void method(){//���ⲿ���ﴴ��һ������
			Inner i=new Inner();//����һ���ڲ���Ķ���
			i.show();
			i.show2();//�����ڲ����show����
		} */
} 
class OuterDemo4{
	public static void main(String[] args){
		//��ε���show�����أ�
		/*  Outer o=new Outer();//����һ���ⲿ��Ķ���
			o.method(); */
		//�����ⲿ����ķ���method��������ֱ�ӵ����ڲ�����ķ���show 
		
		
		
		//���һ���ڲ����Ǿ�̬�ģ�������Ҫ��ֱ�ӷ��ʣ����ʱ�򣬴�������ĸ�ʽ�Ϳ�ʼ�ĸ�ʽ��һ�����ⲿ����.�ڲ����� ����=new�ⲿ����.�ڲ�����()��
		Outer.Inner oi=new Outer.Inner();
		oi.show();
		oi.show2();
		
		
		//����show2��û�и��򵥵ķ�����
		Outer.Inner.show2();//��Ϊshow2�Ǿ�̬�ķ�������show���ǣ����Բ�����������show
	
	
	}
	

}


