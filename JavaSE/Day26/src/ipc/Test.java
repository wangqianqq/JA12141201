package ipc;



/*
 * 多线程：线程任务系统的
 * 线程任务不相同的多线程
 * 
 * 1、怎么去获得共享数据？  ---一参构造函数
 * 2、怎么保证Input、Output线程同步？
 * 3、产量==销量？
 * 
 * */


class Resource{
	int id;
	String name;
}


/*产线:产品是否卖出去了？再去确定是否开工继续生产？
*	有：1、通知销售 2、不生产
*	无：1、被告知   2、生产	
*
*	
*/	
class Input implements Runnable{
	Resource r;

	//构造函数
	public Input(Resource r) {
		super();
		this.r = r;
	}

	int key = 0;

	public void run(){
		while(true){
			synchronized (r) {

				switch(key++%3){
				case 0:
					r.id=6666; 
					r.name="iphone6";
					System.out.println("生产iPhone6");
				break;
				
				case 1:
					r.id=7777;  
					r.name="iphone7";
					System.out.println("生产iPhone7");
				break;
				
				case 2:
					r.id=8888;  
					r.name="iphone8";
					System.out.println("生产iPhone8");
				break;
				
				default:
				break;
				}
			}
		}
	}
}

/*销售：是否有产品可卖？
 * 有：1、被产线告知 2、销售
 * 无：1、通知产线    2、停止销售
*/
class Output implements Runnable{
	Resource r;
			
	//构造函数
	public Output(Resource r) {
		super();
		this.r = r;
	}


	public void run(){
		
			while(true){
				synchronized (r) {
					
				System.out.println("卖：name:"+r.name+"\tid:"+r.id);
			}
		}
	}
}

public class Test {
	public static void main(String[] args) {
		//1、创建共享资源
		Resource r = new Resource();
		
		//2、创建线程任务
		Input  input = new Input(r);
		Output output= new Output(r);
		
		//3、创建线程对象
		Thread th_in = new Thread(input);
		Thread th_out = new Thread(output);
		
		//4、开启
		th_in.start();
		th_out.start();
	}

}
