import java.util.Scanner;
public class Test8{
	public static void main(String[] args){
		Scanner in= new Scanner(System.in);
		int[] arr= new int[3];
		System.out.println(arr.length);
		int sum=0;
		for(int i =0;i<arr.length;i++){
			System.out.println("请输入第"+(i+1)+"个学生");
			arr[i]=in.nextInt();
			sum+=arr[i];
		}
		System.out.println("五位学生的平均分为"+ sum/5);
	}
}