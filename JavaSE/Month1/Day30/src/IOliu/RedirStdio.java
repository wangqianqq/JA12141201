package IOliu;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.Scanner;

/*
 * System.in ����   	setIn(InputStream)
 * System.out ��Ļ	setOut(PrintStream)
 * System.err ��Ļ	setErr(PrintStream)
 */
public class RedirStdio {
	public static void main(String[] args) {
		PrintStream ps=null;
		try {
			ps = new PrintStream(new FileOutputStream("redir.txt"));
			System.out.println("�ض���֮ǰ����ӡ���ն�");
			System.out.println(new Object());
			//System.out----ps
			System.setOut(ps);
			
			System.out.println("�ض���֮�󣺴�ӡ���ļ�");
			//System.out.println(new Object());

			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}finally{
			ps.close();
		}
		
		
		try {
			FileInputStream fis = new FileInputStream("redir.txt");
			Scanner sc = new Scanner(System.in);
			System.out.println("please input name:");
			String str = sc.next();
			System.out.println("�ض���Ǯ�����ն˶�ȡ="+str);
			
			
			System.out.println(fis);
			
			//ʹ��System.in���󹹽�Scanner���� ����ȡ����
			Scanner scanner = new Scanner(System.in);
			scanner.useDelimiter("\n");
			
			while(scanner.hasNext()){
				System.out.println("�ļ��������ݣ�"+scanner.next());
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		
	}

}
