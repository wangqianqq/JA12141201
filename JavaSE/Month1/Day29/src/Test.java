import java.io.FileWriter;
import java.io.IOException;


public class Test {
	public static void main(String[] args) {
		// 字符输出流
		FileWriter fw=null;
		try {
			fw = new FileWriter("baidu.txt");
			fw.write("百度杀毒");
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
