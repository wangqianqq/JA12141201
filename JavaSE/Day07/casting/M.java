/* 
1、对象的向上转型：子类转成父类 默认进行 父类引用指向子类对象
2、对相当的向下转型 父类转成子类 强制进行

关键字：instanceof测试左边的对象是否是右边类的实例
如果是返回true 不是返回false


 */

class Animal{
	void sleep(){
		System.out.println("睡觉");
	}
}

class Cat extends Animal{
	void catchMouse(){
		System.out.println("捕鼠");
	}
}

class Dog extends Animal{

}

public class M{
	public static void main(String[] args){
		Animal a=new Cat();//向上转型
		//Cat b=(Cat)a;//向下转型   强制转型
		//b.catchMouse();//可以访问子类的方法
		//b.sleep();//可以访问父类的方法
		//Dog d=(Dog)a;//new出来的是毛，不可以以给狗
		System.out.println(a instanceof Animal);
	}
}