package xiancheng;
/*
 * �����̰߳�ȫ�����ԭ��
 * 1������߳��ڲ����������ݵ�����£������̻߳�Ե�ǰ���߳���ɸ���
 * */
public class SynchronizedDemo implements Runnable{
	static int ticket=20;//����ʮ��Ʊ����
	static int num = 0;//��ǰ������Ʊ��
	Object obj = new Object();
	
	public void run(){
		test();
	}
	
	
	public synchronized void test(){
		for(int i = 1;i<=8;i++){
		
			 
				if(ticket > 0){
				
					try{
						Thread.sleep(100);
					}catch(InterruptedException e){
						e.printStackTrace();
					}
				
					ticket--;
					num++;
					System.out.println(Thread.currentThread().getName()+"�����˵�"+num +"�ų�Ʊ����ʣ"+ticket+"�ų�Ʊ");
				}
				
		}
	}
	
	
	
	public static void main(String[] args) {
		
		SynchronizedDemo t=new SynchronizedDemo();
		

		Thread t1=new Thread(t);
		Thread t2=new Thread(t);
		Thread t3=new Thread(t);
		
		t1.setName("��һ����Ʊ����");
		t2.setName("�ڶ�����Ʊ����");
		t3.setName("��������Ʊ����");
		
		t1.start();
		t2.start();
		t3.start();
	
	}

}
