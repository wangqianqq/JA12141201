
public class One extends Thread{
	static int ticket=4;//����ʮ��Ʊ����
	static int num = 0;//��ǰ������Ʊ��
	
	public void  run(){
		for(int i = 1;i<=4;i++){
			if(ticket > 0){
				ticket--;
				num++;
				System.out.println(getName()+"�����˵�"+num +"�ų�Ʊ����ʣ"+ticket+"�ų�Ʊ");
			}
		}
	}
	
	
	
	public static void main(String[] args) {
		One o1=new One();
		One o2=new One();
		One o3=new One();
		o1.setName("��һ����Ʊ����");
		o2.setName("�ڶ�����Ʊ����");
		o3.setName("��������Ʊ����");
		o1.start();
		o2.start();
		o3.start();
	}

}
