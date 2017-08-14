package servlet;

import java.sql.*;

import bean.UserInfo;

public class LoginDao {
	private static LoginDao instance = null;
	public static LoginDao getInstance(){
		if(instance==null){
			instance = new LoginDao();
		}
		return instance;
	}//本类实例
	public boolean saveUser(UserInfo user){
		Connection conn = null;
		try{
			conn = MySQLDBCon.getConn();
			String sql="insert into user(name,pwd,sex,age,email)values(?,?,?,?,?)";
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1, user.getName());
			ps.setString(2, user.getPwd());
			ps.setString(3, user.getSex());
			ps.setInt(4, user.getAge());
			ps.setString(5, user.getEmail());
			ps.executeUpdate();
			return true;
		}catch(Exception ex){
			ex.printStackTrace();
		}finally{
			try{
				conn.close();
			}catch(SQLException e){
				e.printStackTrace();
			}
		}
		return false;
	}
}
