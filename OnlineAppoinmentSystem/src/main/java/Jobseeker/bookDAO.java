package Jobseeker;

import java.sql.DriverManager;
import java.sql.SQLException;

import com.mysql.jdbc.Connection;

import Jobseeker.bookBean;

public class bookDAO {

	private String dbUrl="jdbc:mysql://localhost::3306/student";

	private String dbUname="root";

	private String dbpassword="Icbt@321";

	private String dbDriver="com.mysql.jdbc.Driver";
	
	public void loadDriver(String dbDeiver) {
		try {
			Class.forName(dbDeiver);
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
	
//Insertion Code ...
	public String insert(bookBean bookbean) {
		
		loadDriver (dbDriver);
		Connection con =getConnection();
		String sql="INSERT INTO studentdetails values(?,?)";
		String result = "Data Insert Successfully!";
		java.sql.PreparedStatement ps;
		try {
			ps = con.prepareStatement(sql);
			ps.setString(1, bookBean.name());
			ps.setString(2, bookBean.email());
			ps.setString(3, bookBean.phone());
			ps.setString(4, bookBean.date());
			ps.setString(5, bookBean.consutant());
			ps.setString(6, bookBean.massage());
		
			ps.executeUpdate();
		}
		catch(SQLException e ) {
			result = "Data Not Insert";
		}
		
		
		
		return result;
		
	}



	
}
