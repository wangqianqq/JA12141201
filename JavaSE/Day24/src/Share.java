
public class Share extends Thread{
	int ticket=10;//����ʮ��Ʊ����
	int num = 0;//��ǰ������Ʊ��
	
	public void run(){
		for(int i = 1;i<=10;i++){
			if(ticket > 0){
				ticket--;
				num++;
				System.out.println(Thread.currentThread().getName()+"�����˵�"+num +"�ų�Ʊ����ʣ"+ticket+"�ų�Ʊ");
			}
		}
	}
	
	
	
	public static void main(String[] args) {
		Share t=new Share();
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
