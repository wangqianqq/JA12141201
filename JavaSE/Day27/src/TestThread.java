
class Runner extends Thread{
	public void run(){
		System.out.println(Thread.currentThread().isAlive());
		//�����߳��Ƿ��ڻ״̬������߳��Ѿ���������δ��ֹ����Ϊ�״̬�� ������̴߳��ڻ״̬���򷵻� true�����򷵻� false��

		
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
