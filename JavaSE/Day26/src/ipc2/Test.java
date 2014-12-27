package ipc2;




/*
 * �߳�ͨ�ţ��ȴ�--����
 * wait���ͷ����� �ͷ�CPU==�����̳߳�
 * notify������
 * notifyAll
 * 
 * ʹ��ͬһ���������÷���
 * 				
 * 				����
 * ��������-------->��--------->��.����------
 * 			�߳�ͬ�������ݰ�ȫ  �̼߳�ͨ�ţ�Э��
 * 
 * 
 * 
 * 
 * 
 * 
 * */


class Resource{
	int id;
	String name;
	boolean flag=false;//�ж��Ƿ��в�Ʒ
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
				
				
				//1���жϲ�Ʒ�Ƿ���ڣ�
				if(r.flag){
					try {
						r.wait();//ͣ������Ϣ���߳��ͷ�cpu
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}	
				//2������������
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
				
					
					//3���в�Ʒ��֪ͨ����
					r.flag = true;
					r.notify();
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
		
		//2������
		while(true){
			synchronized (r) {
				//�ж��Ƿ��в�Ʒ��
				if(!r.flag){//û��Ʒ
					try {
						r.wait();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}	
				}
					System.out.println("����name:"+r.name+"\tid:"+r.id);
				
					//3����Ʒ������
					r.flag= false;
					r.notify();//֪ͨ
			}	
				
		}
	}

}
	
public class Test {
	public static void main(String[] args) {
		// 1������������Դ
		Resource r = new Resource();

		// 2�������߳�����run
		Input input = new Input(r);
		Output output = new Output(r);

		// 3�������̶߳���
		Thread th_in = new Thread(input);
		Thread th_out = new Thread(output);

		// 4������
		th_in.start();
		th_out.start();
	}
}
