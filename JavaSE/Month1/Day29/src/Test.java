import java.io.FileWriter;
import java.io.IOException;


public class Test {
	public static void main(String[] args) {
		// �ַ������
		FileWriter fw=null;
		try {
			fw = new FileWriter("baidu.txt");
			fw.write("�ٶ�ɱ��");
		} catch (IOException e) {
			e.printStackTrace();
		}finally{
			if(fw !=null){
				try {
					fw.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
		
			}	
		}
		

	}

}
