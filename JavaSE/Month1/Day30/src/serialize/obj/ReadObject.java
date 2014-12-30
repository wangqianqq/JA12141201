package serialize.obj;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ReadObject {

	//�����л���
	//1.ObjectInputStream����������==������==����FileInputStream
	//2.readObject()---���ص���object����
	public static void main(String[] args) {
		
		
		try {
			
			FileInputStream fis = new FileInputStream("obj.txt");
			
			
			ObjectInputStream ois=new ObjectInputStream(fis);
			
			//�� ObjectInputStream ��ȡ����
			Person p2=(Person)ois.readObject();
			
			System.out.println("name:"+p2.getName()+"age:"+p2.getAge());
		} catch (IOException e1) {
			e1.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} 
		
		
		

	}

}
