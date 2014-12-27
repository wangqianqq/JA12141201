
public class TestJoin {
	public static void main(String[] args) {
		MyThread t1 = new MyThread("abcde");
		t1.start();
		
		try{
		t1.join();
		}catch(InterruptedException e){
		}
		
		for(int i=1;i<=10;i++){
			System.out.println("i am main thread");
		}
	}
}

class MyThread extends Thread{
	MyThread(String s){
		super(s);
	}
	
	public void run(){
		for(int i=0;i<=10;i++){
			System.out.println("i am"+getName());
			try {
				sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
				return;
			}
		}
	}	
}