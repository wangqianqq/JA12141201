class Dog{
	String name;
	public String print(String n,int a,char b){//n���β�
		System.out.println("n="+n);
		System.out.println("a="+a);
		System.out.println("b="+b);
		
		//return "sjjk";//����ָ�����͵�ֵ��������String���͵�
		return n;//Ҳ���Է���String���͵ı�����������n��String���͵ı���
	}
	public void str(int a){ //void �޷�������
		if(a==0){
			System.out.println("���");
		}else if(a==1){
			return;
		}
		System.out.println("�Һܺ�");
	
	}
}
public class E{
	public static void main(String[] args){
	Dog A=new Dog();
	A.print("С��", 12, '��');
	
	//String name =A.print("С��");//С����ʵ�� String�ı�������һ��
	//System.out.println(name);//�ͽ�ԭ�� �����name��main��������ķ���
	//A.str(1);
	}
}