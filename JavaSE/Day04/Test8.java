import java.util.Scanner;
public class Test8{
	public static void main(String[] args){
		Scanner in= new Scanner(System.in);
		int[] arr= new int[3];
		System.out.println(arr.length);
		int sum=0;
		for(int i =0;i<arr.length;i++){
			System.out.println("�������"+(i+1)+"��ѧ��");
			arr[i]=in.nextInt();
			sum+=arr[i];
		}
		System.out.println("��λѧ����ƽ����Ϊ"+ sum/5);
	}
}