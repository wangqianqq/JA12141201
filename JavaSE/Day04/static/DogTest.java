//������Ա��������ʼ��������===���캯��
//������������ܲ����ٹ��캯���г�ʼ��
public class DogTest{
	public static void main(String[] args){
		//�����
		System.out.println("Dog.type=" + Dog.type);
		Dog.type = "����"; 
		System.out.println("Dog.type=" + Dog.type);
	/*
		
		//�����
		System.out.println("dog.type=" + dog.type);
		System.out.println("dog2.type=" + dog2.type);
		System.out.println("Dog.type=" + D og.type);
		
		//ʵ������:�����ڶ���
		System.out.println("dog.age=" + dog.age);
		System.out.println("dog2.age=" + dog2.age);
		*/
		//Dog.age = 123;
	
		
		Dog  dog = new Dog(12,"Red");
		Dog dog2 = new Dog(15, "Black");
		dog.bark();//this===dog
		dog2.bark();//this===dog2
		//ʹ�ö������� ���� �෽��
		dog.bark1();
		dog2.bark1();
	}
}