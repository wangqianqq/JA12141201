public class Sub extends Base{
	String str="sub class";//子类特有属性
	
	void sub_show(){
		System.out.println("sub类特有的方法");
	}
	
	void show(){
		System.out.println("子类复写了父类的方法sub class");
	}
	
	public static void main(String[] args){
		//向上转型：默认，基类的引用指向子类的对象
		//不能访问子类新增的属性【】=基类特有的、被子类覆盖的
		Base base = new Sub();
		
		
		//
		/* System.out.println(base.str);
		base.sub_show(); */
		
		System.out.println(base.a);
		base.base_show();
		
		//
		base.show();
		
		//向下转型：子类的引用指向父类的对象
		Sub sub = (Sub)new Base();//强制类型转换
		
		//访问父类的属性
		System.out.println(sub.a);
		sub.base_show();
		
		//子类复写父类的方法
		sub.show();
		
		//访问子类的属性
	}
}