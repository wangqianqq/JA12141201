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
		//per.sleep("����");
		int age = per.getAge(18);
		System.out.println(age);
}
/* 
�в��з���
 */
 public int getAge(int a){
	return a;
 }
	
}