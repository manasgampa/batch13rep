package net.antra1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class JDBCEx2 {
	
	public static void main(String[] args) throws SQLException {
		
		/*Scanner sc=new Scanner(System.in);
		System.out.println("please enter the emp id:");
		int id=sc.nextInt();
		System.out.println("please enter the emp name:");
		String name=sc.next();
		System.out.println("please enter the emp sal:");
		int sal=sc.nextInt();*/
		
		
		//Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "oracle");
		
		
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/system", "root", "manas");
		/*PreparedStatement pstmt=con.prepareStatement("insert into employee values(?,?,?)");
		pstmt.setInt(1, id);
		pstmt.setString(2, name);
		pstmt.setInt(3, sal);
		pstmt.execute();*/
		
		PreparedStatement pstmt=con.prepareStatement("insert into employee values(?,?,?)");
		pstmt.setInt(1,4);
		pstmt.setString(2, "John");
		pstmt.setInt(3, 123);
		
		pstmt.addBatch();
		
		pstmt.setInt(1, 5);
		pstmt.setString(2,"clob");
		pstmt.setInt(3, 345);
		
		pstmt.addBatch();
		
		pstmt.setInt(1, 6);
		pstmt.setString(2, "Paul");
		pstmt.setInt(3, 345);
		
		pstmt.addBatch();
	
		pstmt.executeBatch();
		
	}

}
