package IO;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CopyFileDemo {
	public static void main(String[] args) throws IOException {
		//封装数据源
		BufferedReader br = new BufferedReader(new FileReader("D:\\JA12141201\\JavaSE\\Month1\\Day30\\br.txt"));
		
		//封装目的地
		BufferedWriter bw = new BufferedWriter(new FileWriter("Copy.txt"));
		
		
//		int s= 0;
//		while((s=br.read())!=-1){
//			bw.write(s);
//		}
		
		char[] chs=new char[1024];
		int len=0;
		while((len=br.read(chs))!=-1){
			bw.write(chs,0,len);
	
		}
		
		
		br.close();
		bw.close();
	}

}
