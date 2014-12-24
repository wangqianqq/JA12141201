
 class Person {
	private String name;
	private String location;//声明变量
	
	//一参构造方法
	Person(String name){
		this.name=name;
		location="beijing";
	}
	
	//二参构造方法
	Person(String name,String location){
		this.name=name;
		this.location=location;
	}
	
	//方法
	public String info(){
		return "name:"+name+"\tlocation:"+location;
	}
}


class Student extends Person{
	private String school;
	
	Student(String name,String school) {
		this(name,"beijing",school);//调用本类的另外一个构造方法
	}	
	
	Student(String n,String l,String school){
		super(n,l);//把n的值传递给name，把l的值传递给location
		this.school=school;
	}
	
	public String info() {
		return super.info()+"\tschool:"+school;
		
	}
}

