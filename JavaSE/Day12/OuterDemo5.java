
//局部内部类
class Outer{
	public void method(){
		//必须被final修饰 A：防止在使用后数据发生改变 B：在final是为了延长变量的声明周期
		final int num =100;
		class Inner{//内部类在方法内部  局部内部类
			public void show(){ //内部类里面的方法show
				System.out.println("show" +num);//内部类访问局部变量必须被final修饰
			}
		}
		Inner i= new Inner();//在外部类中创建一个内部类的对象
		i.show();//调用show方法	
	}
}

class OuterDemo5{
	public static void main(String[] args){
		Outer o= new Outer();//创建一个外部类的对象
		o.method();//调用method方法
	}
}