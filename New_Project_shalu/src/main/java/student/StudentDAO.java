//dao class for data base connection
package student;

import java.sql.DriverManager;
import java.sql.SQLException;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;

public class StudentDAO {
	
	private String dbUrl="jdbc:mysql://localhost::3306/student";

	private String dbUname="root";

	private String dbpassword="Icbt@321";

	private String dbDriver="com.mysql.jdbc.Driver";
	
	//Driver Load 
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
	public String insert(StudentBean studentbean) {
		
		loadDriver (dbDriver);
		Connection con =getConnection();
		String sql="INSERT INTO studentdetails values(?,?)";
		String result = "Data Insert Successfully!";
		java.sql.PreparedStatement ps;
		try {
			ps = con.prepareStatement(sql);
			ps.setString(1, studentbean.getUsername());
			ps.setString(2, studentbean.getnumber());
			ps.setString(3, studentbean.getPassword());
			
			ps.executeUpdate();
		}
		catch(SQLException e ) {
			result = "Data Not Insert";
		}
		
		
		
		return result;
		
	}



}
