package com.jdbcconcept;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class jdbcconnection {

	public static void main(String[] args) {
		//Change these details based on your database
		String url="jdbc:mysql://localhost:3306/employeereport";
		String user="root";
		String password="rose";
		
		//sql query
         String query="INSERT INTO employeeinfo(empcode,empname,empage,esalary) VALUES(?,?,?,?)";
         //load the driver
         try {
        	 Class.forName("com.mysql.cj.jdbc.Driver");
        	 Connection con = DriverManager.getConnection(url, user, password);
        	 System.out.println("Connection Established Successfully");
        	 
        	 
        	 //prepared sql statement 
        	 PreparedStatement pstmt=con.prepareStatement(query);
        
             //row-1
//        	 pstmt.setInt(1,101);
//        	 pstmt.setString(2,"Jenny");
//        	 pstmt.setInt(3,25);
//        	 pstmt.setInt(4,10000);
             //row-2
//        	 pstmt.setInt(1,102);
//        	 pstmt.setString(2,"Jacky");
//        	 pstmt.setInt(3,30);
//        	 pstmt.setInt(4,20000);
        	 //row-3
//        	 pstmt.setInt(1,103);
//        	 pstmt.setString(2,"Joe");
//        	 pstmt.setInt(3,20);
//        	 pstmt.setInt(4,40000);
        	 //row-4
//        	 pstmt.setInt(1,104);
//        	 pstmt.setString(2,"John");
//        	 pstmt.setInt(3,40);
//        	 pstmt.setInt(4,80000);
        	 //row-5
        	 pstmt.setInt(1,105);
        	 pstmt.setString(2,"Shameer");
        	 pstmt.setInt(3,25);
        	 pstmt.setInt(4,90000);
        	 int rowinsertion=pstmt.executeUpdate();
        	 
        	 if(rowinsertion>0) {
        		 System.out.println("Data Successfully inserted into DB");
        	 }
        	 
        	 pstmt.close();
        	 con.close();
        	 
         }catch (Exception e) {
        	 e.printStackTrace();
        	 
         }
	
	}

}
