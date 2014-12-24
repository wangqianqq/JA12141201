
public class One extends Thread{
	int ticket=10;//共有十张票出售
	int num = 0;//当前卖出的票数
	
	public void run(){
		for(int i = 1;i<=100;i++){
			if(ticket > 0){
				ticket--;
				num++;
				System.out.println(getName()+"卖出了第"+num +"张车票，还剩"+ticket+"张车票");
			}
		}
	}
	
	
	
	public static void main(String[] args) {
		One o1=new One();
		One O2=new One();
		One O3=new One();
		o1.setName("第一个售票窗口");
		o1.setName("第二个售票窗口");
		o1.setName("第三个售票窗口");
		o1.start();
		O2.start();
		O3.start();
	}

}
