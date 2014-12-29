package file_demo;

import java.io.File;
/*
 * File
 * */
import java.io.IOException;

public class FileDemo {
	public static void main(String[] args) throws IOException {
		// . 当前路径 ..上一目录
		File file = new File("../../../.");
		System.out.println(file.getName());//返回由此抽象路径名表示的文件或目录的名称。
		System.out.println(file.getPath());//将此抽象路径名转换为一个路径名字符串。
		System.out.println(file.getAbsolutePath());//返回此抽象路径名的绝对路径名字符串。
		System.out.println(file.getAbsoluteFile());//返回此抽象路径名的绝对路径名形式。
		System.out.println(file.getAbsoluteFile().getParent());
		
		//返回此抽象路径名父目录的路径名字符串；如果此路径名没有指定父目录，则返回 null。
		System.out.println(file.getParent());
		
		
		//创建文件
		
		//在默认临时文件目录中创建一个空文件，使用给定前缀和后缀生成其名称。
		File  tmpFile = File.createTempFile("tem_file", ".txt");
		
		//在指定目录中创建一个新的空文件，使用给定的前缀和后缀字符串生成其名称。
		File tmp  =File.createTempFile("tmp_file", ".txt",file);
		
		//当JVM退出，删除
		tmpFile.delete();//删除此抽象路径名表示的文件或目录。
		tmp.deleteOnExit();//在虚拟机终止时，请求删除此抽象路径名表示的文件或目录。
		
		//创建文件
		File file2=new File("creat_bycode/sub_dir/sub_dir");
		//System.out.println("存在？="+file2.exists());
		
		//在同一目录：不能创建同名的文件、文件夹
		//System.out.println(file2.createNewFile());//当且仅当不存在具有此抽象路径名指定名称的文件时，不可分地创建一个新的空文件。
		//System.out.println(file2.mkdir());//创建此抽象路径名指定的目录。
		//System.out.println(file2.mkdirs());//创建此抽象路径名指定的目录，包括所有必需但不存在的父目录。
		
		//System.out.println("存在？="+file2.exists());
		
		// list() 返回一个字符串数组，这些字符串指定此抽象路径名表示的目录中的文件和目录。
		//如果file表示一个文件，
		String[] str_dir = file.list();
		String[] str_file = file2.list();
		System.out.println("str_dir?="+ str_dir+
				"str_file?"+str_file);
		
		
		//遍历
		System.out.println("打印当前路径下的文件、文件夹");
		for(String string:str_dir){
			System.out.println(string);
		}
		
		byte[] bbuf = new byte[1024];
	}

}
