public class Person{
	String name;
	int age;
	char Gender;
	
	/* 
	�޲��޷��� ����
	*/
	public void eat(){
		System.out.println("���ڳԷ�");
	}
	/* 
	�в��޷���
	*/
	public void sleep(String A){
		System.out.println("����"+A+"˯��");
	}




	public static void main(String[] args){
		Person per = new Person();
		per.sleep("����");
	}
}