package XC;

/*
 * ��ǰͬ���ؼ��ֵķ�ʽ������ʵ��ͬ�������������ǱȽϳ����ķ�ʽ��
 * ���ǣ�����������Ҫ������ʹ�õ����ĸ������󣬱Ƚ��鷳��
 * �����أ���JDK5�Ժ������ṩ��һ���µķ�ʽ��Lock������
 * ���ַ�ʽ����ǰ�Ĵ����бȽ��ټ����Ժ������ڿ����У����������á�
 * 
 * */
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Ticket implements Runnable {
	private int tickets = 20;
	
	//����һ��������
	private Lock lock = new ReentrantLock();//����ת��
	@Override
	public void run() {
		while(true){
			
			//����
			lock.lock();
			
			if(tickets >0){
				try{
					Thread.sleep(10);
				}catch(InterruptedException e){
					e.printStackTrace();
				}
				
				System.out.println(Thread.currentThread().getName()+"�����۵�"+(tickets--)+"��Ʊ");
			}
			
			//�ͷ���
			lock.unlock();
		}
	}
}
