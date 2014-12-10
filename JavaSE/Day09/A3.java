import java.util.Arrays;
import java.util.Scanner;//上面两行可以直接写成import java.util.*;
public class A3{
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		int[] arr=new int[5];
		for(int i=0;i<arr.length;i++){
			System.out.println("请输入第"+(i+1)+"个学生的成绩");
			arr[i]=in.nextInt();
		}
		Arrays.sort(arr);
		for(int i=0;i<arr.length;i++){
			System.out.println(arr[i]);
		}
		
	}
}