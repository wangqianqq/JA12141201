package jiccheng;

class SuperClass{
	private int n;//成员变量
	
	//父类的无参构造方法
	SuperClass() {
		System.out.println("SuperClass()");
	}
	
	//父类的一参构造方法
	SuperClass(int n){
		System.out.println("SuperClass("+n+")");
		this.n=n;
	}
}

class SubClass extends SuperClass{
	private int n;//成员变量
	
	SubClass(int n){//子类重写父类的一参构造方法
		System.out.println("SubClass("+n+")");
		this.n=n;
	}
	
	SubClass(){//子类重写父类的无参构造方法
		super(300);//调用父类的一参构造方法
		System.out.println("SubClass()");
	}
}

public class TestSuperSub {
	public static void main(String[] args) {
		
		//SubClass sc1=new SubClass();//调用子类的无参构造方法
		SubClass sc2=new SubClass(400);//调用子类的一参构造方法
	}

}
