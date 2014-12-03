public class ArrayTest{
	public static void main(String args[]){
		  //声明数组:变量在栈空间
		  int[] arr;    //建议使用这种
		  int   arr[];
		  //int   test[10];
		  //声明数组时，不可以指定大小
		  
		  //初始化:在堆空间存储
		  arr = new int[10];
		  arr = {1, 2, 4};
		   
		   //声明+初始化
		   String[] Str = new String[5];//默认初始化

		   String[] IT = new String[]{"Java","C","C++","Andriod"};
		   String[] IT =             {"Java","C","C++","Andriod"};//简写
	
	}
}