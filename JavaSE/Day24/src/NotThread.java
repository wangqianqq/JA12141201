
class Monkey{
	String name;
	
	public Monkey(String name){
		super();
		this.name = name;
	}
	
	public void fight(){
		for(int i = 1;i<11;i++){
			System.out.println(name + "��ܵ�"+ i +"������콫");
		}
	}
	
}



public class NotThread {
	public static void main(String[] args) {
		Monkey m1 = new Monkey("��1��С���");
		Monkey m2 = new Monkey("��2��С���");
		Monkey m3 = new Monkey("��3��С���");
		m1.fight();
		m2.fight();
		m3.fight();
	}

}
