package priority;

public class JoinDemo extends Thread{

	public void run(){
		for(int i=0;i<100;i++){
			System.out.println(getName()+i);
		}
	}
	
	public static void main(String[] args) throws InterruptedException {
		System.out.println(Thread.currentThread().getName()+"开启");
		
		for(int i = 0;i<100;i++){
			System.out.println("main:"+i);
			if(i==38){
				JoinDemo jd = new JoinDemo();
				jd.start();
				//main线程调用了jd的join方法，main线程等待jd线程的结束，才能继续执行。
				//假如当前线程调用了另外一个线程的join方法，
				jd.join();
			}
		}
		
		System.out.println(Thread.currentThread().getName()+"结束");

	}

}
