import java.io.BufferedReader;
import java.io.InputStreamReader;
public class keyboardInTest{
	public static void main(String[] args)
		throws Exception
	{
		//��System.in�ֽ���Ϊ����������һ��BufferedReader����
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = null;
		
		//���ж�ȡ��������
		while((line = br.readLine()) != null)
		{
			System.out.println("�û�����������:" + line);
		
		}
		
		
	
	}

}