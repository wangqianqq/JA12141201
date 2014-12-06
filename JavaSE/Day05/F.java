class Cat{
	String name;
	int age;
	public String toString(){  //创建类时没有定义toString方法输出对象时会输出对象的哈希吗值
		return "我的姓名:" +name+ "我的年龄:" +age;
	}
}
public class F{
	public static void main(String[] args){
		//String name=new String("你好");
		Cat one = new Cat();
		one.name="小明";
		one.age=12;
		Cat two = new Cat();
		two.age=16;
		two.name="小红";
		System.out.println(one.toString());
		System.out.println(two);
		/* 比System.out.println(xx),括号里面的”xx“如果不是String类型的话，
		就自动调用xx的toString（）方法 */
		
	}
}