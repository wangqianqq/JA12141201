
package IOliu;

import java.io.FileReader;
import java.io.IOException;

/*
 * public int read(char[] cbuf):���ص���ʵ�ʶ�ȡ�ĳ��ȣ������ݶ�ȡ����������
 * */


public class FileReaderDemo {
	public static void main(String[] args) throws IOException {
		//�����ַ�����������
		
		FileReader fr = new FileReader("fr.txt");
		
		//public int read(char[] cbuf)
		
//		//����һ����ʱ����
//		char[] chs = new char[5];
//	
//		//��һ�ζ�ȡ
//		int len = fr.read(chs);//���ļ��е����ݶ�ȡ��������
//		System.out.println(len);//5
//		System.out.println(String.valueOf(chs));//happy
//		
//		//�ڶ��ζ�ȡ
//		len= fr.read(chs);
//		System.out.println(len);//5
//		System.out.println(String.valueOf(chs));//\r\nyes
//		
//		//�����ζ�ȡ
//		len= fr.read(chs);
//		System.out.println(len);//5
//		System.out.println(String.valueOf(chs));//\r\ngoo
//		
//		//�ڶ��ζ�ȡ
//		len= fr.read(chs);
//		System.out.println(len);//1
//		//System.out.println(String.valueOf(chs));//d
//		                                        //goo  
//						//���ֻʣ��dһ��Ԫ��  ������һ�ζ�ȡ�ĺ���λ���ڣ���d\ngoo
//		System.out.println(String.valueOf(chs,0,len));
//		
//		//����ζ�ȡ
//		len= fr.read(chs);
//		System.out.println(len);
//		//���ʵ�ʶ�ȡ�ķ���ֵ��-1��˵����û��Ԫ����
		
//		char[] chs = new char[5];
//		int len = fr.read(chs);
//		while(len!=-1){
//			System.out.print(String.valueOf(chs,0,len));
//			len = fr.read(chs);
//		}
		
		//���հ����
		char[] chs = new char[1024];//1024����������
		int len =0;
		while((len=fr.read(chs))!=-1){
			//System.out.print(String.valueOf(chs,0,len));//���� char ����������ض���������ַ�����ʾ��ʽ��
			//���� char ����������ض���������ַ�����ʾ��ʽ��������һ�е�ͬ
			System.out.print(new String(chs, 0, len));
		}
		 
		 
		
		//�ͷ���Դ
		fr.close();
	}

}
