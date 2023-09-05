package Jobseeker;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class JloginDAO {
	private String dbUrl="jdbc:mysql://localhost:3306/abroad_wizard";

	private String dbUname="root";

	private String dbpassword="";

	private String dbDriver="com.mysql.cj.jdbc.Driver";
	
	public void loadDriver(String dbDriver) {
		try {
			Class.forName(dbDriver);
		}
		catch(ClassNotFoundException e){
			e.printStackTrace();
		}
	}
	
// Connection method ...
	public Connection getConnection() {
		Connection con = null;
		try {
			con = (Connection) DriverManager.getConnection(dbUrl,dbUname,dbpassword);
		}
		catch(SQLException e){
			e.printStackTrace();
		}
		return con;
	}
	
//Login Code ...
//	public String insert(JloginBean jloginbean) {
//		
//		loadDriver (dbDriver);
//		Connection con =getConnection();
//		String sql="INSERT INTO consultant_details values(?,?)";
//		String result = "Login Successfully!";
//		PreparedStatement ps;
//		try {
//			ps = con.prepareStatement(sql);
////			ps.setString(1, loginBean.getEmail());
////			ps.setString(2, loginBean.Consultant_password());
//		
//			ps.executeUpdate();
//		}
//		catch(SQLException e ) {
//			result = "UserEmail Password is Wrong";
//		}
//		return result;
//	}
//	
	
	  public boolean validateUser(String email, String password) {
	        try {
	        	loadDriver (dbDriver);
	    		Connection con =getConnection();
	            String query = "SELECT * FROM jobseeker WHERE email = ? AND password = ?";
	            PreparedStatement statement =con.prepareStatement(query);
	            statement.setString(1, email);
	            statement.setString(2, password);

	            ResultSet resultSet = statement.executeQuery();
	            return resultSet.next();
	        } catch (SQLException e) {
	            e.printStackTrace();
	            return false;
	        }
	    }




}
