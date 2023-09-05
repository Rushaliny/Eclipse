package Jobseeker;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class RegisterDAO {
	
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
	
	public String insert(RegisterBean registerBean) {
		
		loadDriver (dbDriver);
		Connection con =getConnection();
		String sql="INSERT INTO jobseeker (firstname,lastname,gender,state,city,dob,pincode,course,email,password) values(?,?)";
		String result = "Register Successfully!";
		PreparedStatement ps;
		try {
			ps = con.prepareStatement(sql);
			ps.setString(1, RegisterBean.firstname());
			ps.setString(2, RegisterBean.lastname());
			ps.setString(3, RegisterBean.gender());
			ps.setString(4, RegisterBean.state());
			ps.setString(5, RegisterBean.city());
			ps.setString(6, RegisterBean.dob());
			ps.setString(7, RegisterBean.pincode());
			ps.setString(8, RegisterBean.course());
			ps.setString(9, RegisterBean.email());
			ps.setString(10,RegisterBean.password());
		
			ps.executeUpdate();
		}
		catch(SQLException e ) {
			result = "Somthing Error";
		}
		return result;
	}

	public boolean insert(RegisterDAO registerDAO) {
		// TODO Auto-generated method stub
		return false;
	}
	
	
//	  public boolean validateUser(String email, String password) {
//	        try {
//	        	loadDriver (dbDriver);
//	    		Connection con =getConnection();
//	            String query = "SELECT * FROM jobseeker WHERE email = ? AND password = ?";
//	            PreparedStatement statement =con.prepareStatement(query);
//	            statement.setString(1, email);
//	            statement.setString(2, password);
//
//	            ResultSet resultSet = statement.executeQuery();
//	            return resultSet.next();
//	        } catch (SQLException e) {
//	            e.printStackTrace();
//	            return false;
//	        }
//	    }




}
