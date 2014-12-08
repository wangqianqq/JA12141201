class BaseClass{
	public int book = 6;
	public void base(){
		System.out.println("父类的普通方法");
	
	}
	public void test(){
		System.out.println("父类的被覆盖的方法");
	
	}
}

public class SubClass extends BaseClass{
//重新定义一个book实例Field隐藏父类的book实例Field
public String book = "哈哈";
public void test(){
	System.out.println("子类的覆盖父类的方法");

}
public void sub(){
	System.out.println("子类的普通方法");
}
public static void main(String[] args){
//下面编译时类型和运行时类型完全一样，因此不存在多态
	BaseClass bc = new BaseClass();
	//输出6
	System.out.println(bc.book);
	//下面两次调用将执行BaseClass的方法
	bc.base();
	bc.test();
	//下面编译时类型和运行时类型完全一样，因此不存在多态
	BaseClass sc = new SubClass();
	//输出”哈哈“
	


}
}