package list;

import java.util.ArrayList;

public class A {

	
	public static void main(String[] args) {
		ArrayList a1=new ArrayList();
		System.out.println("��СΪ��"+a1.size());
		
		Xs s1=new Xs("WQ", 12, 90);
		Xs s2=new Xs("С��", 13, 80);
		Xs s3=new Xs("С��", 14, 87);
		Xs s4=new Xs("Сǿ", 15, 76);

		a1.add(s1);
		a1.add(s2);
		a1.add(s3);
		a1.add(s4);

		System.out.println("��СΪ��"+a1.size());
		//a1.remove(2);//�Ƴ�
		a1.add(1,s4);//��s4��ӵ�1��λ��

		
		for(int i=0;i<a1.size();i++){
			Xs s = (Xs)a1.get(i);//ǿת  ��Ϊa1���ϸ�����Object����Xsû��ϵ  ����Ҫ��a1ǿתΪXs
			System.out.println("��"+(i+1)+"��ѧ��������"+s.getXingming());//������ѧ����������ȡ����
//			System.out.println("��"+(i+1)+"��ѧ���ɼ���"+s.getChengji());//������ѧ���ĳɼ���ȡ����
//			System.out.println("��"+(i+1)+"��ѧ��ѧ����"+s.getXuehao());//������ѧ����ѧ�Ŷ�ȡ����

		
		}
		
	}

}
