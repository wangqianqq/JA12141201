class BaseClass{
	public int book = 6;
	public void base(){
		System.out.println("�������ͨ����");
	
	}
	public void test(){
		System.out.println("����ı����ǵķ���");
	
	}
}

public class SubClass extends BaseClass{
	//���¶���һ��bookʵ��Field���ظ����bookʵ��Field
	public String book = "����";
	public void test(){
		System.out.println("����ĸ��Ǹ���ķ���");

	}
	public void sub(){
		System.out.println("�������ͨ����");
	}

	public static void main(String[] args){

	//�������ʱ���ͺ�����ʱ������ȫһ������˲����ڶ�̬
			BaseClass bc = new BaseClass();
	
		//���6
		System.out.println(bc.book);
	
		//�������ε��ý�ִ��BaseClass�ķ���
		bc.base();
		bc.test();
	
		//�������ʱ���ͺ�����ʱ������ȫһ������˲����ڶ�̬
		BaseClass sc = new SubClass();
	
		//�����������
		System.out.println(sc.book);
	
		//������ý�ִ�дӸ���̳е���base����
		sc.base();
	
		//������ý�ִ�е�ǰ���test����
		sc.test();
	
		//�������ʱ���ͺ�����ʱ���Ͳ�һ������̬����
		BaseClass ploymophicBc = new SubClass();
	
		//��� 6-�������ʵ��Ǹ���Field
		System.out.println(ploymophicBc.book);
	
		//���潫���ôӸ���̳е���base����
		ploymophicBc.base();
	
		//���潫ִ�е�ǰ���test����
		ploymophicBc.test();
	
		//��ΪploymophicBc�ı���ʱ������BaseClass
		//BaseClass��û���ṩsub��������������������ʱ����ִ���
		//ploymophicBc.sub();
	


	}
}