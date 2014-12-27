import java.util.Date;

public class TestInterrupt {
	public static void main(String[] args) {
		MyThread thread = new MyThread();
		thread.start();
		
		try {
			Thread.sleep(10000);//�߳���˯��
		}catch(InterruptedException e){}
			thread.interrupt();//�ж��߳�
	}
}

class MyThread extends Thread{
	public void run(){
		while(true){
			System.out.println("===" + new Date()+"===");
			
			try{
				sleep(1000);//ÿ��1000�����ӡһ��
			}catch(InterruptedException e){
				return;
			}
		}
	}
}
