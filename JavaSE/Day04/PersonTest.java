//����Person��
public class PersonTest{
	public static void main(String[] args){
		//ʵ����:����=����=ʵ��
		//�ڶ����ʱ��û�С��Զ����޲ι�����������ϵͳ�Զ�ָ��������
		//�ڶ����ʱ����  ���Զ����޲ι�������ʹ���Զ���Ĺ�����
		Person geminno = new Person();
		Person gem = new Person("�߲�");
		Person gemptc = new Person("�߲�����",12);
	
		
		//����ʹ�ã�����.��Ա���� ����.��Ա����
		geminno.info();
		gem.info();
		gemptc.info();
		//System.out.println("Name:" + geminno.name + "Age:" + geminno.age);
		
	
	}//end main
}//end class