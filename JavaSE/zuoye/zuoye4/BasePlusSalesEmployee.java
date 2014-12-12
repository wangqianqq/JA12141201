public class BasePlusSalesEmployee extends SalesEmployee{
	double dixin;
	
	BasePlusSalesEmployee(double dixin,double xiaoshoue,double tichenglv,
	String name,int birthdayMonth){
		super(xiaoshoue,tichenglv,name,birthdayMonth);
		this.dixin=dixin;
	}
	
	public void getSalary(int month){
		double h=0;
		h=dixin+xiaoshoue*tichenglv;
		if(birthdayMonth==month){
			h=h+100;
			System.out.println("name:"+name+"\t        工资:"+h);
		}else{
			
			System.out.println("name:"+name+"\t        工资:"+h);
		}
	}
}