class Outer{
	private class Inner{//加private为了保证数据安全性
		public void show(){
			System.out.println("inner");
		}
	}
	
	public void method(){
		Inner i= new Inner();
		i.show();  //在外部类里创建一个方法
	}
}

class OuterDemo3{
	public static void main(String[] args){
		//Outer.Inner oi=new Outer().new Inner();//因为私有修饰，所以不可以直接访问
		//oi.show;
		
		Outer o=new Outer();
		o.method();//外部类要调用内部类的方法show因为私有的修饰所以要间接调用
	}
}
		