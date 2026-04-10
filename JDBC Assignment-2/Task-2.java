package jdbcAssignment2;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Assignment2 {
	static final String DB_URL="jdbc:mysql://localhost:3306/JDBCAssignment_1";
	static final String USER= "root";
	static final String PASS = "admin";

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try(Connection conn = DriverManager.getConnection(DB_URL,USER,PASS);) {
			CallableStatement cs=conn.prepareCall("call insertEmployee(?,?,?,?)");
			cs.setInt(1, 4);
			cs.setString(2,"Lithin");
			cs.setInt(3, 3);
			cs.setDouble(4,60000);
			cs.execute();
			System.out.println("Your record has done");
			
		}catch(SQLException e) {
			System.out.println(e.getMessage());
		}

	}

}
