public class PrimitiveTransferTest{
	public static void swap(int a,int b){
	//下面三行代码实现a、b变量的值交换
	//定义一个临时变量来保存a比赛能力的值
	int tmp = a;
	//把临时变量tmp的值赋给a
	b=tmp;
	System.out.println("swap方法里，a的值是"+ a + ";b的值是" +b);
	
	}
	public static void main(String[] args){
		int a = 6;
		int b = 9;
		swap(a , b);
		System.out.println("交换交换后，变量a的值是" +a + ";变量b的值是"+ b);
	}

}