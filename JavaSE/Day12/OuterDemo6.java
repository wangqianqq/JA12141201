/*�����ڲ���  ��һ��û�����ֵ��ڲ���
	��ʽ��
	new�������߽ӿ���(){
		��д���нӿڵķ�����
		�����Լ����巽����(һ��϶������Լ����巽��)
	};
	��⣺�����Ǽ̳��������ʵ���˽ӿڵ�������������

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