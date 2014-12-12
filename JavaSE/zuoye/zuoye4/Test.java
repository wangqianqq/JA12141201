public class Test{
	public static void main(String[] args){
		HourlyEmployee a=new HourlyEmployee(15,250,"Cindy",10);
		a.getSalary(10);
		SalariedEmployee b=new SalariedEmployee(4000,"Jack",6);
		b.getSalary(10);
		BasePlusSalesEmployee d=new BasePlusSalesEmployee(3500,100,0.2,"WQ",10);
		d.getSalary(10);
	
	}

}