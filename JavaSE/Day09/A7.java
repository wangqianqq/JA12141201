import java.util.Scanner;
public class A7{
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		System.out.println("������Ҫ��������֣�");
		int num=in.nextInt();//����һ��num�������������
		int[] arr={2,5,7,12,56,num};
		arr[arr.length-1]=num;//����������ַ������һ��
		for(int i=arr.length-1;i>0;i--){
			if(arr[i]<arr[i-1]){//������һ�����ֱ�ǰһ��С
				int t=arr[i];
				arr[i]=arr[i-1];
				arr[i-1] =t;//�����һ��������ǰһ���滻
			}else{
			break;
			}
		}
		for(int i=0;i<arr.length;i++){
			System.out.println(arr[i]);//�����������������
		
		}
		
	
	}

}