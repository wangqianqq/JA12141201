/* 
static关键字
作用：是一个修饰符，用于修饰成员（成员变量，成员方法）
1、被static修饰后的成员变量只有一份 
2、当成员被static修饰之后，多了一种访问方式，除了可以对象调用之外，还可以被类直接调用（类名。静态成员）

static特点：
1、随着类的加载而被加载
2、优先于对象的存在
3、被所有的对象所共享
4、可以直接被类名所调用

存放位置
类变量随着类的加载而存在于data内存区
实例biansuizhe对象的简历而存在于堆内存。

生命周期：
1、类变量生命周期最长，随着类的消失而消失
2、实例变量生命比类变量短，它是随着对象的消失而消失。

方法的注意事项：
1、静态的方法只能访问静态的成员
2、非静态的方法既能访问静态的成员（成员变量，成员方法），也能访问非静态的成员。
3、静态的方法中是不可以定义this super关键字的，因为静态优先于对象存在，所以静态方法不可以出现this
*/

public class A{
	public static void main(String[] args){
		Student M = new Student();
		M.country="中国";
		//Student N = new Student();
		//M.print();
		Student.print();
		//System.out.println(M.country);
	}
}

class Student{   //在class里的才是成员
	String name;//实例变量
	int age;   //实例变量
	static String country;//静态变量（类变量）
	
	static void print(){   //方法
		//static String AA="你好世界";//在这里AA是局部变量，局部变量是不可以被static修饰的
		System.out.println(country);//静态的方法只能访问静态的成员
		//System.out.println(this.country);//静态的方法中是不可以定义this super关键字的
	}
	
	void p(){
		System.out.println(country);//非静态的方法既能访问静态的成员（成员变量，成员方法），也能访问非静态的成员。
	}
}