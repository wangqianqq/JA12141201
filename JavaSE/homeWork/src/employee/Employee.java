package employee;

public class Employee {
	String name;
	double salary; //��нˮ
	int birthMonth;
	
	//alt+shift+s
	public Employee(){}
	public Employee(String name, int birthMonth) {
		super();
		this.name = name;
		this.birthMonth = birthMonth;
	}



	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public double getSalary(int month) {
		if(this.birthMonth==month){
			System.out.println("ף"+this.name+"���տ���");
			return this.salary + 100;
		}else{
			return this.salary;	
		}
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public int getBirthMonth() {
		return birthMonth;
	}
	public void setBirthMonth(int birthMonth) {
		this.birthMonth = birthMonth;
	}
}
