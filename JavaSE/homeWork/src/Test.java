import weapon.Weapon;
import weapons.Army;
import weapons.Flighter;
import weapons.Tank;
import weapons.WarShip;


public class Test {
	public static void main(String[] args){
		
		Army d=new Army(100);
		
		Weapon weapon1=new Tank();
		d.addWeapon(weapon1);
		d.addWeapon(new Tank());
		d.addWeapon(new Flighter());
		d.addWeapon(new WarShip());
		
		
		d.moveAll();
		d.attackAll();
	}
}
