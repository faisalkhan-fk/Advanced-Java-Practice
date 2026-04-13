// Data Updation Input from User throught prepareStatement and showing table after Updatation

import java.sql.*;
import java.util.Scanner;
import java.util.*;

public class preparest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
            // Load Oracle Driver
            Class.forName("oracle.jdbc.driver.OracleDriver");

            // Create Connection
            Connection con = DriverManager.getConnection(
                "jdbc:oracle:thin:@localhost:1521:XE",
                "System",
                "Faisal@123"
            );

            System.out.println("Connected");
              Scanner sc=new Scanner(System.in);
               String num=sc.nextLine();
               int num1=sc.nextInt();
  
               String query4="update student1 set name=? where id=?";
               PreparedStatement pst4=con.prepareStatement(query4);
               pst4.setString(1,num);
               pst4.setInt(2,num1);
               pst4.executeUpdate();
                System.out.println("Data Updated successfully");


              String query3="select * from student1";
              PreparedStatement pst3=con.prepareStatement(query3);
              ResultSet rs=pst3.executeQuery();
              
              while(rs.next()) {
            	  System.out.println(rs.getInt(1)+" "+rs.getString("name"));
              }

		 } catch (Exception e) {
	            e.printStackTrace();
	        }
	    }
	}
	
