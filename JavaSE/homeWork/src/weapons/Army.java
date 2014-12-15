package weapons;
import weapon.Weapon;

public class Army {
	int a;
	Weapon[] w;//声明一个Weapon数组 名字为w
	int index = 0;//定义数组的序号
	public Army(int num){
		super();//
		this.a=num;
		this.w = new Weapon[num];//声明数组的长度
	}
	
	public void addWeapon(Weapon wa){
		if(index<=a){
		w[index++]=wa;//给数组赋对象
		}
	}
	
	public void attackAll(){
		//for(int i=0;i<w.length;i++){
		//	w[i].attack();
		//}
		for(Weapon f:w){//for each方法
			if(f!=null){
				f.attack();
			}
		}
	}
	
	public void moveAll(){
		//for(int i=0;i<w.length;i++){
			//w[i].move();
		//}
		for(Weapon e:w){//for each方法
			if(e!=null){
				e.move();
			}
		}
	}
}
