package A;


/*
 * ������һ��ѧ�����ҿ��Զ�����������ֵ��Ҳ���Ի�ȡ������ֵ�������̼߳�ͨ�ŵİ�����ʵ�֡�
 * 
 * ��Դ��Student
 * �����̣߳�SetThread
 * ��ȡ�߳�:GetThread
 * �����ࣺStudentDemo
 * 
 * ����1��ÿ���̲߳��������Լ�����һ��ѧ������
 * ��ô������ö���̲߳���ͬһ��ѧ������
 * 
 * */

public class StudentDemo {
	public static void main(String[] args) {
		Student s = new Student();//����һ����Դ
		
		SetThread st = new SetThread(s);//��������Դ��s
		GetThread gt = new GetThread(s);//��������Դ��s
		
		Thread t1=new Thread(st);
		Thread t2=new Thread(gt);
		
		t1.start();
		t2.start();
	}	
}

class Student{//Student��
	String name;
	int    age;
}	
	

//SetThread
class SetThread implements Runnable {
	private Student s ;
		
	//���췽��
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
	
	//���췽��
	public GetThread(Student s) {
		this.s=s;
	}
	
	public void run() {
		System.out.println(s.name +"---"+s.age);
	}
}




