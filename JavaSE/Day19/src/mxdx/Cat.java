package mxdx;

public class Cat {
	private static int sid = 0;//��̬��Ա����
	private String name;//�Ǿ�̬��Ա����
	int id;

	//���췽��
	Cat(String name){
		this.name=name;
		id=sid++;
	}
	
	//��ͨ����
	public void info(){
		System.out.println("My name is "+ name +" No."+id);
	}
	
	public static void main(String[] args) {
		Cat.sid=100;//��Ϊsid�Ǿ�̬�ģ����Կ������������ϵ�������
		Cat mimi=new Cat("mimi");
		Cat pipi=new Cat("pipi");
		mimi.info();
		pipi.info();
	}

}
