package SPKCGL;

import java.util.ArrayList;

class Spgl {
	private ArrayList aa=null;
	
	Spgl(){
		aa=new ArrayList();
	}
	
	
	//����
	//1�����ʳƷ
	public void addsp(Sp sp) {
		aa.add(sp);
		System.out.println("���ʳƷ�ɹ���");
	}
	
	
	//2��ʳƷ��Ϣ
	public void spxx (String bh) {
		int i;
		
		for(i=0;i<aa.size();i++){
			Sp sp=(Sp)aa.get(i);
			if(sp.getBianhao().equals(bh)){
				System.out.println("��ʳƷ����ϢΪ��");
				System.out.println("ʳƷ��ţ�"+bh);
				System.out.println("ʳƷ���ƣ�"+sp.getMingcheng());
				System.out.println("ʳƷ�۸�"+sp.getJiage());
				break;
			}
		}
		if(i==aa.size()){
			System.out.println("�Բ����޴�ʳƷ��");
		}
	}	
	
	//3���޸ļ۸�
	public void spjg(String bh,float jg){
		int i;
		for(i=0;i<aa.size();i++){
				Sp sp=(Sp)aa.get(i);//����ת��
				if(sp.getBianhao().equals(bh)){
					sp.setJiage(jg);//����setJiage����
					System.out.println("�޸�ʳƷ�۸�ɹ���");
					break;
				}
		}
		
		if(i==aa.size()){
			System.out.println("�Բ���û���ҵ���Ӧ��ʳƷ���޸ļ۸�ʧ�ܣ�");
		}
	}
	
	//4��ɾ��ʳƷ
	public void delsp(String bh){
		int i;
		if(aa.size()==0){
			System.out.println("�Բ��𣬲ֿ�����û���κ�ʳƷ��");
		}
		
		for(i=0;i<aa.size();i++){
			Sp sp=(Sp)aa.get(i);//ת��
			
			if(sp.getBianhao().equals(bh)){
				aa.remove(i);
				System.out.println("ɾ��ʳƷ�ɹ���");
				break;
			}
		}
		
		if(i==aa.size() && aa.size()!=0){
			System.out.println("�Բ���û�и�ʳƷ��");
		}
	}
}
