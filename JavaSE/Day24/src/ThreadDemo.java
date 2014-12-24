/*
 * main---------------------{}
 * Thread:�߳��࣬�߳����Լ��������ڶ����߳����ʱ����Ҫʵ�֣�����run
 * 
 * һ���̳�Thread����������
 * 1���̳�
 * 2����дrun()������  // ����
 * 3��ʵ�������̶߳���
 * 4�������̣߳�start
 * */
class Monkey1 extends Thread{
	String name;
	
	public Monkey1(String name){
		super();
		this.name = name;
	}
	
	public void fight(){
		for(int i = 1;i<11;i++){
			System.out.println(name + "��ܵ�"+ i +"������콫");
		}
	}
	
	public void run(){
		fight();
		System.out.println(Thread.currentThread().getId()+Thread.currentThread().getName());
	}
}



public class ThreadDemo {
	public static void main(String[] args) {
		Monkey1 m1 = new Monkey1("��1��С���");
		Monkey1 m2 = new Monkey1("��2��С���");
		Monkey1 m3 = new Monkey1("��3��С���");
		
		m1.setName("�߳�һ");
		
		
		m1.start();
		m2.start();
		m3.start();
		System.out.println(Thread.currentThread().getId()+Thread.currentThread().getName());

	}

}
