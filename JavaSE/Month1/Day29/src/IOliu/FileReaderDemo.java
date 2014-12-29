
package IOliu;

import java.io.FileReader;
import java.io.IOException;

/*
 * public int read(char[] cbuf):返回的是实际读取的长度，把数据读取到了数组中
 * */


public class FileReaderDemo {
	public static void main(String[] args) throws IOException {
		//创建字符输入流对象
		
		FileReader fr = new FileReader("fr.txt");
		
		//public int read(char[] cbuf)
		
//		//定义一个临时容器
//		char[] chs = new char[5];
//	
//		//第一次读取
//		int len = fr.read(chs);//把文件中的数据读取到数组中
//		System.out.println(len);//5
//		System.out.println(String.valueOf(chs));//happy
//		
//		//第二次读取
//		len= fr.read(chs);
//		System.out.println(len);//5
//		System.out.println(String.valueOf(chs));//\r\nyes
//		
//		//第三次读取
//		len= fr.read(chs);
//		System.out.println(len);//5
//		System.out.println(String.valueOf(chs));//\r\ngoo
//		
//		//第二次读取
//		len= fr.read(chs);
//		System.out.println(len);//1
//		//System.out.println(String.valueOf(chs));//d
//		                                        //goo  
//						//最后只剩下d一个元素  所以上一次读取的后四位还在，即d\ngoo
//		System.out.println(String.valueOf(chs,0,len));
//		
//		//第五次读取
//		len= fr.read(chs);
//		System.out.println(len);
//		//如果实际兑取的返回值是-1，说明就没有元素了
		
//		char[] chs = new char[5];
//		int len = fr.read(chs);
//		while(len!=-1){
//			System.out.print(String.valueOf(chs,0,len));
//			len = fr.read(chs);
//		}
		
		//最终版代码
		char[] chs = new char[1024];//1024及其整数倍
		int len =0;
		while((len=fr.read(chs))!=-1){
			//System.out.print(String.valueOf(chs,0,len));//返回 char 数组参数的特定子数组的字符串表示形式。
			//返回 char 数组参数的特定子数组的字符串表示形式。与上面一行等同
			System.out.print(new String(chs, 0, len));
		}
		 
		 
		
		//释放资源
		fr.close();
	}

}
