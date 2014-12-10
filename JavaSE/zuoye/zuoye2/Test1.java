import java.util.Scanner;
public class Test1{
	public static void main(String[] args) {
		long a = 0;
			System.out.println("输入一个数");
		
		// 从键盘获取一个数
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		long i = sc.nextInt();
		
		// 因为之后的i会改变 所以先赋值给l
		long L = i;
		
		// 输出这个数是几位数
			System.out.println("你输入的  " + (i + "") + " 是  " + (i + "").length()+ "位数");
		
		// 通过for 循环 让这个数首尾交换 得到a
		for (int k = 0; k < (L + "").length(); k++) {
		a = a * 10 + i % 10;
		i = i / 10;
	    }
	
	
	// 判断首尾交换后是否等于原值
		if (a == L) {
			System.out.println("你输入的" + L + "是回文数");
		} else {
			System.out.println("你输入得" + L + "不是回文数");
	    }
	}
}