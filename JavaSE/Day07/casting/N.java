/* 
��̬���������Ϊ������ڵĶ�����̬
�����è��������
�� ���� Ů��

 */
 class Animal{
	void sing(){
		System.out.println("����");
		
	}
 
 }
 class Dog extends Animal{
	void sing(){
		System.out.println("�����ĳ���");
	
	
	}
 
 }
 
 class Cat extends Animal{
	void sing(){
		System.out.println("�����ĳ���");
		
	}
	void catchMouse(){
		System.out.println("����");
	
	}
 
 }
 
 public class N{
	public static void main(String[] args){
		Cat c=new Cat();
		/* //c.sing();
		Cat c1=new Cat();
		function(c1); */
		function(c);
		/* Dog d=new Dog();
		function(d);
		/* c1.sing();
		Cat c2=new Cat();
		c2.sing();	  */ 
	}
	public static void function(Animal c){ //Animal c=new Cat();//���า�Ǹ���ķ�����ͨ����������õ��÷���ʱʵ���ϵ��õ������෽��
		c.sing();
	}
	/* public static void function(Dog d){
		d.sing();
	
	
	} */
 
 }