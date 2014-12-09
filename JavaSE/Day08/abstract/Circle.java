public class Circle extends Shape{
		private double radius;
		//没有任何构造函数的
		public Circle(String color , double radius){
			//this.color=color;//父类私有的不可以继承
			
			super(color); //抽象类的构造函数
			this.radius = radius;
	    }
	public void setRadius(double radius){
		this.radius = radius;
	}
	//子类义务：重写
	public double calPerimeter(){
		return 2 * Math.PI * radius;
	}
	public String getType(){
		return getColor() + "圆形";
	
	}
	/* public static void main(String[] args){
		Shape s1 = new Triangle("黑色" , 3 , 4, 5);
		Shape s2 = new Circle("黄色" ,3);
		System.out.println(s1.getType());
		System.out.println(s1.calPerimeter());
		System.out.println(s2.getType());
		System.out.println(s2.calPerimeter()); 
		/* Shape s11=new Triangle();
		Shape s22=new Circle();
		Shape.setColor("黄");
		s11.setColor("绿");
		s22.setR(10); 
		
	} */
	
}