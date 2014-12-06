class Dog{
	String name;
	public String print(String n,int a,char b){//n是形参
		System.out.println("n="+n);
		System.out.println("a="+a);
		System.out.println("b="+b);
		
		//return "sjjk";//返回指定类型的值，这里是String类型的
		return n;//也可以返回String类型的变量，在这里n是String类型的变量
	}
	public void str(int a){ //void 无返回类型
		if(a==0){
			System.out.println("你好");
		}else if(a==1){
			return;
		}
		System.out.println("我很好");
	
	}
}
public class E{
	public static void main(String[] args){
	Dog A=new Dog();
	A.print("小明", 12, '男');
	
	//String name =A.print("小明");//小明是实参 String的变量接收一下
	//System.out.println(name);//就近原则 输出的name是main函数里面的方法
	//A.str(1);
	}
}