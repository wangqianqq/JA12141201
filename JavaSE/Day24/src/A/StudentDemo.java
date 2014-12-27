package A;


/*
 * 需求：有一个学生，我可以对其属性设置值，也可以获取其属性值。请用线程间通信的案例来实现。
 * 
 * 资源：Student
 * 设置线程：SetThread
 * 获取线程:GetThread
 * 测试类：StudentDemo
 * 
 * 问题1：每个线程操作的是自己的那一个学生对象。
 * 怎么解决：让多个线程操作同一个学生对象。
 * 
 * */

public class StudentDemo {
	public static void main(String[] args) {
		Student s = new Student();//创建一个资源
		
		SetThread st = new SetThread(s);//操作的资源是s
		GetThread gt = new GetThread(s);//操作的资源是s
		
		Thread t1=new Thread(st);
		Thread t2=new Thread(gt);
		
		t1.start();
		t2.start();
	}	
}

class Student{//Student类
	String name;
	int    age;
}	
	

//SetThread
class SetThread implements Runnable {
	private Student s ;
		
	//构造方法
	public SetThread(Student s) {
		this.s=s;
	}
		
		
	public void run() {
		s.name=("wq");
		s.age=23;
	}
}


//GetThread
class GetThread implements Runnable{
	private Student s;
	
	//构造方法
	public GetThread(Student s) {
		this.s=s;
	}
	
	public void run() {
		System.out.println(s.name +"---"+s.age);
	}
}




