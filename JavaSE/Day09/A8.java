//数组冒泡排序
public class A8{
	public static void main(String[] args){
		int[] arr={34,87,21,45,64,43,78};
		for(int i=0;i<arr.length-1;i++){//大的for循环
			for(int j=0;j<arr.length-1;j++){//小的for循环
				if(arr[j]>arr[j+1]){
					int t=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=t;
				
				}
			}
		}
			for(int i=0;i<arr.length;i++){
				System.out.println(arr[i]);
			
		
		}
		
	}

}