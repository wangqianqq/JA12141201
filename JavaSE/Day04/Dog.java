public class Dog{
	int age;
	String color;
	String name;
	Double weight;
	Dog(int age){
		System.out.println("�Ұ��Թ�ͷ");
		this.age= age;
	}
	Dog(String color,Double weight,String name){
		System.out.println("��Һ�,����С����");
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