public class ArgsTest{
	public static void main(String[] args){
		//���args����ĳ���
		System.out.println("�������ȣ�"+args.length);
		//����args�����ÿ��Ԫ��
		for(String arg : args){
			System.out.println("arg:" + arg);		
		}
	}
}