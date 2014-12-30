package IO;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;


/*
 * IO:
 * �ͼ���(������):FileReader,FileWriter,FileInputStream,FileOutputStream
 * �߼���(������):��Ի����������н�һ���Ĳ�����
 * 
 * BufferedWriter���췽����
 * 		BufferedWriter(Writer out)
 * Ϊʲô���������ݵ���һ��Writer��?
 * 		��ΪBufferedXxx�������ṩ��Ч�Ĳ�������ԵĶ�д������Ҫ������������ɡ�
 */

public class BufferedWriterDemo {
	public static void main(String[] args) throws IOException {
		//��������
		//Writer w = new FileWriter("bw.txt");
		//BufferedWriter bw =new BufferedWriter(w);
		
		//���ı�д���ַ����������������ַ����Ӷ��ṩ�����ַ���������ַ����ĸ�Чд�롣 
		BufferedWriter bw = new BufferedWriter(new FileWriter("bw.txt"));
		
		bw.write("hello\r\n");
		bw.write("world\r\n");
		bw.write("wqq\r\n");
		bw.flush();
		
		
		//w.close();
		bw.close();
		
	}

}
