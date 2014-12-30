package serialize.obj;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class WriteObject {

	//序列化：1.创建objectOutStream输出流对象     处理流==基于节点
	//      2.IO:  writeObject()
	//      
	public static void main(String[] args) {
		Person p=new Person(100, "Google");
		//字节流，节点流
		FileOutputStream fos=null;
		
		//ObjectOutputStream将Java对象的基本数据类型和图形写入 OutputStream.
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
