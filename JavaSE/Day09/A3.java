import java.util.Arrays;
import java.util.Scanner;//�������п���ֱ��д��import java.util.*;
public class A3{
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		int[] arr=new int[5];
		for(int i=0;i<arr.length;i++){
			System.out.println("�������"+(i+1)+"��ѧ���ĳɼ�");
			arr[i]=in.nextInt();
		}
		Arrays.sort(arr);
		for(int i=0;i<arr.length;i++){
			System.out.println(arr[i]);
		}
		
	}
}