package jiccheng;

class SuperClass{
	private int n;//��Ա����
	
	//������޲ι��췽��
	SuperClass() {
		System.out.println("SuperClass()");
	}
	
	//�����һ�ι��췽��
	SuperClass(int n){
		System.out.println("SuperClass("+n+")");
		this.n=n;
	}
}

class SubClass extends SuperClass{
	private int n;//��Ա����
	
	SubClass(int n){//������д�����һ�ι��췽��
		System.out.println("SubClass("+n+")");
		this.n=n;
	}
	
	SubClass(){//������д������޲ι��췽��
		super(300);//���ø����һ�ι��췽��
		System.out.println("SubClass()");
	}
}

public class TestSuperSub {
	public static void main(String[] args) {
		
		//SubClass sc1=new SubClass();//����������޲ι��췽��
		SubClass sc2=new SubClass(400);//���������һ�ι��췽��
	}

}
