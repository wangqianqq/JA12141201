public class SystemTest{
	public static void main(String[] args) throws Exception{
		//����ϵͳ���еĻ�������
		Map<String,String> env = System.getenv();
		for(String name:env.keySet()){
			System.out.println(name + "--->" + env.get(name));
		
		}
		//��ȡ���е�ϵͳ����
		Properties props = System.getProperties();
		
		//�����е�ϵͳ���Ա��浽props.txt�ļ���
		pros.store(new FileOutputStream("props.txt"),"System Properties");
			//����ض���ϵͳ����
		System.out.println(System.getProperty("os.name"));
	}
}