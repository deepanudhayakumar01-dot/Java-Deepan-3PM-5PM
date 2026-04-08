package jdbcAssignment1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Assignment2 {
	static final String DB_URL="jdbc:mysql://localhost:3306/JDBCAssignment_1";
	static final String USER= "root";
	static final String PASS = "admin";

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try(Connection conn = DriverManager.getConnection(DB_URL,USER,PASS);){
			PreparedStatement stmt=conn.prepareStatement("update Students set studentmark = ? where studentid = ?");
			stmt.setInt(1, 72);
			stmt.setInt(2, 1);
			int i=stmt.executeUpdate();
			System.out.println(i+"Record done");
		}catch(SQLException e) {
			System.out.println(e.getMessage());
		}

	}

}
