package byte_stream;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStreamDemo {
	public static void main(String[] args) throws IOException {
		//1�������ļ�����ˮ��
		File file = new File("./src/byte_stream/FileInputStreamDemo.java");
		//2�����������󣺹ܵ�
		FileInputStream fis = new FileInputStream(file);
		//3��IO������IO
//		int ch = fis.read();
//		System.out.println((char)ch);//p
		
//		int ch = 0;
//		while((ch=fis.read())!=-1){
//			System.out.print((char)ch);
//		}
		
		//ư
		byte[] bbuf = new byte[32];//1k
		int size=0;
		size=fis.read(bbuf);
		System.out.println(new String(bbuf, 4, size-4));
//		while((size=fis.read(bbuf))!=-1){
//			//�ֽ�-->�ַ���
//			//System.out.println(new String(bbuf));
//			System.out.println(new String(bbuf, 0, size));
//		}
		
	}

}
