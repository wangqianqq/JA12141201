package SPKCGL;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Test {
	public static void main(String[] args)  throws Exception{
		Spgl shipin=new Spgl();
		BufferedReader sr = new BufferedReader(new InputStreamReader(System.in));//输入流
		
		while(true){ //死循环
			System.out.println("请按提示选择一下功能：");
			System.out.println("添加食品请按1");
			System.out.println("查找食品请按2");
			System.out.println("修改食品价格请按3");
			System.out.println("删除食品请按4");
			System.out.println("退出请按0");
			String str = sr.readLine();
			
			
			if(str.equals("1")){
				System.out.println("请输入食品编号");
				String bh = sr.readLine();
				System.out.println("请输入食品名称");
				String mc = sr.readLine();
				System.out.println("请输入食品价格");
				Float jg = Float.parseFloat(sr.readLine());
			
				Sp sp = new Sp(bh, mc, jg);
				shipin.addsp(sp);
			}
		
			else if(str.equals("2")){
				System.out.println("请输入食品编号");
				String bh = sr.readLine();
				shipin.spxx(bh);
			}
			else if(str.equals("3")){
				System.out.println("请输入食品编号");
				String bh = sr.readLine();
				System.out.println("请输入新的价格");
				Float jg = Float.parseFloat(sr.readLine());
				shipin.spjg(bh,jg);
			}
			
			else if(str.equals("4")){
				System.out.println("请输入食品编号");
				String bh=sr.readLine();
				shipin.delsp(bh);
			}
			else if(str.equals("0")){
				System.out.println("感谢你的使用，再见！");
				System.exit(0);
			}
			else {
				System.out.println("输入有误");
			
			}
		}
	}
}
