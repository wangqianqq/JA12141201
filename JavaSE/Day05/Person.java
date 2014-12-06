public class Person{
	String name;
	int age;
	char Gender;
	
	/* 
	无参无返回 方法
	*/
	public void eat(){
		System.out.println("我在吃饭");
	}
	/* 
	有参无返回
	*/
	public void sleep(String A){
		System.out.println("我在"+A+"睡觉");
	}




	public static void main(String[] args){
		Person per = new Person();
		per.sleep("床上");
	}
}