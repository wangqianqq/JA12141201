package ipc;



/*
 * ���̣߳��߳�����ϵͳ��
 * �߳�������ͬ�Ķ��߳�
 * 
 * 1����ôȥ��ù������ݣ�  ---һ�ι��캯��
 * 2����ô��֤Input��Output�߳�ͬ����
 * 3������==������
 * 
 * */


class Resource{
	int id;
	String name;
}


/*����:��Ʒ�Ƿ�����ȥ�ˣ���ȥȷ���Ƿ񿪹�����������
*	�У�1��֪ͨ���� 2��������
*	�ޣ�1������֪   2������	
*
*	
*/	
class Input implements Runnable{
	Resource r;

	//���캯��
	public Input(Resource r) {
		super();
		this.r = r;
	}

	int key = 0;

	public void run(){
		while(true){
			synchronized (r) {

				switch(key++%3){
				case 0:
					r.id=6666; 
					r.name="iphone6";
					System.out.println("����iPhone6");
				break;
				
				case 1:
					r.id=7777;  
					r.name="iphone7";
					System.out.println("����iPhone7");
				break;
				
				case 2:
					r.id=8888;  
					r.name="iphone8";
					System.out.println("����iPhone8");
				break;
				
				default:
				break;
				}
			}
		}
	}
}

/*���ۣ��Ƿ��в�Ʒ������
 * �У�1�������߸�֪ 2������
 * �ޣ�1��֪ͨ����    2��ֹͣ����
*/
class Output implements Runnable{
	Resource r;
			
	//���캯��
	public Output(Resource r) {
		super();
		this.r = r;
	}


	public void run(){
		
			while(true){
				synchronized (r) {
					
				System.out.println("����name:"+r.name+"\tid:"+r.id);
			}
		}
	}
}

public class Test {
	public static void main(String[] args) {
		//1������������Դ
		Resource r = new Resource();
		
		//2�������߳�����
		Input  input = new Input(r);
		Output output= new Output(r);
		
		//3�������̶߳���
		Thread th_in = new Thread(input);
		Thread th_out = new Thread(output);
		
		//4������
		th_in.start();
		th_out.start();
	}

}
