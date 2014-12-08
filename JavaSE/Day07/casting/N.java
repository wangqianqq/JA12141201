/* 
多态：可以理解为事物存在的多种形态
动物：，猫，狗，猪
人 男人 女人

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
	public static void function(Animal c){ //Animal c=new Cat();//子类覆盖父类的方法，通过父类的引用调用方法时实际上调用的是子类方法
		c.sing();
	}
	/* public static void function(Dog d){
		d.sing();
	
	
	} */
 
 }