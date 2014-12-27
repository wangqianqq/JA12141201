import java.util.Date;

public class TestInterrupt {
	public static void main(String[] args) {
		MyThread thread = new MyThread();
		thread.start();
		
		try {
			Thread.sleep(10000);//线程了睡眠
		}catch(InterruptedException e){}
			thread.interrupt();//中断线程
	}
}

class MyThread extends Thread{
	public void run(){
		while(true){
			System.out.println("===" + new Date()+"===");
			
			try{
				sleep(1000);//每隔1000毫秒打印一次
			}catch(InterruptedException e){
				return;
			}
		}
	}
}
