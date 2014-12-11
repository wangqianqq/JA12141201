//抽象类
abstract class USB{
	public abstract void read();
	public abstract void write();
}

//接口
interface Wifi{
	void open();
	void close();
}
/* class USB_KEY extends USB{
	//特点
	
	
	//义务
	//重写
} */


public class Niming{
	public static void main(String[] args){
		
		//匿名内部类==特殊的局部内部类==子类的对象 或者 实现类的对象
		USB udisk = new USB(){
			int a;
			final static int b=123;//不可以定义静态的，但是可以用常量 final
			public void read(){
				System.out.println("读取U盘");
			}
			public void write(){
				System.out.println("写U盘");
	        }
	    };
		
		udisk.read();
		udisk.write();
		
		//wifi
		Wifi wifi = new Wifi(){
			public void open(){
				System.out.println("打开wifi");
			
			}
			public void close(){
				System.out.println("关闭wifi");
			}
		
		};
		wifi.open();
		wifi.close();
	
	}
	
	
	

}