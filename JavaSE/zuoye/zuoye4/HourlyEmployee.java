public class HourlyEmployee extends Employee{
	double hourlySalary;
	double hour;

	
	HourlyEmployee(double hourlySalary,double hour,String name,
	int birthdayMonth){
		super(name,birthdayMonth);
		this.hourlySalary=hourlySalary;
		this.hour=hour;
	}
	public void getSalary(int month){
		double salary2;
		if(hour<=160){
			salary2=hour*hourlySalary;
		}else{
			salary2=(160*hourlySalary)+(hour-160)*1.5*hour*hourlySalary;
		
		
		}
		if(month==birthdayMonth){
			System.out.println("name:"+name+"\t工资："+salary2+100);
		}else{
			System.out.println("name:"+name+"\t工资:"+salary2);
		
		}
	}
}