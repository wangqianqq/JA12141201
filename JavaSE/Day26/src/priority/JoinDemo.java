package priority;

public class JoinDemo extends Thread{

	public void run(){
		for(int i=0;i<100;i++){
			System.out.println(getName()+i);
		}
	}
	
	public static void main(String[] args) throws InterruptedException {
		System.out.println(Thread.currentThread().getName()+"����");
		
		for(int i = 0;i<100;i++){
			System.out.println("main:"+i);
			if(i==38){
				JoinDemo jd = new JoinDemo();
				jd.start();
				//main�̵߳�����jd��join������main�̵߳ȴ�jd�̵߳Ľ��������ܼ���ִ�С�
				//���統ǰ�̵߳���������һ���̵߳�join������
				jd.join();
			}
		}
		
		System.out.println(Thread.currentThread().getName()+"����");

	}

}
