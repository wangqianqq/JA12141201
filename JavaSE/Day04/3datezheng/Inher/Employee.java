public class Employee{
	int id;
	String name;
	double salary;
	//���ص��޲ι��캯��
	
	//���캯�������ܱ��̳�
	public Employee(){
		System.out.println("�����޲ι��캯��");
	}
	public Employee(int id){
		System.out.println("����һ�ι��캯��");
	
	}
	
	
	
	
	
	
	public String getName(){
		return name;
	}
	public double getSalary(){
		return salary;
	} 
	public void info(){
		System.out.println("�����info()");
		System.out.println("id:" + id + "\nname:" + name+ "\nsalary:" + salary);
	}
}