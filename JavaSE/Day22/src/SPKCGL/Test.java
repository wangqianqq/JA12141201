package SPKCGL;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Test {
	public static void main(String[] args)  throws Exception{
		Spgl shipin=new Spgl();
		BufferedReader sr = new BufferedReader(new InputStreamReader(System.in));//������
		
		while(true){ //��ѭ��
			System.out.println("�밴��ʾѡ��һ�¹��ܣ�");
			System.out.println("���ʳƷ�밴1");
			System.out.println("����ʳƷ�밴2");
			System.out.println("�޸�ʳƷ�۸��밴3");
			System.out.println("ɾ��ʳƷ�밴4");
			System.out.println("�˳��밴0");
			String str = sr.readLine();
			
			
			if(str.equals("1")){
				System.out.println("������ʳƷ���");
				String bh = sr.readLine();
				System.out.println("������ʳƷ����");
				String mc = sr.readLine();
				System.out.println("������ʳƷ�۸�");
				Float jg = Float.parseFloat(sr.readLine());
			
				Sp sp = new Sp(bh, mc, jg);
				shipin.addsp(sp);
			}
		
			else if(str.equals("2")){
				System.out.println("������ʳƷ���");
				String bh = sr.readLine();
				shipin.spxx(bh);
			}
			else if(str.equals("3")){
				System.out.println("������ʳƷ���");
				String bh = sr.readLine();
				System.out.println("�������µļ۸�");
				Float jg = Float.parseFloat(sr.readLine());
				shipin.spjg(bh,jg);
			}
			
			else if(str.equals("4")){
				System.out.println("������ʳƷ���");
				String bh=sr.readLine();
				shipin.delsp(bh);
			}
			else if(str.equals("0")){
				System.out.println("��л���ʹ�ã��ټ���");
				System.exit(0);
			}
			else {
				System.out.println("��������");
			
			}
		}
	}
}
