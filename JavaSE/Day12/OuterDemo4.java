class Outer{
		static class Inner{//静态的内部类
		public void show(){
			System.out.println("show");
		}
		
		public static void show2(){//内部类里面的静态方法
			System.out.println("show2");
		}
	}

		/* public void method(){//在外部类里创建一个方法
			Inner i=new Inner();//创建一个内部类的对象
			i.show();
			i.show2();//调用内部类的show方法
		} */
} 
class OuterDemo4{
	public static void main(String[] args){
		//如何调用show方法呢？
		/*  Outer o=new Outer();//创建一个外部类的对象
			o.method(); */
		//调用外部类里的方法method，不可以直接调用内部类里的方法show 
		
		
		
		//如果一个内部类是静态的，测试类要想直接访问，这个时候，创建对象的格式和开始的格式不一样，外部类名.内部类名 变量=new外部类名.内部类名()；
		Outer.Inner oi=new Outer.Inner();
		oi.show();
		oi.show2();
		
		
		//调用show2有没有更简单的方法？
		Outer.Inner.show2();//因为show2是静态的方法，而show不是，所以不能这样调用show
	
	
	}
	

}


