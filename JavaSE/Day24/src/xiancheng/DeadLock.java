package xiancheng;
//死锁
public class DeadLock implements Runnable {
	static Object s1 =new Object();
	static Object s2 =new Object();
	
	
	public void run(){
		if(Thread.currentThread().getName().equals("th1")){
			synchronized (s1) {
				System.out.println("线程1锁定s1");//代码段1
			
				try{
					Thread.sleep(10);
				}catch(InterruptedException e){
					e.printStackTrace();
				}
				
				synchronized (s2) {//s2被线程2锁定，所以这段代码无法执行
					System.out.println("线程1锁定s2");//代码段2
				}
			}
		
		}else{
			synchronized (s2) {
				System.out.println("线程2锁定s2");//代码段3
			
				
				synchronized (s1) {//s1被线程1锁定，所以这段代码无法执行
					System.out.println("线程2锁定s1");
				}
			}
		}
	}
	
	public static void main(String[] args) {
		Thread t1 =new Thread(new DeadLock(),"th1");
		Thread t2 =new Thread(new DeadLock(),"th2");
		
		t1.start();
		t2.start();
	}
}
