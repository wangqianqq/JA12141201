package priority;


public class YieldDemo extends Thread {
	public YieldDemo(String name){
		super(name);
	}
	
	
	public void run(){
		
		for(int i = 0;i<50;i++){
			try {
				Thread.sleep(250);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			System.out.println(getName() + "==" + i);
			
			//��i=55��ʱ���õ�ǰ�̸߳������߳��ò����Լ������̳߳�
			if(i==25){
				//this.yield();
				Thread.yield();
			}
		}
	}
	
	
	public static void main(String[] args) {
		YieldDemo yd1 = new YieldDemo("�߳�1");
		YieldDemo yd2 = new YieldDemo("�߳�2");
		
		yd1.setPriority(MAX_PRIORITY);
		yd1.start();
		yd2.start();
	}
}
