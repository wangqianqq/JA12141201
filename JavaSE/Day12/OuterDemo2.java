/* 
需求：在main方法中能不能去调用show方法呢？
不能直接创建对象，但是可以间接的使用。
外部类名.内部类名 变量 = 外部对象.内部类对象。
 */

class Outer{
	private String name = "HelloWorld";
	
	
	//成员内部类
	class Inner{
		public void show(){
			System.out.println(name);
		
		}
	}

}

class OuterDemo2{
	public static void main(String[] args){
		
		//不能直接创建内部类的对象
		//Inner i= new Inner();
		//i.show();
		
		//可以间接的创建内部类的对象。
		//外部类名.内部类名 变量=外部对象.内部对象
		Outer.Inner oi=new Outer().new Inner();
		oi.show();
	}

}