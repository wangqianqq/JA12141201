public class Circle extends Shape{
		private double radius;
		//û���κι��캯����
		public Circle(String color , double radius){
			//this.color=color;//����˽�еĲ����Լ̳�
			
			super(color); //������Ĺ��캯��
			this.radius = radius;
	    }
	public void setRadius(double radius){
		this.radius = radius;
	}
	//����������д
	public double calPerimeter(){
		return 2 * Math.PI * radius;
	}
	public String getType(){
		return getColor() + "Բ��";
	
	}
	/* public static void main(String[] args){
		Shape s1 = new Triangle("��ɫ" , 3 , 4, 5);
		Shape s2 = new Circle("��ɫ" ,3);
		System.out.println(s1.getType());
		System.out.println(s1.calPerimeter());
		System.out.println(s2.getType());
		System.out.println(s2.calPerimeter()); 
		/* Shape s11=new Triangle();
		Shape s22=new Circle();
		Shape.setColor("��");
		s11.setColor("��");
		s22.setR(10); 
		
	} */
	
}