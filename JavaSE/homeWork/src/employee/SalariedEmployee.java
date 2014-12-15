
package employee;

public class SalariedEmployee extends Employee {
	private double monthSalary;//¹Ì¶¨ÔÂÐ½
	
	
	public SalariedEmployee(){
		
		
	}
	
	 
	
	public SalariedEmployee(String name,double monthSalary,int birthMonth) {
		super(name,birthMonth);
		this.monthSalary = monthSalary;
		//super.salary = this.getSalary(birthMonth);
	}
	public double getSalary(int month) {		
		return super.getSalary(month) + this.monthSalary;				
	}		
}
