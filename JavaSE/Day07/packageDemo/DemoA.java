package jack;

import gem.java.PackDemo;

public class DemoA{
	String str;
	PackDemo pd=new PackDemo(); //¼òÐ´
	//gem.java.PackDemo pd;//È«³Æ
	
	public static void main(String[] args){
		PackDemo pd=new PackDemo();
		pd.a=123;
		pd.run();
	}
}