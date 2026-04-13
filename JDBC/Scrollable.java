//Scroll the curcur backword and forward using TYPE_SCROLL_INSENSITIVE

import java.sql.*;
import java.util.Scanner;
import java.util.*;

public class scrollrs {

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
      Statement st=con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);
      ResultSet rs=st.executeQuery("Select * from student1");
      
      while(rs.next()) {
    	  System.out.println(rs.getInt(1)+" "+rs.getString(2));
      }
      System.out.println("------backward-----");
      rs.afterLast();
      while(rs.previous()) {
    	  System.out.println(rs.getInt(1)+" "+rs.getString(2));
		}
      //At specific position
      rs.absolute(5);
      System.out.println("name at 5th row "+rs.getString("name"));
	}
		
      catch (Exception e) {
          e.printStackTrace();
      }
  }
}
