package char_stream;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterDemo {
	public static void main(String[] args) throws IOException {
		FileWriter fw = new FileWriter("new.txt");

		//д�뻺����
		fw.write("�����󣺲�������\r\n google  android");
		//�ļ��Լ����ڣ�write׷��
		fw.write("\tGmail");
		
		//fw.flush();
		//�ͷ���Դ
		fw.close();
		
		//public FileWriter(String fileName,boolean append)
		//���ݸ������ļ����Լ�ָʾ�Ƿ񸽼�д�����ݵ� boolean ֵ������ FileWriter ����
		FileWriter fw2 = new FileWriter("file_append.txt",true);
		fw2.write("google");
		fw2.write("\ngmail");
		
		fw2.close();
	}

}
