//������ֻ�ܴ��һ������
//���飺���ͬ���������͵�Ԫ�أ��±귶Χ[0��N-1]
//�ص㣺  1.�����������ǿ  2.���ȹ̶�  3.�ƶ�����Ч�ʵ�
	  
public class ArrayTest{
    public static void main(String[] args){
	 //1����������:û��ָ������ռ�,������ָ�������С
	              //������ջ�ռ䣺�����б������ֲ��������β�
	 int[] arr;   //����ʹ������
	 int  arr1[];
	 double[] d_arr;
	 //int  test[10];  //��������ʱ��������ָ����С
	
	 //��ʼ��������ָ����С[��ʽ����ʽ]�����ռ�
	       //�����ռ�+��ʼ��ֵ=�ڶѿռ�洢
		   //�ѿռ��ֵ��ϵͳ��Ĭ�ϳ�ʼ����������������йأ�int��double��
	 
	 //arr1 = {1,2,3,4};	//error  : ��������ʼ�����룬���ܼ�д
	 int[] arr2 = {123, 321, 2354 };	
	 arr = new int[10];                 //��ʽ 
	 
	 d_arr = new double[10];
	 arr1 = new int[]{1,2,3,4};         //��ʽ
	
	 System.out.println("arr[0]=" +arr[0]);
	 System.out.println("d_arr[0]=" +d_arr[0]);
	 //����+��ʼ��
 	 String[] str = new String[5];  //Ĭ�ϳ�ʼ��: ��̬��ʼ��
	 Object[] obj = new String[5];  //ʵ��Ԫ���������������͵�����
	 
	 String[] IT = new String[] {"Java","C","C++","Android"}; 
	 String[] IT1 =             {"Java","C","C++","Android"}; //��д
     
	 //��������=0���ã�����ֻʹ��һ��
     System.out.println(	 
      (new String[]{"Apple","Google","Alibaba"})[2]
	  );	 

	 //ʹ������
	 System.out.println("IT[1]=" +IT[1]);
	 
	 //�������ı���
	 //for + ���鳤��
       for(int i=0;i<IT.length;i++){
	        System.out.println("IT:" + IT[i] + "\t");
		}

     //for each:�������顢����
       for(String ele : IT){
	        System.out.println("IT:" + ele);
		}	
	 //���鿽��
	 String[] it_copy = IT;
	 for(String ele : it_copy){
	        System.out.println("IT:" + ele);
		}
	  System.out.println("");
	  it_copy[0] = "python"; 
	       //for(String ele : it_copy){
		    for(String ele : IT){
			//�������ָ��ͬһ���ռ�[�������]
	        System.out.println("IT:" + ele);
		}
	  
	  //������
	  for(String str1:args){
	     System.out.println(str1);
		}
		
	}   
}
