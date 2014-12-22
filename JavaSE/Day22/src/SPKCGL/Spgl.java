package SPKCGL;

import java.util.ArrayList;

class Spgl {
	private ArrayList aa=null;
	
	Spgl(){
		aa=new ArrayList();
	}
	
	
	//方法
	//1、添加食品
	public void addsp(Sp sp) {
		aa.add(sp);
		System.out.println("添加食品成功！");
	}
	
	
	//2、食品信息
	public void spxx (String bh) {
		int i;
		
		for(i=0;i<aa.size();i++){
			Sp sp=(Sp)aa.get(i);
			if(sp.getBianhao().equals(bh)){
				System.out.println("该食品的信息为：");
				System.out.println("食品编号："+bh);
				System.out.println("食品名称："+sp.getMingcheng());
				System.out.println("食品价格："+sp.getJiage());
				break;
			}
		}
		if(i==aa.size()){
			System.out.println("对不起，无此食品！");
		}
	}	
	
	//3、修改价格
	public void spjg(String bh,float jg){
		int i;
		for(i=0;i<aa.size();i++){
				Sp sp=(Sp)aa.get(i);//向下转型
				if(sp.getBianhao().equals(bh)){
					sp.setJiage(jg);//调用setJiage方法
					System.out.println("修改食品价格成功！");
					break;
				}
		}
		
		if(i==aa.size()){
			System.out.println("对不起，没有找到相应的食品，修改价格失败！");
		}
	}
	
	//4、删除食品
	public void delsp(String bh){
		int i;
		if(aa.size()==0){
			System.out.println("对不起，仓库中已没有任何食品！");
		}
		
		for(i=0;i<aa.size();i++){
			Sp sp=(Sp)aa.get(i);//转型
			
			if(sp.getBianhao().equals(bh)){
				aa.remove(i);
				System.out.println("删除食品成功！");
				break;
			}
		}
		
		if(i==aa.size() && aa.size()!=0){
			System.out.println("对不起，没有该食品！");
		}
	}
}
