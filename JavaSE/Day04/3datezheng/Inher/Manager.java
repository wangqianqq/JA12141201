public class Manager extends Employee{
	//特有属性
	String car;
	String office;
	
	//子类构造方法：必须调用【父类构造方法】
	//子类无参构造方法 + 没有显式调用父类构造函数 = 自动调用父类的无参构造【系统、自定义】
	public Manager(){ 
		super();
		System.out.println("子类无参构造函数");
	}
	
	
	//子类一参构造方法
	public Manager(int id){
		super(id);//父类的构造函数
		System.out.println("子类一参构造函数");
	  	this.id = id;
	}
	public Manager(int id, String name){
		
		
		
		this(id);  //this----->一参构造函数
		//super();
		System.out.println("子类两参构造函数");
		//this.id = id;
		
		this.name = name;
	}
	
	//特有方法
	public void drive(){
		System.out.println("super.name:" + super.name + "开" + this.car + "上班");
		System.out.println("this.name:" + this.name);
	}
	//super:父类的引用
	public void info(){
		System.out.println("子类的info()");
		//System.out.println("id:" + id + "\nname:" + name+ "\nsalary:" + salary);
		super.info();
		System.out.println("car:" + car + "\noffice:" + office);
		
	}
}