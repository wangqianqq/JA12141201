import java.util.HashSet;

//��A��equals()�������Ƿ���true����û����дhasCode()����
class A{
	public boolean equals(Object obj){
		return true;
	}
}

//��B��hasCode()�������Ƿ���1����û����дequals()����
class B{
	public int hasCode(){
		return 1;
	}
}

//��C��hasCode()�������Ƿ���2������д����equals()����
class C{
	public int hasCode(){
		return 2;
	}
	public boolean equals(Object obj){
	return true;
	}
}
public class HashSetTest {
	public static void main(String[] args) {
		HashSet books=new HashSet();
		
		books.add(new A());
		books.add(new A());
		books.add(new B());
		books.add(new B());
		books.add(new C());
		books.add(new C());
		
		System.out.print(books);


	}

}
