//����ѡ������
public class A9{
	public static void main(String[] args){
		int[] arr={23,45,43,64,34,23,45,89};
		for(int i=0;i<arr.length;i++){//���forѭ��
			for(int j=i+1;j<arr.length;j++){//С��forѭ��
				if(arr[i]>arr[j]){
					int t=arr[i];
					arr[i]=arr[j];
					arr[j]=t;
				}
			}
		}
	for(int i =0;i<arr.length;i++){
		System.out.println(arr[i]);
	}
	}

}