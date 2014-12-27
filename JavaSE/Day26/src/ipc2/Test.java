package ipc2;




/*
 * 线程通信：等待--唤醒
 * wait：释放锁、 释放CPU==进入线程池
 * notify：唤醒
 * notifyAll
 * 
 * 使用同一个锁来调用方法
 * 				
 * 				任意
 * 共享数据-------->锁--------->锁.方法------
 * 			线程同步：数据安全  线程间通信：协作
 * 
 * 
 * 
 * 
 * 
 * 
 * */


class Resource{
	int id;
	String name;
	boolean flag=false;//判断是否有产品
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
				
				
				//1、判断产品是否存在？
				if(r.flag){
					try {
						r.wait();//停产、休息：线程释放cpu
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}	
				//2、继续生产：
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
				
					
					//3、有产品，通知销售
					r.flag = true;
					r.notify();
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
		
		//2、销售
		while(true){
			synchronized (r) {
				//判断是否有产品？
				if(!r.flag){//没产品
					try {
						r.wait();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}	
				}
					System.out.println("卖：name:"+r.name+"\tid:"+r.id);
				
					//3、产品卖完了
					r.flag= false;
					r.notify();//通知
			}	
				
		}
	}

}
	
public class Test {
	public static void main(String[] args) {
		// 1、创建共享资源
		Resource r = new Resource();

		// 2、创建线程任务：run
		Input input = new Input(r);
		Output output = new Output(r);

		// 3、创建线程对象：
		Thread th_in = new Thread(input);
		Thread th_out = new Thread(output);

		// 4、开启
		th_in.start();
		th_out.start();
	}
}
