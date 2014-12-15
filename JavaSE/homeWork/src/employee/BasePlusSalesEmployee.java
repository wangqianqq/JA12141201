package employee;

public class BasePlusSalesEmployee extends SalesEmployee {
	private double baseSalary;

	public BasePlusSalesEmployee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public BasePlusSalesEmployee(String name, int birthMonth, double sales,
			float percent, double baseSalary) {
		super(name, birthMonth, sales, percent);
		this.baseSalary = baseSalary;
	}

	@Override
	public double getSalary(int month) {
		return super.getSalary(month) + this.baseSalary;
	}	
}
