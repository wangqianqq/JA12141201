import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;




public class demo {

	public static void main(String[] args) throws ClassNotFoundException {
		String sql="SELECT * FROM tdb_goods";
		//String in_sql="INSERT tdb_goods VALUES(30,'�߲�',3,1,4500,DEFAULT,DEFAULT);";
		String sql2="DELETE FROM tdb_goods WHERE goods_name='�߲�';";
		//1����������
		Class.forName("com.mysql.jdbc.Driver");
		
		//2���������	

		try {
			Connection conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/test","root","921031");
			
			//����ִ�����
			Statement stmt = conn.createStatement();
			//stmt.executeQuery(sql);// ִ�и����� SQL ��䣬����䷵�ص��� ResultSet ����

			//ִ�и��� SQL ��䣬��������Ϊ INSERT��UPDATE �� DELETE ��䣬
			//���߲������κ����ݵ� SQL ��䣨�� SQL DDL ��䣩��
			//int num=stmt.executeUpdate(in_sql);//
			//System.out.println("num="+num);
			boolean num=stmt.execute(sql2);
			System.out.println("num="+num);
			
			ResultSet rs = stmt.executeQuery(sql);
			
			
			while (rs.next()){
				System.out.println(rs.getString(1)+"\t"+
									rs.getString(2)+"\t"+
									rs.getString(5));
			}
		
		
		
		} catch (SQLException e) {
			e.printStackTrace();
		}
		//
		
			
		
	}

}
