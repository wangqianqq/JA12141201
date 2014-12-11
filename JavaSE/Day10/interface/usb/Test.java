public class Test{
	public static void main(String[] args){
		//继承的向上转型 VS 接口、实现类的向上转型
		USB upan=new Udisk();//向上转型
		//System.out.println(upan.brand);//error //子类特有的属性不可以访问，要向下转型
		upan.read();
		upan.write();
		
		USB key=new USB_KEY();//向上转型
		key.read();
		key.write();
	}

}