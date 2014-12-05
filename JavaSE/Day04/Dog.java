public class Dog{
	int age;
	String color;
	String name;
	Double weight;
	Dog(int age){
		System.out.println("我爱吃骨头");
		this.age= age;
	}
	Dog(String color,Double weight,String name){
		System.out.println("大家好,我是小花狗");
		this.color= color;
		this.weight= weight;
		this.name= name;
	}
	
	void setName(String name){
		this.name=name;
	}
	//void getName(){
		//return this.name;
	
	//}
	void info(){
		System.out.println("age:" + this.age + "\tcolor:" + this.color + "\tweight:" + this.weight);
	}

}