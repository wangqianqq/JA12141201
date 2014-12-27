
class Runner extends Thread{
	public void run(){
		System.out.println(Thread.currentThread().isAlive());
		//测试线程是否处于活动状态。如果线程已经启动且尚未终止，则为活动状态。 如果该线程处于活动状态，则返回 true；否则返回 false。

		
		for(int i=0;i<50;i++){
			System.out.println("SubThread:"+i);
		
		
		}
		
	}
	
}


public class TestThread {
	
	public static void main(String[] args) {
		Thread t = new Runner();
		t.start();
		
		for(int i =0;i<50;i++){
			System.out.println("MainThread:"+i);
		}
	}

}
