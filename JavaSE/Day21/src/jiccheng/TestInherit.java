package jiccheng;


class FatherClass{
	public int value;//成员变量
	
	public void f(){
		value=100;
		System.out.println("FatherClass.value="+value);
	}
}

class ChildClass extends FatherClass{
	public int value;//成员变量
	
	public void f(){
		super.f();
		value=200;
		System.out.println("ChildClass.value="+value);//子类的
		System.out.println(value);//子类的
		System.out.println(super.value);//父类对象的
	}
}
public class TestInherit {
	public static void main(String[] args) {
		ChildClass cc=new ChildClass();
		cc.f();
	}

}
