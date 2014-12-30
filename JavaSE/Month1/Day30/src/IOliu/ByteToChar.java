package IOliu;
/*
 * InputStreamReader：字节流通向字符流的桥梁
 * 
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ByteToChar {
	public static void main(String[] args) {
		//System.in==字节流
		InputStreamReader isr = new InputStreamReader(System.in);
		
		//从字符输入流中读取文本，缓冲各个字符，从而实现字符、数组和行的高效读取。 
		BufferedReader br = new BufferedReader(isr);
		String buff = null;
		try {
			while((buff=br.readLine())!=null){
				if(buff.equals("exit")){
					System.out.println("exit.....");
					System.exit(1);
				}
				System.out.println("输入："+buff);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
