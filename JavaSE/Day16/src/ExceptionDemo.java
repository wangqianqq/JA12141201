

	//��ʾһ���׳��쳣������
class Test{
	void run(int[] arr,int index){
		 if(arr == null){
			throw new NullPointerException("��ָ���쳣");
		 }
		//�Զ����쳣��JVM--new---thow--->main--->JVM--->����̨
		//System.out.println(arr[index]);//throw new ArrayIndexOutOfBoundsException();
		
		if(index < 0){
			throw new ArrayIndexOutOfBoundsException("�±긺");//�ֶ��׳��쳣
		}else if(index >= arr.length){
			throw new ArrayIndexOutOfBoundsException("index>=���鳤��"+arr.length);
		}else{
		
			System.out.println(arr[index]);
		}
	}
}

public class ExceptionDemo {
	public static void main(String[] args){
		int[] arr = new int[5];
		int[] array = null;
			
		//arr[5]=1232;//ArrayIndexOutOfBoundsException
		//array[0]=123;//NullPointerException
		
		
		Test test = new Test();
		//�Զ����쳣��JVM---new---thow--->main--->JVM--->����̨
		test.run(arr, -2);
		//test.run(arr,5);
		//test.run(arr, 1);
		System.out.println("------end-----");
		
	}
}