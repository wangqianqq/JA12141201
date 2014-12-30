package IO;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;



public class BufferedReaderDemo {
	public static void main(String[] args) throws IOException {
		//创建对象
		BufferedReader br = new BufferedReader(new FileReader("br.txt"));
		
		//一次读取一个字符
//		int b=0;
//		while((b=br.read())!=-1){
//			System.out.print((char) b);
//		}
		
		//一次读取一个字符数据
		char[] chs=new char[1024];
		int len = 0;
		while((len=br.read(chs))!=-1){
			System.out.print(new String(chs,0,len));
		}
		
		//释放资源
		br.close();
	}

}
