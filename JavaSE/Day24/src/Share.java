
public class Share extends Thread{
	static int ticket=4;//����ʮ��Ʊ����
	static int num = 0;//��ǰ������Ʊ��
	
	public void run(){
		for(int i = 1;i<=3;i++){
			if(ticket > 0){
				ticket--;
				num++;
				System.out.println(Thread.currentThread().getName()+"�����˵�"+num +"�ų�Ʊ����ʣ"+ticket+"�ų�Ʊ");
			}
		}
	}
	
	
	
	public static void main(String[] args) {
		Share t=new Share();
		Share t1=new Share();
		Share t2=new Share();

		//		Thread t1=new Thread(t);
//		Thread t2=new Thread(t);
//		Thread t3=new Thread(t);
		
		t.setName("��һ����Ʊ����");
		t1.setName("�ڶ�����Ʊ����");
		t2.setName("��������Ʊ����");
		
		t.start();
		t1.start();
		t2.start();
	
	}

}
