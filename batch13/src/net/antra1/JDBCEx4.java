package net.antra1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class JDBCEx4 {

	public static void main(String[] args) throws SQLException {
		
		//Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "oracle");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/system", "root", "manas");
		con.setAutoCommit(false);
		try {
		PreparedStatement pstmt=con.prepareStatement("insert into emp values(?,?,?)");
		pstmt.setInt(1,4);
		pstmt.setString(2, "John");
		pstmt.setInt(3, 123);
		
		pstmt.execute();
		
		pstmt.setInt(1, 5);
		pstmt.setString(2,"clob");
		pstmt.setInt(3, 345);
		
		pstmt.execute();
		
		pstmt.setInt(1, 4);
		pstmt.setString(2, "Paul");
		pstmt.setInt(3, 345);
		
		pstmt.execute();
	
		
		con.commit();
		
		}catch(Exception e) {
			e.printStackTrace();
			con.rollback();
		}
		
	}
}
