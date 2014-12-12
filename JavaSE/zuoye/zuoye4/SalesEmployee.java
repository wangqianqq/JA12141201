public class SalesEmployee extends Employee{
	double xiaoshoue;
	double tichenglv;
	SalesEmployee(double xiaoshoue,double tichenglv,
	String name,int birthdayMonth){
		super(name,birthdayMonth);
		this.xiaoshoue=xiaoshoue;
		this.tichenglv=tichenglv;
	
	}
	
	public void getSalary(int month){
		double m=0;
		if(birthdayMonth==month){
			m=m+100;
			System.out.println("name:"+name+"\t工资:"+m);
		}else{
			m=xiaoshoue+xiaoshoue*tichenglv;
			System.out.println("name:"+name+"\t工资:"+m);
		}
	}
}