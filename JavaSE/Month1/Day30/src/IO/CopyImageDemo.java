package IO;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyImageDemo {
	public static void main(String[] args) throws IOException {
		FileInputStream fis = new FileInputStream("C:\\Koala.jpg");
		FileOutputStream fos = new FileOutputStream("wq.jpg");
		
		int a=0;
		while((a=fis.read())!=-1){
			fos.write(a);
		}
		
		fis.close();
		fos.close();
	}

}
