public class Test{
	public static void main(String[] args){
		//�̳е�����ת�� VS �ӿڡ�ʵ���������ת��
		USB upan=new Udisk();//����ת��
		//System.out.println(upan.brand);//error //�������е����Բ����Է��ʣ�Ҫ����ת��
		upan.read();
		upan.write();
		
		USB key=new USB_KEY();//����ת��
		key.read();
		key.write();
	}

}