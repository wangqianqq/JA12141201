package xiancheng;

public class FirstThread extends Thread {
	private int i;
	
	//��дrun()������run()�����ķ���������߳�ִ����
	public void run(){
		for(;i < 100;i++){
			//���߳���̳�Thread��ʱ��ֱ��ʹ��this���ɻ�ȡ��ǰ�߳�
			//Thread�����getName()���ص�ǰ�̵߳�����
			//��˿���ֱ�ӵ���getName()�������ص�ǰ�̵߳�����
			System.out.println(getName() + ""+i);
		}
	}
	
	public static void main(String[] args) {
		for(int i=0;i<100;i++){
			
			//����Thread��currentThread()������ȡ��ǰ�߳�
			System.out.println(Thread.currentThread().getName()+"" +i);
			if(i==20){
				//������������һ���߳�
				new FirstThread().start();
				//�����������ڶ����߳�
				new FirstThread().start();
			}
		}
	}

}
