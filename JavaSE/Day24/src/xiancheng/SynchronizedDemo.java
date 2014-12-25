package xiancheng;
/*
 * 产生线程安全问题的原因：
 * 1、多个线程在操作共享数据的情况下：其他线程会对当前的线程造成干扰
 * */
public class SynchronizedDemo implements Runnable{
	static int ticket=20;//共有十张票出售
	static int num = 0;//当前卖出的票数
	Object obj = new Object();
	
	public void run(){
		test();
	}
	
	
	public synchronized void test(){
		for(int i = 1;i<=8;i++){
		
			 
				if(ticket > 0){
				
					try{
						Thread.sleep(100);
					}catch(InterruptedException e){
						e.printStackTrace();
					}
				
					ticket--;
					num++;
					System.out.println(Thread.currentThread().getName()+"卖出了第"+num +"张车票，还剩"+ticket+"张车票");
				}
				
		}
	}
	
	
	
	public static void main(String[] args) {
		
		SynchronizedDemo t=new SynchronizedDemo();
		

		Thread t1=new Thread(t);
		Thread t2=new Thread(t);
		Thread t3=new Thread(t);
		
		t1.setName("第一个售票窗口");
		t2.setName("第二个售票窗口");
		t3.setName("第三个售票窗口");
		
		t1.start();
		t2.start();
		t3.start();
	
	}

}
