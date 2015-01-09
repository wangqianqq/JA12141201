import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;




public class demo {

	public static void main(String[] args) throws ClassNotFoundException {
		String sql="SELECT * FROM tdb_goods";
		//String in_sql="INSERT tdb_goods VALUES(30,'高博',3,1,4500,DEFAULT,DEFAULT);";
		String sql2="DELETE FROM tdb_goods WHERE goods_name='高博';";
		//1、加载驱动
		Class.forName("com.mysql.jdbc.Driver");
		
		//2、获得连接	

		try {
			Connection conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/test","root","921031");
			
			//创建执行语句
			Statement stmt = conn.createStatement();
			//stmt.executeQuery(sql);// 执行给定的 SQL 语句，该语句返回单个 ResultSet 对象。

			//执行给定 SQL 语句，该语句可能为 INSERT、UPDATE 或 DELETE 语句，
			//或者不返回任何内容的 SQL 语句（如 SQL DDL 语句）。
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
