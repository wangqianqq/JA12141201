class Cat{
	String name;
	int age;
	public String toString(){  //������ʱû�ж���toString�����������ʱ���������Ĺ�ϣ��ֵ
		return "�ҵ�����:" +name+ "�ҵ�����:" +age;
	}
}
public class F{
	public static void main(String[] args){
		//String name=new String("���");
		Cat one = new Cat();
		one.name="С��";
		one.age=12;
		Cat two = new Cat();
		two.age=16;
		two.name="С��";
		System.out.println(one.toString());
		System.out.println(two);
		/* ��System.out.println(xx),��������ġ�xx���������String���͵Ļ���
		���Զ�����xx��toString�������� */
		
	}
}