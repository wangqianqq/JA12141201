/*
 * 1��ʵ���ˡ��߳�����run�����̶߳���
 * 2��RunnableDemo extends A�����ⵥ�̳С�
 * 
 * */

public class RunnableDemo implements Runnable {
	private int i;
	@Override
	public void run() {
		for(int i = 0;i<2;i++){
			System.out.println(Thread.currentThread().getName()+"=="+i);
		}
	}
	
	public static void main(String[] args) {
		
		RunnableDemo rd = new RunnableDemo();
		//RunnableDemo rd1 = new RunnableDemo();

		Thread	th = new Thread(rd);
		Thread th1 = new Thread(rd);
		
		for(int i=0;i<5;i++){
			System.out.println(Thread.currentThread().getName()+"=="+i );

			if(i==2){
				th.start();
				th1.start();
			}	
		}
	}
		

}
