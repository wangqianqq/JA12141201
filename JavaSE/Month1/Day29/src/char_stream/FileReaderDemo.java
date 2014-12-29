package char_stream;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileReaderDemo {

	public static void main(String[] args) throws IOException {
		//文件输入流：文件必须存在，否则异常
		FileReader fr = new FileReader("new.txt");
		FileWriter fw = new FileWriter("wq.txt");
		
//		int ch = 0;
//		while((ch=fr.read())!=-1){
//			System.out.print((char)ch);
//		}
		
//		char[] ch=new char[1024];
//		int len =0;
//		while((len=fr.read(ch))!=-1){
//			fw.write(ch);
//			fw.flush();
//			System.out.println(new String(ch, 0, len));
//		}
//		fr.close();
//		fw.close();
		
		//字符数据输出到终端/wq.txt
		char[] cbuf = new char[1024];
		int size=0;
		while((size=fr.read(cbuf))!=-1){
			
			fw.flush();

			System.out.println(new String(cbuf,0,size));
			fw.write(cbuf);
		}
		fr.close();
		fw.close();
	}

}
