public class Account{
	String user="geminno";
	String password="123456";
	
	public void setPwd(String str){
		this.password = str;
	}
	public void info(){
		System.out.println("user:" + this.user + "password:" + this.password);
	}
}