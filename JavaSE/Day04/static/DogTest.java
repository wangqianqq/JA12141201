//？【成员变量】初始化工作？===构造函数
//？【类变量】能不能再构造函数中初始化
public class DogTest{
	public static void main(String[] args){
		//类变量
		System.out.println("Dog.type=" + Dog.type);
		Dog.type = "藏獒"; 
		System.out.println("Dog.type=" + Dog.type);
	/*
		
		//类变量
		System.out.println("dog.type=" + dog.type);
		System.out.println("dog2.type=" + dog2.type);
		System.out.println("Dog.type=" + D og.type);
		
		//实例变量:依赖于对象
		System.out.println("dog.age=" + dog.age);
		System.out.println("dog2.age=" + dog2.age);
		*/
		//Dog.age = 123;
	
		
		Dog  dog = new Dog(12,"Red");
		Dog dog2 = new Dog(15, "Black");
		dog.bark();//this===dog
		dog2.bark();//this===dog2
		//使用对象引用 访问 类方法
		dog.bark1();
		dog2.bark1();
	}
}