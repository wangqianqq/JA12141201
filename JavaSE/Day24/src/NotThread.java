
class Monkey{
	String name;
	
	public Monkey(String name){
		super();
		this.name = name;
	}
	
	public void fight(){
		for(int i = 1;i<11;i++){
			System.out.println(name + "打败第"+ i +"个天兵天将");
		}
	}
	
}



public class NotThread {
	public static void main(String[] args) {
		Monkey m1 = new Monkey("第1个小悟空");
		Monkey m2 = new Monkey("第2个小悟空");
		Monkey m3 = new Monkey("第3个小悟空");
		m1.fight();
		m2.fight();
		m3.fight();
	}

}
