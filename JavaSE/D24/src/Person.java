
 class Person {
	private String name;
	private String location;//��������
	
	//һ�ι��췽��
	Person(String name){
		this.name=name;
		location="beijing";
	}
	
	//���ι��췽��
	Person(String name,String location){
		this.name=name;
		this.location=location;
	}
	
	//����
	public String info(){
		return "name:"+name+"\tlocation:"+location;
	}
}


class Student extends Person{
	private String school;
	
	Student(String name,String school) {
		this(name,"beijing",school);//���ñ��������һ�����췽��
	}	
	
	Student(String n,String l,String school){
		super(n,l);//��n��ֵ���ݸ�name����l��ֵ���ݸ�location
		this.school=school;
	}
	
	public String info() {
		return super.info()+"\tschool:"+school;
		
	}
}

