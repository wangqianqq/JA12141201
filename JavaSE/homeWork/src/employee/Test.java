package employee;

public class Test {

	public static void main(String[] args) {
		//�̶���нԱ��
		SalariedEmployee se = new SalariedEmployee("Google",22222.22,1);
		System.out.println("name:" + se.getName() + "\tSalary:" +se.getSalary(1));
		System.out.println("name:" + se.getName() + "\tSalary:" +se.getSalary(12));
	
		//Сʱ��
		HourEmployee heEmployee = new HourEmployee("Baidu",2,10,159);
		System.out.println("name:" + se.getName() + "\tSalary:" +se.getSalary(2));
		System.out.println("name:" + se.getName() + "\tSalary:" +se.getSalary(12));
		
		//�޵�н����
		SalesEmployee sEmployee = new SalesEmployee("Alibaba",3,900000,0.2f);
		System.out.println("name:" + sEmployee.getName() + "\tSalary:" +sEmployee.getSalary(3));
		System.out.println("name:" + sEmployee.getName() + "\tSalary:" +sEmployee.getSalary(12));

		//�е�н����
		BasePlusSalesEmployee be = new BasePlusSalesEmployee("Oracle",4,100000.0,0.2f,8888);
		System.out.println("name:" + be.getName() + "\tSalary:" +be.getSalary(4));
		System.out.println("name:" + be.getName() + "\tSalary:" +be.getSalary(12));


	}

}
