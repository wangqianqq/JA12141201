public class Employee{
	String name;
	int birthdayMonth;
	double salary;
	
	public Employee(String name,int birthdayMonth){
		this.name=name;
		this.birthdayMonth=birthdayMonth;
	}
	
	public void getSalary(int month){
		if(birthdayMonth==month){
			salary=salary+100;
		}
	}
}