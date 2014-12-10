import java.util.Scanner;
public class A7{
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		System.out.println("请输入要插入的数字：");
		int num=in.nextInt();//定义一个num接收输入的数字
		int[] arr={2,5,7,12,56,num};
		arr[arr.length-1]=num;//把输入的数字放在最后一个
		for(int i=arr.length-1;i>0;i--){
			if(arr[i]<arr[i-1]){//如果最后一个数字比前一个小
				int t=arr[i];
				arr[i]=arr[i-1];
				arr[i-1] =t;//将最后一个数字与前一个替换
			}else{
			break;
			}
		}
		for(int i=0;i<arr.length;i++){
			System.out.println(arr[i]);//按升序输出所有数字
		
		}
		
	
	}

}