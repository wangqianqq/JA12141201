package weapons;
import weapon.Weapon;

public class Army {
	int a;
	Weapon[] w;//����һ��Weapon���� ����Ϊw
	int index = 0;//������������
	public Army(int num){
		super();//
		this.a=num;
		this.w = new Weapon[num];//��������ĳ���
	}
	
	public void addWeapon(Weapon wa){
		if(index<=a){
		w[index++]=wa;//�����鸳����
		}
	}
	
	public void attackAll(){
		//for(int i=0;i<w.length;i++){
		//	w[i].attack();
		//}
		for(Weapon f:w){//for each����
			if(f!=null){
				f.attack();
			}
		}
	}
	
	public void moveAll(){
		//for(int i=0;i<w.length;i++){
			//w[i].move();
		//}
		for(Weapon e:w){//for each����
			if(e!=null){
				e.move();
			}
		}
	}
}
