/* 
��̬���������Ϊ������ڵĶ�����̬
�����è��������
�� ���� Ů��

1����̬������
��������ָ���������
2����̬��ǰ��
��1�������������֮����ڹ�ϵ�������Ǽ̳й�ϵ��Ҳ������ʵ�ֹ�ϵ
��2�����������д
3����̬�ĺô�
�������˳���Ŀ���չ��
4����̬�ı׶�
��ߵĳɴֿ���չ�ԣ�ֻ���ø�������÷��ʵ������еĳ�Ա



��̬��Ա�������ص㣺
1�������ڼ䣺���ĵ��������ͱ��������������Ƿ��е��õķ���
2�������ڼ䣺���Ķ��������������Ƿ��е��õķ���

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


class Pig extends Animal{
	void sing(){
		System.out.println("��֮��");
	}
 }
 
 public class N{
	public static void main(String[] args){
	
		Cat c=new Cat();
		/* //c.sing();
		Cat c1=new Cat();
		function(c1); */
		function(c);
		
		Dog d=new Dog();
		function(d);
		
		Pig p=new Pig();
		function(p);
		
		/* c1.sing();
		Cat c2=new Cat();
		c2.sing();	   */
	}
	public static void function(Animal c){ //Animal c=new Cat();
	//���า�Ǹ���ķ�����ͨ����������õ��÷���ʱʵ���ϵ��õ������෽��
		
		c.sing();
	}
	
	/* public static void function(Dog d){
		d.sing();
	
	
	} */
 
 }