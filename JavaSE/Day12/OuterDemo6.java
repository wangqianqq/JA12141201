/*匿名内部类  是一个没有名字的内部类
	格式：
	new类名或者接口名(){
		重写类中接口的方法。
		或者自己定义方法。(一般肯定不会自己定义方法)
	};
	理解：本质是继承了类或者实现了接口的子类匿名对象。

*/
abstract class Fu{
	public abstract void show();

}

class Outer{
	new Fu(){
		public void show(){
			s=System.out.println("show");
		}
	
	}.show();

}












class OuterDemo5{
	public static void main(String[] args){
	
	
	}