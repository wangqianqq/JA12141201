
public class One extends Thread{
	int ticket=10;//����ʮ��Ʊ����
	int num = 0;//��ǰ������Ʊ��
	
	public void run(){
		for(int i = 1;i<=100;i++){
			if(ticket > 0){
				ticket--;
				num++;
				System.out.println(getName()+"�����˵�"+num +"�ų�Ʊ����ʣ"+ticket+"�ų�Ʊ");
			}
		}
	}
	
	
	
	public static void main(String[] args) {
		One o1=new One();
		One O2=new One();
		One O3=new One();
		o1.setName("��һ����Ʊ����");
		o1.setName("�ڶ�����Ʊ����");
		o1.setName("��������Ʊ����");
		o1.start();
		O2.start();
		O3.start();
	}

}
