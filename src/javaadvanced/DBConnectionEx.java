package javaadvanced;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DBConnectionEx {

	public static void main(String[] args) {
		Connection conn = null;
		Statement stmt = null;
		// JDBC driver name and database URL		
		String DB_URL = "jdbc:mysql://localhost/EMP";

		   //  Database credentials
		 String USER = "kumar02";
		 String PASS = "pass1234";
		   try{
		      // Open a connection
		      System.out.println("Connecting  to a selected database...");
		      conn = DriverManager.getConnection(DB_URL, USER, PASS);
		      System.out.println("Connected database successfully...");
		      
		      System.out.println("Creating statement...");
		      stmt = conn.createStatement();

		      String sql = "SELECT id, first, last, age FROM Registration";
		      ResultSet rs = stmt.executeQuery(sql);		      
		      
		      // Extract data from result set
		      while(rs.next()){
		         //Retrieve data by column/field name
		         int id1  = rs.getInt("id");
		         int age1 = rs.getInt("age");
		         String first1 = rs.getString("first");
		         String last1 = rs.getString("last");

		         //Display values
		         System.out.print("ID: " + id1);
		         System.out.print(", Age: " + age1);
		         System.out.print(", First: " + first1);
		         System.out.println(", Last: " + last1);
		      }
		   
		      rs.close();
		   }
		     
		   catch(SQLException se){
			      //Handle errors for JDBC
			      se.printStackTrace();
			   }
		   catch(Exception e){
		      //Handle errors for Class.forName
		      e.printStackTrace();
		   }
		}//end main
	}


