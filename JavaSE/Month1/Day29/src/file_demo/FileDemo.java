package file_demo;

import java.io.File;
/*
 * File
 * */
import java.io.IOException;

public class FileDemo {
	public static void main(String[] args) throws IOException {
		// . ��ǰ·�� ..��һĿ¼
		File file = new File("../../../.");
		System.out.println(file.getName());//�����ɴ˳���·������ʾ���ļ���Ŀ¼�����ơ�
		System.out.println(file.getPath());//���˳���·����ת��Ϊһ��·�����ַ�����
		System.out.println(file.getAbsolutePath());//���ش˳���·�����ľ���·�����ַ�����
		System.out.println(file.getAbsoluteFile());//���ش˳���·�����ľ���·������ʽ��
		System.out.println(file.getAbsoluteFile().getParent());
		
		//���ش˳���·������Ŀ¼��·�����ַ����������·����û��ָ����Ŀ¼���򷵻� null��
		System.out.println(file.getParent());
		
		
		//�����ļ�
		
		//��Ĭ����ʱ�ļ�Ŀ¼�д���һ�����ļ���ʹ�ø���ǰ׺�ͺ�׺���������ơ�
		File  tmpFile = File.createTempFile("tem_file", ".txt");
		
		//��ָ��Ŀ¼�д���һ���µĿ��ļ���ʹ�ø�����ǰ׺�ͺ�׺�ַ������������ơ�
		File tmp  =File.createTempFile("tmp_file", ".txt",file);
		
		//��JVM�˳���ɾ��
		tmpFile.delete();//ɾ���˳���·������ʾ���ļ���Ŀ¼��
		tmp.deleteOnExit();//���������ֹʱ������ɾ���˳���·������ʾ���ļ���Ŀ¼��
		
		//�����ļ�
		File file2=new File("creat_bycode/sub_dir/sub_dir");
		//System.out.println("���ڣ�="+file2.exists());
		
		//��ͬһĿ¼�����ܴ���ͬ�����ļ����ļ���
		//System.out.println(file2.createNewFile());//���ҽ��������ھ��д˳���·����ָ�����Ƶ��ļ�ʱ�����ɷֵش���һ���µĿ��ļ���
		//System.out.println(file2.mkdir());//�����˳���·����ָ����Ŀ¼��
		//System.out.println(file2.mkdirs());//�����˳���·����ָ����Ŀ¼���������б��赫�����ڵĸ�Ŀ¼��
		
		//System.out.println("���ڣ�="+file2.exists());
		
		// list() ����һ���ַ������飬��Щ�ַ���ָ���˳���·������ʾ��Ŀ¼�е��ļ���Ŀ¼��
		//���file��ʾһ���ļ���
		String[] str_dir = file.list();
		String[] str_file = file2.list();
		System.out.println("str_dir?="+ str_dir+
				"str_file?"+str_file);
		
		
		//����
		System.out.println("��ӡ��ǰ·���µ��ļ����ļ���");
		for(String string:str_dir){
			System.out.println(string);
		}
		
		byte[] bbuf = new byte[1024];
	}

}
