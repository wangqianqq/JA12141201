package zuoye;

public class Person implements Comparable{
	private String name;
	private int score;
	
	public Person(){
		super();
	}
	
	public Person(String name,int score){
		super();
		this.name=name;
		this.score=score;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	@Override
	public int compareTo(Object o) {//¸´Ð´compareTo·½·¨
		Person p=(Person)o;
		int q=this.score-p.score;
		if(q==0){
			return this.name.compareTo(p.name);
		}else{
			return q;
		}
	}

	@Override
	public String toString() {
		return "name:" + name + "\tscore:" + score ;
	}
	
	
}