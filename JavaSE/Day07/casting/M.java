/* 
1�����������ת�ͣ�����ת�ɸ��� Ĭ�Ͻ��� ��������ָ���������
2�����൱������ת�� ����ת������ ǿ�ƽ���

�ؼ��֣�instanceof������ߵĶ����Ƿ����ұ����ʵ��
����Ƿ���true ���Ƿ���false


 */

class Animal{
	void sleep(){
		System.out.println("˯��");
	}
}

class Cat extends Animal{
	void catchMouse(){
		System.out.println("����");
	}
}

class Dog extends Animal{

}

public class M{
	public static void main(String[] args){
		Animal a=new Cat();//����ת��
		//Cat b=(Cat)a;//����ת��   ǿ��ת��
		//b.catchMouse();//���Է�������ķ���
		//b.sleep();//���Է��ʸ���ķ���
		//Dog d=(Dog)a;//new��������ë���������Ը���
		System.out.println(a instanceof Animal);
	}
}