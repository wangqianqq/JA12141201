package list;

import java.util.ArrayList;

public class A {

	
	public static void main(String[] args) {
		ArrayList a1=new ArrayList();
		System.out.println("大小为："+a1.size());
		
		Xs s1=new Xs("WQ", 12, 90);
		Xs s2=new Xs("小明", 13, 80);
		Xs s3=new Xs("小红", 14, 87);
		Xs s4=new Xs("小强", 15, 76);

		a1.add(s1);
		a1.add(s2);
		a1.add(s3);
		a1.add(s4);

		System.out.println("大小为："+a1.size());
		//a1.remove(2);//移除
		a1.add(1,s4);//把s4添加到1的位置

		
		for(int i=0;i<a1.size();i++){
			Xs s = (Xs)a1.get(i);//强转  因为a1集合父类是Object，和Xs没关系  所有要把a1强转为Xs
			System.out.println("第"+(i+1)+"个学生姓名是"+s.getXingming());//把所有学生的姓名都取出来
//			System.out.println("第"+(i+1)+"个学生成绩是"+s.getChengji());//把所有学生的成绩都取出来
//			System.out.println("第"+(i+1)+"个学生学号是"+s.getXuehao());//把所有学生的学号都取出来

		
		}
		
	}

}
