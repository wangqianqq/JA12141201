package XCTX;

public class SetThread implements Runnable{
	private Student s;
	private int x=0;
	
	public SetThread(Student s) {
		this.s = s;
	}

	@Override
	public void run() {
		//Student s =new Student();
		while(true){
			synchronized (s) {
				if(x % 2 == 0){
					s.name="wq";
					s.age=23;
				}else{
					s.name="fym";
					s.age=25;
				}
				x++;
			
			}
			
		}
	}
}
