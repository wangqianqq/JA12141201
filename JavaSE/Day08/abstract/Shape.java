//�����ࡾֻ�ܱ��̳С�-------->���ࣺʵ�����г��󷽷�------> ����
//��������   ������


public abstract class Shape{
	//���������ɣ�
	{
		System.out.println("ִ��shap�ĳ�ʼ���顣����");
	
	
	}
	private String color;
	
	//�ܳ� ���󷽷� û��{}
	public abstract double calPerimeter();
	//��״ ���󷽷�����
	public abstract String getType();
	
	
	//����Shap�Ĺ��������ù��������������ڴ���Shap���󣬶������ڱ��������
	public Shape(){
	}
	public Shape(String color){
		
		//this();
		System.out.println("shape������������");
		this.color = color;
	
	}
	public void setColor(String color){
		this.color = color;
	
	}
	public String getColor(){
		return this.color;
	}
	
	
	
	
}