

class MyThread2 extends Thread{
	MyThread2(String s) {
		super(s);
	}
	
	public void run(){
		for(int i=1;i<=100;i++){
			System.out.println(getName()+":"+i);
			
			if(i%10==0){
				yield();//暂停当前正在执行的线程对象，并执行其他线程。
			}
		}
	}
}



public class TestYield {
	public static void main(String[] args) {
		MyThread2 t1 = new MyThread2("t1");
		MyThread2 t2 = new MyThread2("t2");
		
		t1.start();
		t2.start();

	}

}
