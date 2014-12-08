/* 
多态：可以理解为事物存在的多种形态
动物：，猫，狗，猪
人 男人 女人

1、多态的体现
父类引用指向子类对象
2、多态的前提
（1）必须得类与类之间存在关系，可以是继承关系，也可以是实现关系
（2）必须得有重写
3、多态的好处
大大提高了程序的可扩展性
4、多态的弊端
提高的成粗可扩展性，只能用父类的引用访问到父类中的成员



多态成员变量的特点：
1、编译期间：参阅的是引用型变量所属的类中是否有调用的方法
2、运行期间：参阅对象所属的类中是否有调用的方法

 */
 class Animal{
	void sing(){
		System.out.println("唱歌");
		
	}
 
 }
 class Dog extends Animal{
	void sing(){
		System.out.println("汪汪的唱歌");
	}
 
 }
 
 class Cat extends Animal{
	void sing(){
		System.out.println("喵喵的唱歌");
		
	}
	void catchMouse(){
		System.out.println("捕鼠");
	}
}


class Pig extends Animal{
	void sing(){
		System.out.println("猪之歌");
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
	//子类覆盖父类的方法，通过父类的引用调用方法时实际上调用的是子类方法
		
		c.sing();
	}
	
	/* public static void function(Dog d){
		d.sing();
	
	
	} */
 
 }