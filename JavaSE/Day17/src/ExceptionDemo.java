//�Զ����쳣�ࣺ����̳�execption�쳣��������=�׸��������ĵ����ߣ�==throw throws�ؼ����׳�
// ʵ���ˣ��ж��߼�����   ��  �쳣�����  ����

//���±��쳣
class FuExecption extends RuntimeException{
	public FuExecption() {	
	}

	public FuExecption(String message) {
		super(message);	//
	}
}


//��ʾһ���׳��쳣������
class Test{
	//throws FuExecption��
	void run(int[] arr, int index) //throws FuExecption
	{
		//�Զ����쳣��JVM--new----throw---->main---->JVM---->����̨
		//System.out.println(arr[index]);	//throw   new ArrayIndexOutOfBoundsException(index);
		
		//�ֶ��׳��쳣
		if(arr == null){
			//�쳣����new + ����
			//throw new NullPointerException();
			throw new NullPointerException("��ָ���쳣");
		} 

		if(index < 0){
			//throw new ArrayIndexOutOfBoundsException("�±긺");	//�ֶ��׳��쳣 +  JVM����
			//�ֶ��׳����Զ����쳣				
			throw new FuExecption("�Զ���--���±��쳣");		//�׳����� jvm����runtime��
			
		}else if(index >= arr.length){
			//throw new ArrayIndexOutOfBoundsException();
			throw new ArrayIndexOutOfBoundsException("index=" + index + ">=���鳤��" + arr.length);
		}else {
			System.out.println(arr[index]);
		}		
	}
}

public class ExceptionDemo {

	/**
	 * @param args��
	 * @throws FuExecption 
	 */
	public static void main(String[] args) //throws FuExecption
	{	//---��JVM
		
		int[] arr = new int[5];
		int[] array = null;
		
		//һ����main�� ���У�ֱ�ӷǷ���������
//		arr[5] = 1232;			//ArrayIndexOutOfBoundsException:
//		array[0] = 123;			//NullPointerException	
		
		//�������ó�Ա�������ڳ�Ա�����зǷ�����������
		//run(arr, 6);	
		
		//����������� ��Ա�����зǷ�����
		Test1 test = new Test1();
		//test.run(array, 1);		//NullPointerException				
		
		test.run(arr, -2);	//��ʶ��	//�Զ����쳣��JVM--new----throw---->JVM---->����̨
		
		//test.run(arr, 5);		//throw   new ArrayIndexOutOfBoundsException();
		
		
		System.out.println("========end===========");
	}
	
	public static void  run(int[] arr, int index) {
		System.out.println(arr[index]);
		System.out.println("========run   end===========");
	}
	
	
	
	
	

}
