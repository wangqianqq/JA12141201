package process_stream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintStream;

/*
 * �������������˵ײ������豸�Ͻڵ����Ĳ��졢���ṩ���ӷ���������������
 * ���裺
 * 		1���ṩ��һ���ڵ���
 * 		2����װ�ɴ�����
 * 		3��ֱ��ʹ�ô�������IO��������ӵĲ����ײ���豸�ļ�
 * 		4���ر�
 * 
 * ʹ��PrintStream��װOutStream:�ֽ���=�ڵ���
 * 
 * */
public class PrintStreamTest {
	public static void main(String[] args) {
		FileOutputStream fos=null;
		PrintStream ps=null;
		try {
			//�����ڵ�������
			fos = new FileOutputStream("process_stream.txt");
			//��װ������
			ps= new PrintStream(fos);
			
			//3��IO
			ps.println("������");
			
			ps.println(new PrintStreamTest());
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}finally{
			try {
				fos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}finally{
			ps.close();
			}
		}
	}

}
