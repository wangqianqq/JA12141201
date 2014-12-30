package serialize.obj;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ReadObject {

	//反序列化：
	//1.ObjectInputStream输入流对象：==处理流==基于FileInputStream
	//2.readObject()---返回的是object类型
	public static void main(String[] args) {
		
		
		try {
			
			FileInputStream fis = new FileInputStream("obj.txt");
			
			
			ObjectInputStream ois=new ObjectInputStream(fis);
			
			//从 ObjectInputStream 读取对象
			Person p2=(Person)ois.readObject();
			
			System.out.println("name:"+p2.getName()+"age:"+p2.getAge());
		} catch (IOException e1) {
			e1.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} 
		
		
		

	}

}
