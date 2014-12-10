import java.util.Scanner;
public class Test{
	public static void main(String[] args){
		System.out.print("请输入总的武器数");
		Scanner sc=new Scanner(System.in);
		int x=sc.nextInt();
		
		Army wq=new Army(x);
		
		
		System.out.print("请输入Tank数");
		Scanner sv=new Scanner(System.in);
		int y=sv.nextInt();
		
		System.out.print("请输入WarShip数");
		Scanner sz=new Scanner(System.in);
		int z=sz.nextInt();
		
		System.out.print("请输入Flighterp数");
		Scanner sq=new Scanner(System.in);
		int e=sq.nextInt();
		 
		 if(e<=x-y-z){
		 for(int i=0;i<y;i++){
			wq.addWeapon(new Tank());//Weapon a=new Tank();
		 }
		 
		 for(int i=0;i<z;i++){
			wq.addWeapon(new WarShip());//Weapon b=new WarShip();
		 }
		 
		 
		 for(int i=0;i<e;i++){
			wq.addWeapon(new Flighter());//Weanpon c=new Flighter();
		 }
		 
		 
		 wq.attackAll();
		 wq.moveAll();
		 }else{
		 
			System.out.print("输入有误，Tank + Flighterp + WarShip的数超过总数，请重新输入");
		 }
	
	}

}