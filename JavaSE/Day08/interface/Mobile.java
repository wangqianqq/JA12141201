//����ʵ����===ʵ�ֽӿ�
//
public class Mobile implements USB,Wifi{
	private int   num;
	private String brand;
	
	
	//���캯��
	public Mobile(){}
	public Mobile(int num,String brand){
		this.num=num;
		this.brand=brand;
	}
	//get() set()
	
	//info()
	public void info(){
		System.out.println("Ʒ��:" +brand);
		System.out.println("����:" +num);
	}
	
	
	public void call(){
		System.out.println("��绰");
	
	}
	public void sms(){
		System.out.println("������");
	
	}
	
	
	
	//ʵ��������ʵ�ֽӿڡ����С��ĳ��󷽷�
	
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