package char_stream;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterDemo {
	public static void main(String[] args) throws IOException {
		FileWriter fw = new FileWriter("new.txt");

		//写入缓冲区
		fw.write("流对象：操作内容\r\n google  android");
		//文件以及存在：write追加
		fw.write("\tGmail");
		
		//fw.flush();
		//释放资源
		fw.close();
		
		//public FileWriter(String fileName,boolean append)
		//根据给定的文件名以及指示是否附加写入数据的 boolean 值来构造 FileWriter 对象。
		FileWriter fw2 = new FileWriter("file_append.txt",true);
		fw2.write("google");
		fw2.write("\ngmail");
		
		fw2.close();
	}

}
