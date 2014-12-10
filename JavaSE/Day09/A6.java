import java.util.Scanner;
public class A6{
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		System.out.println("请输入你要找的学员的名字：");
		String name=in.next();
		String[] arr={"张三", "李四" ,"王二" ,"麻子" ,"张三","wq"};
		boolean flag=false;
		for(int i=0;i<arr.length;i++){
			if(name.equals(arr[i])){//判断输入的name和下标为i的数组里面的名字是不是一样
				flag=true;
				break;
			}	
		}
		if (flag==true){
		System.out.println("找到了");
		}else{
		System.out.println("没有这个学员存在");
		
		
		}
	}
}