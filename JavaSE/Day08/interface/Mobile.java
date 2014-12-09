//定义实现类===实现接口
//
public class Mobile implements USB,Wifi{
	private int   num;
	private String brand;
	
	
	//构造函数
	public Mobile(){}
	public Mobile(int num,String brand){
		this.num=num;
		this.brand=brand;
	}
	//get() set()
	
	//info()
	public void info(){
		System.out.println("品牌:" +brand);
		System.out.println("号码:" +num);
	}
	
	
	public void call(){
		System.out.println("打电话");
	
	}
	public void sms(){
		System.out.println("发短信");
	
	}
	
	
	
	//实现类义务：实现接口【所有】的抽象方法
	
	//Wifi
	public void open(){
		System.out.println("Open Wifi");
	}
	public void close(){
		System.out.println("Close Wifi");
	
	}
	//USB
	public void read(){
		System.out.println("Read USB");
	
	}
	public void write(){
		System.out.println("Write USB");
	
	}

}