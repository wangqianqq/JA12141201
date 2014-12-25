package xiancheng;
//����
public class DeadLock implements Runnable {
	static Object s1 =new Object();
	static Object s2 =new Object();
	
	
	public void run(){
		if(Thread.currentThread().getName().equals("th1")){
			synchronized (s1) {
				System.out.println("�߳�1����s1");//�����1
			
				try{
					Thread.sleep(10);
				}catch(InterruptedException e){
					e.printStackTrace();
				}
				
				synchronized (s2) {//s2���߳�2������������δ����޷�ִ��
					System.out.println("�߳�1����s2");//�����2
				}
			}
		
		}else{
			synchronized (s2) {
				System.out.println("�߳�2����s2");//�����3
			
				
				synchronized (s1) {//s1���߳�1������������δ����޷�ִ��
					System.out.println("�߳�2����s1");
				}
			}
		}
	}
	
	public static void main(String[] args) {
		Thread t1 =new Thread(new DeadLock(),"th1");
		Thread t2 =new Thread(new DeadLock(),"th2");
		
		t1.start();
		t2.start();
	}
}
