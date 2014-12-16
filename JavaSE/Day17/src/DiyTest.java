/*
 * �쳣����:			�Զ��׳�
 * 	1��runtime�쳣������Ա--�׳�      VS   JVM---�Զ�����
 * 	2��checked�쳣������Ա--�׳�      VS    ����Ա---�ֶ�����
 * 
 * checked�쳣����
 * 	1��������Ա���ֶ��쳣����֮һ��throws	
 * 	2��������Ա���ֶ��쳣����֮����try catch finally
 * 
 * ����Ա���ǣ�
 * 	1��ɶʱ��ᷢ���쳣��
 * 	2����������ʲô�쳣��----runtime   checked
 * 	3�������쳣���ͣ������� �쳣��ô����
 * 		a��runtime		JVM
 * 		b��checked��				when��				how��														---ĳ���ϼ����---->����ִ��----���
 * 			|������throws		===	��֪����ν��	1������ǩ����throws + checked�쳣����	---�׸�������-----�����ߴ���--�ϼ����������--->JVM----�ж�
 * 			|     								2������throws��������쳣����ʾ�������ҿ��������Щ�쳣��������Ҵ���
 * 			|������try  catch	===	֪����ô���
 * 
 * 	4��catch(){}		------?		
 */	


//�Զ���checked�쳣���̳�
class FuException extends Exception{
	public FuException(){}
	public FuException(String message){
		super(message);
	}
	@Override
	public String toString() {
		
		return "����Աcatch����" + this.getMessage();
	}	
	
	
}


class Demo{
	/*
	 *  			�ж��쳣--------�׳��쳣-----------�����쳣
	 *  runtime				 ����						JVM
	 *  checked		===============����Ա����==============	
	 *  
	 *  ����			
	 */
	
	public void run(int[] arr, int index) throws FuException,NullPointerException,ArrayIndexOutOfBoundsException {
		if(arr == null){
			throw new NullPointerException("JVM����ָ���쳣");		
		}
		
		if(index >= arr.length){
			throw new ArrayIndexOutOfBoundsException("JVM: index����������ĳ���");
		}else if(index < 0){			
			throw new FuException("����Ա����index����");
		}else {
			System.out.println(arr[index]);
		}

	}	
}


public class DiyTest {
	public static void main(String[] args) {	///
		
		int[]   array = new int[5];
		int[]   arr = null;
		Demo demo = new Demo();
		
		//array[-12] = 123;
		/*		JVM
		 * Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: -12
			at DiyTest.main(DiyTest.java:65)
		 */
		
		/*		fu.printStackTrace();			
		 * FuException: ����Ա����index����
			at Demo.run(DiyTest.java:49)
			at DiyTest.main(DiyTest.java:71)
		 */
		
		
		try {
			//demo.run(array, -12);	//�������￴��ʲô�쳣��
			
			demo.run(arr, 123);
		} catch (FuException fu) {
			fu.printStackTrace();
			System.out.println(fu);
			System.out.println(fu.toString() + "\n" + fu.getMessage());	
		} catch (NullPointerException e) {
			System.out.println("����catch���");
			System.out.println(e);
			e.printStackTrace();
			
			//return;		//finally
			//System.exit(123);
		} catch(Exception e){	//�����쳣�ĸ���			catch˳����catch���ࡢ��catch����
			System.out.println(e);
			
		} finally{	//
			System.out.println("finally");
		}
		
		System.out.println("==========end==============");		
		
	}	
}
