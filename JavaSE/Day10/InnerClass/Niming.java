//������
abstract class USB{
	public abstract void read();
	public abstract void write();
}

//�ӿ�
interface Wifi{
	void open();
	void close();
}
/* class USB_KEY extends USB{
	//�ص�
	
	
	//����
	//��д
} */


public class Niming{
	public static void main(String[] args){
		
		//�����ڲ���==����ľֲ��ڲ���==����Ķ��� ���� ʵ����Ķ���
		USB udisk = new USB(){
			int a;
			final static int b=123;//�����Զ��徲̬�ģ����ǿ����ó��� final
			public void read(){
				System.out.println("��ȡU��");
			}
			public void write(){
				System.out.println("дU��");
	        }
	    };
		
		udisk.read();
		udisk.write();
		
		//wifi
		Wifi wifi = new Wifi(){
			public void open(){
				System.out.println("��wifi");
			
			}
			public void close(){
				System.out.println("�ر�wifi");
			}
		
		};
		wifi.open();
		wifi.close();
	
	}
	
	
	

}