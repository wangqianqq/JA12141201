import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;
import java.util.Properties;




public class ExecuteSQL {
	
	private String driver;
	private String url;
	private String user;
	private String pass;
	
	public void initParam(String paramFile) throws Exception{
		
		//ʹ��Properties�������������ļ�
		Properties props=new Properties();
		props.load(new FileInputStream(paramFile));
		driver=props.getProperty("driver");
		url=props.getProperty("url");
		user=props.getProperty("user");
		pass=props.getProperty("pass");
	}

	public void executeSql(String sql) throws Exception {
		//��������
		Class.forName(driver);
		try(
				//��ȡ���ݿ�����
				Connection conn=DriverManager.getConnection(url,user,pass);
				
				//ʹ��Connection������һ��Statement����
				Statement stmt=conn.createStatement()){
			
			//ִ��SQL��䣬����booleanֵ��ʾ����ResultSet
			boolean hasResultSet=stmt.execute(sql);
			
			//���ִ�к���Result�����
			if(hasResultSet){
				
				try(
				//��ȡ�����
				ResultSet rs = stmt.getResultSet()){
				
					//ResultSetMetaData�����ڷ����������Ԫ���ݽӿ�
					ResultSetMetaData rsmd = rs.getMetaData();
					int columnCount=rsmd.getColumnCount();
					
					//�������ResultSet����
					while(rs.next()){
						//�������ÿ�е�ֵ
						for(int i=0;i<columnCount;i++){
							System.out.println(rs.getString(i+1)+"\t");
						}
						System.out.println("\n");
					}
				}
			}else{
				System.out.println("��SQL���Ӱ��ļ�¼��"+stmt.getUpdateCount()+"��");
			}
			
		}
				
	}
	public static void main(String[] args) throws Exception {
		ExecuteSQL es=new ExecuteSQL();
		
		es.initParam("mysql.ini");
		System.out.println("-----ִ�н����DDL���-----");
		
		es.executeSql("drop table if exists my_test");
		System.out.println("-----ִ�н����DDL���-----");
		
		es.executeSql("create table my_test"
					+"( test_id int auto_increment primary key,"
					+" test_name varchar(255))");
		System.out.println("------ִ�в������ݵ�DML���------");
		
		
		es.executeSql("insert into my_test(test_name)"+" select student_name from student_table");
		
		System.out.println("------ִ�в������ݵĲ�ѯ���------");
		es.executeSql("select * from my_test");

		
	}		
}
