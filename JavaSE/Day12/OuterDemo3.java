class Outer{
	private class Inner{//��privateΪ�˱�֤���ݰ�ȫ��
		public void show(){
			System.out.println("inner");
		}
	}
	
	public void method(){
		Inner i= new Inner();
		i.show();  //���ⲿ���ﴴ��һ������
	}
}

class OuterDemo3{
	public static void main(String[] args){
		//Outer.Inner oi=new Outer().new Inner();//��Ϊ˽�����Σ����Բ�����ֱ�ӷ���
		//oi.show;
		
		Outer o=new Outer();
		o.method();//�ⲿ��Ҫ�����ڲ���ķ���show��Ϊ˽�е���������Ҫ��ӵ���
	}
}
		