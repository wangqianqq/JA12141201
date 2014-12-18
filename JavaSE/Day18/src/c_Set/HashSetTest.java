package c_Set;
import java.util.HashSet;

class A{
	public boolean equals(Object obj){
		return true;//��A��equlas()�������Ƿ���true����û����д��hasCode()����
	}
}
class B{
	public int hashCode(){
		return 1;//��B��hashCode()�������Ƿ���1����û����дequals()����
	}
}
class C{
	public int hashCode(){
		return 2;//��C��hasCode()�������Ƿ���2.����д����equals()����
	}
	public boolean equals(Object obj){
		return true;
	}
}	


public class HashSetTest {

	public static void main(String[] args) {
		HashSet hs =new HashSet();
		
		
		/*
		 * ��дequals����������true������£�����hashCode��һ����
		 * ��ˣ�hashSet��Ȼ������������
		 * */
		System.out.println(hs.add(new A()));
		System.out.println(""+hs.add(new A())+hs.size());
		
		
		/*
		 * �������hashcode��ͬ�����ǣ�equals��������false
		 * ��ˣ�hashset���������ͬ��Ԫ��
		 * */
		System.out.println(hs.add(new B()));
		System.out.println(""+hs.add(new B())+hs.size());
		
		/*
		 * ��equals����true��hashcode������ͬ��ֵ��
		 * hashset������Ϊ��ͬһ��Ԫ��
		 * 
		 * 
		 * */
		System.out.println(hs.add(new C()));
		System.out.println(""+hs.add(new C())+hs.size());
		
		
	}

}
