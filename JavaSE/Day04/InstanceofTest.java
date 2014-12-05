public class InstanceofTest{
	public static void main(String[] args){
		Person p = new Person("android", 12);
		String str = new String("Hello");
		if(p instanceof Object){
			System.out.println("p 是Object类");
		
		}else{
			System.out.println("p 非Object类");
		
		}
	
	}
}