package liu;

import java.io.FileWriter;
import java.io.IOException;

/*
 * 	IO���Ļ��ࣺ	
 * 			�ֽ���
 * 				�ֽ�������   ��ȡ����    InputStrem
 * 				�ֽ������   д������    OutputStrem
 * 			�ַ���
 * 				�ַ�������   ��ȡ���� 	Reader
 * 				�ַ������   д������ 	Writer
 * 
 * ������Ҫ��һ���ı��ļ���д��һ�仰��"hello,io,i am coming!"
 * 
 * ������
 * A���������ͣ�
 * 		�ַ���
 * B����ȡ����д��
 * 		�����
 * 
 * ��A��B����֪��Ҫʹ�õ��������ǣ�Writer
 * ��Writer�Ĺ��췽����
 * ͨ���鿴API��֪�������Ǹ������ࡣ����ʵ����
 * ��ô����ô���أ�
 * �����ࡣ
 * 
 * �������ĸ������أ�
 * 		FileWriter
 * ��FileWriter�Ĺ��췽����
 * 		FileWriter(File file) 
 * 		public FileWriter(String fileName)
 * 		
 * 
 * 
 * 
*/
public class IODemo {

	public static void main(String[] args) throws IOException {
		//�����ַ����������
		FileWriter f = new FileWriter("f.txt");//�Զ������ļ�
		
		//д����
		//public void write(String str) д���ַ���

		f.write("hello,io,i am coming!");
		//Ϊʲôû�������أ�
		//�ַ� = 2�ֽ�
		//public abstract void flush() ˢ�¸����Ļ��塣
		f.flush();
		
		
	}

}
