package liu;

import java.io.FileWriter;
import java.io.IOException;

/*
 * 	IO流的基类：	
 * 			字节流
 * 				字节输入流   读取数据    InputStrem
 * 				字节输出流   写出数据    OutputStrem
 * 			字符流
 * 				字符输入流   读取数据 	Reader
 * 				字符输出流   写出数据 	Writer
 * 
 * 需求：我要往一个文本文件中写入一句话："hello,io,i am coming!"
 * 
 * 分析：
 * A：数据类型？
 * 		字符流
 * B：读取还是写出
 * 		输出流
 * 
 * 由A、B可以知道要使用的流对象是：Writer
 * 看Writer的构造方法：
 * 通过查看API，知道该类是个抽象类。不能实例化
 * 那么，怎么办呢？
 * 找子类。
 * 
 * 到底找哪个子类呢？
 * 		FileWriter
 * 看FileWriter的构造方法：
 * 		FileWriter(File file) 
 * 		public FileWriter(String fileName)
 * 		
 * 
 * 
 * 
*/
public class IODemo {

	public static void main(String[] args) throws IOException {
		//创建字符输出流对象
		FileWriter f = new FileWriter("f.txt");//自动创建文件
		
		//写数据
		//public void write(String str) 写入字符串

		f.write("hello,io,i am coming!");
		//为什么没有数据呢？
		//字符 = 2字节
		//public abstract void flush() 刷新该流的缓冲。
		f.flush();
		
		
	}

}
