import java.util.Scanner;
public class A6{
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		System.out.println("��������Ҫ�ҵ�ѧԱ�����֣�");
		String name=in.next();
		String[] arr={"����", "����" ,"����" ,"����" ,"����","wq"};
		boolean flag=false;
		for(int i=0;i<arr.length;i++){
			if(name.equals(arr[i])){//�ж������name���±�Ϊi����������������ǲ���һ��
				flag=true;
				break;
			}	
		}
		if (flag==true){
		System.out.println("�ҵ���");
		}else{
		System.out.println("û�����ѧԱ����");
		
		
		}
	}
}