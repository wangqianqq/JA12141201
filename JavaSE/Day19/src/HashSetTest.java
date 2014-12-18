import java.util.HashSet;

//类A的equals()方法总是返回true，但没有重写hasCode()方法
class A{
	public boolean equals(Object obj){
		return true;
	}
}

//类B的hasCode()方法总是返回1，但没有重写equals()方法
class B{
	public int hasCode(){
		return 1;
	}
}

//类C的hasCode()方法总是返回2，且重写了其equals()方法
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
