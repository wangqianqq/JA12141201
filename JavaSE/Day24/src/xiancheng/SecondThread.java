package xiancheng;

public class SecondThread implements Runnable {
	private int i;
	
	//run()����ͬ�����߳�ִ����
	public void run() {
		for(;i<4;i++){
			//���߳���ʵ��Runnable�ӿ�ʱ
			//������ȡ��ǰ�̣߳�ֻ����Thread.currentThread().getName()����
			System.out.println(Thread.currentThread().getName()+" " + i);
		}
	}
	public static void main(String[] args) {
		for(int i = 0;i<4;i++){
			System.out.println(Thread.currentThread().getName()+" " + i);
			if(i == 2){
				SecondThread st = new SecondThread();
				
				//ͨ��new Thread(target,name)�����������߳�
				Thread a= new Thread(st,"���߳�1");
				a.start();
				//����һ���൱�������    new Thread(st,"���߳�1").start();
				
				new Thread(st,"���߳�2").start();
			}
		}
	}
}