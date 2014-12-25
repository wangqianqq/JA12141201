package xiancheng;

//死锁
class DeadLock3 implements Runnable {
	//定义两把锁
	public static final Object objA=new Object();
	public static final Object objB=new Object();

	private boolean flag;

	public DeadLock3(boolean flag){
			this.flag=flag;
		}
		
	public void run(){
		if(flag){
			while(true){
				synchronized (objA) {
					System.out.println("if objA");
					
					try{
						Thread.sleep(1000);
					}catch(InterruptedException e){
						e.printStackTrace();
					}
					
					synchronized (objB) {//因为objB被线程2锁定，所以该段代码不被执行
						System.out.println("if objB");
					}
				}
			}
		}else{
			while(true){
				synchronized (objB) {
					System.out.println("else objB");
					
					try{
						Thread.sleep(100);
					}catch(InterruptedException e){
						e.printStackTrace();
					}
					
					synchronized (objA) {//因为objA被线程1锁定，所以该段代码不被执行
						System.out.println("else objA");
					}
				}
			}
		}
	}
}
public class DeadLock2{
	public static void main(String[] args) {
		DeadLock3 d1 =new DeadLock3(true);
		DeadLock3 d2 =new DeadLock3(false);
		
		Thread t1= new Thread(d1);
		Thread t2 =new Thread(d2);
		
		t1.start();
		t2.start();
		
	}
}

