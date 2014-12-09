public class Test{
	public static void main(String[] args){
		Shape san = new Triangle();
		san.setColor("red");
		Triangle si=(Triangle)san;
		si.setSides(3, 4, 5);
		
		
		System.out.println(san.getType() + "÷‹≥§" + san.calPerimeter());
	}
} 