class Outer{
	//成员变量
	int a = 123;
	private String str="外部类的变量";
	/* Inner in = new Inner();
	in.run(); */  //error 类中不可以有语句
	
	
	//成员内部类
		class Inner{//内部类不允许定义静态变量
		//static
		final static int a=123;
		String str = "内部类的变量";
		void run(){
			String str="局部变量";//在内部中没有与外部类同名的变量
			System.out.println("内部类run()");
			System.out.println(a);
			System.out.println(str);
			System.out.println(this.str);
			System.out.println(Outer.this.str);//内部类中访问同名的外部类的方法 this
			//内部类可以直接访问外部类中的成员，包括私有成员
		}
		
	}
	
	
	//成员方法
	void run(){
		System.out.println("外部类run()");
		Inner in=new Inner();
		in.run();
	}
	//static 方法
	static void static_run(){
		System.out.println("外部类的static_run()");
		Outer.Inner in = new Outer().new Inner();
		in.run();
	}
}

public class InnerDemo{
	public static void main(String[] args){
		//外部类的使用
		Outer outer = new Outer();
		//outer.run();
		outer.static_run();	
		
		
		
		//3成员内部类
		//Outer out = new Outer();
		//Outer.Inner in = out.new Inner();
		//in.run();
		
		Outer.Inner inner = new Outer().new Inner();//匿名对象
		//Outer.Inner inner = (new Outer()).new Inner();
		inner.run();
	}
}