package IO;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;


/*
 * IO:
 * 低级流(基本流):FileReader,FileWriter,FileInputStream,FileOutputStream
 * 高级流(处理流):针对基本的流进行进一步的操作。
 * 
 * BufferedWriter构造方法：
 * 		BufferedWriter(Writer out)
 * 为什么，参数传递的是一个Writer呢?
 * 		因为BufferedXxx仅仅是提供高效的操作，针对的读写还得需要基本的流来完成。
 */

public class BufferedWriterDemo {
	public static void main(String[] args) throws IOException {
		//创建对象
		//Writer w = new FileWriter("bw.txt");
		//BufferedWriter bw =new BufferedWriter(w);
		
		//将文本写入字符输出流，缓冲各个字符，从而提供单个字符、数组和字符串的高效写入。 
		BufferedWriter bw = new BufferedWriter(new FileWriter("bw.txt"));
		
		bw.write("hello\r\n");
		bw.write("world\r\n");
		bw.write("wqq\r\n");
		bw.flush();
		
		
		//w.close();
		bw.close();
		
	}

}
