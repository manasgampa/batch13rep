package net.antra1;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;


public class JDBCEx {
	
	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		//Class.forName("com.mysql.jdbc.Driver"); 
		//new oracle.jdbc.driver.OracleDriver();
		//Class.forName("oracle.jdbc.driver.OracleDriver");
		//DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
		//Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "oracle");
		Scanner sc=new Scanner(System.in);
		System.out.println("please enter the emp id:");
		int id=sc.nextInt();
		/*String name=sc.next();
		int sal=sc.nextInt();*/
		
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/system", "root", "manas");
		
		Statement stmt=con.createStatement();
		ResultSet rs=stmt.executeQuery("select * from emp");
		
		ResultSetMetaData rsm= rs.getMetaData();
		int clmcnt=rsm.getColumnCount();
		System.out.println(clmcnt+"clmcnt");
		
		while(rs.next()) {
			
			System.out.println(rs.getInt(1));
			System.out.println(rs.getString(2));
			System.out.println(rs.getInt(3));
			
			
		}
	
		//stmt.executeUpdate("insert into employee values("+id+","+name+","+sal+")");
		con.close();
	}
	
	

}
