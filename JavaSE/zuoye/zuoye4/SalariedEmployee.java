public class SalariedEmployee extends Employee{
	double salary1;
	SalariedEmployee(double salary1,String name,int birthdayMonth){
		super(name,birthdayMonth);
		this.salary1=salary1;
		
	}
	public void getSalary(int month){
		if(month==birthdayMonth){
			salary1=salary1+100;
			System.out.println("name:"+name+"\t工资:"+salary1);
		}else{
			System.out.println("name:"+name+"\t工资:"+salary1);
		
		}
	}
	
}