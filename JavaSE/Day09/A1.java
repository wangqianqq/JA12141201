//���������ֵ
import java.util.Scanner;
public class A1{
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		int[] arr=new int[5];
		for(int i=0;i<arr.length;i++){
			System.out.println("�������"+(i+1)+"��ѧ���ĳɼ�");
			arr[i]=in.nextInt();
		}
		int max=arr[0];
		for(int i=0;i<arr.length;i++){
			if(max<arr[i]){
				max=arr[i];
			}
		}
		System.out.println("���ֵΪ��"+max);
	
	}
}