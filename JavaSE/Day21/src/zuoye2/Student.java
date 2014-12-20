package zuoye2;

public class Student implements Comparable{
	private int sNO;
	private String sName;
	private char sSex;
	private int sAge;
	private double sJava;//属性
	
	//构造方法
	public Student(int sNO, String sName, char sSex, int sAge, double sJava) {
		super();
		this.sNO = sNO;
		this.sName = sName;
		this.sSex = sSex;
		this.sAge = sAge;
		this.sJava = sJava;
	}

	public int getsNO() {
		return sNO;
	}

	public String getsName() {
		return sName;
	}

	public char getsSex() {
		return sSex;
	}

	public int getsAge() {
		return sAge;
	}

	public double getsJava() {
		return sJava;
	}

	
	@Override
	public String toString() {
		return "sNO=" + sNO +  " \tsName=" + sName + "\tsSex=" + sSex
				+ "\tsAge=" + sAge + " \tsJava=" + sJava;
	}

	public int compareTo(Object s) {//复写compareTo方法
		Student s1=(Student)s;
		int h=(int)(this.sJava-s1.sJava);
		return h==0?this.sName.compareTo(s1.sName):h;
		
	}
}

