public class Student{
	String name;
	public Student(String name){
		this.name = name;
	
	}
	
	//��Ա����
	Student get(){
		return this;
	}
	public static void main(String[] args){
		Student s1 = new Student("geminno");
		Student s2 = new Student("genptc");
		
		System.out.println(s1);
		System.out.println(s1.get().name);
		
		System.out.println(s2);
		System.out.println(s2.get().name);
	}
}