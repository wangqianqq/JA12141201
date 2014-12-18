package mxdx;

public class Cat {
	private static int sid = 0;//静态成员变量
	private String name;//非静态成员变量
	int id;

	//构造方法
	Cat(String name){
		this.name=name;
		id=sid++;
	}
	
	//普通方法
	public void info(){
		System.out.println("My name is "+ name +" No."+id);
	}
	
	public static void main(String[] args) {
		Cat.sid=100;//因为sid是静态的，所以可以用类名加上点来引用
		Cat mimi=new Cat("mimi");
		Cat pipi=new Cat("pipi");
		mimi.info();
		pipi.info();
	}

}
