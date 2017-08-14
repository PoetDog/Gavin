package servlet;

import java.sql.Connection;
import java.sql.DriverManager;



public class MySQLDBCon {
	private static Connection conn = null;
	public static Connection getConn(){
		try{
			Class.forName("com.mysql.jdbc.Driver");
			String user = "root";
			String pwd = "root";
			String url = "jdbc:mysql://localhost:3306/test";
			conn = DriverManager.getConnection(url,user,pwd);
		}catch(Exception ex){
			ex.printStackTrace();
		}
		return conn;
	}
}
