
public class Share extends Thread{
	static int ticket=4;//共有十张票出售
	static int num = 0;//当前卖出的票数
	
	public void run(){
		for(int i = 1;i<=3;i++){
			if(ticket > 0){
				ticket--;
				num++;
				System.out.println(Thread.currentThread().getName()+"卖出了第"+num +"张车票，还剩"+ticket+"张车票");
			}
		}
	}
	
	
	
	public static void main(String[] args) {
		Share t=new Share();
		Share t1=new Share();
		Share t2=new Share();

		//		Thread t1=new Thread(t);
//		Thread t2=new Thread(t);
//		Thread t3=new Thread(t);
		
		t.setName("第一个售票窗口");
		t1.setName("第二个售票窗口");
		t2.setName("第三个售票窗口");
		
		t.start();
		t1.start();
		t2.start();
	
	}

}
