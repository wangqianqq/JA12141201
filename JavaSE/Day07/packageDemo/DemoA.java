package jack;

import gem.java.PackDemo;

public class DemoA{
	String str;
	PackDemo pd=new PackDemo(); //��д
	//gem.java.PackDemo pd;//ȫ��
	
	public static void main(String[] args){
		PackDemo pd=new PackDemo();
		pd.a=123;
		pd.run();
	}
}