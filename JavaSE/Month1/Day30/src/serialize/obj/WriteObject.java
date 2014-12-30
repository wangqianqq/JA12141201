package serialize.obj;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class WriteObject {

	//���л���1.����objectOutStream���������     ������==���ڽڵ�
	//      2.IO:  writeObject()
	//      
	public static void main(String[] args) {
		Person p=new Person(100, "Google");
		//�ֽ������ڵ���
		FileOutputStream fos=null;
		
		//ObjectOutputStream��Java����Ļ����������ͺ�ͼ��д�� OutputStream.
		ObjectOutputStream oos=null;
		
		try {
			fos = new FileOutputStream("Obj.txt");
	        oos=new ObjectOutputStream(fos);

	        oos.writeObject(p);
	        
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
	}

}
