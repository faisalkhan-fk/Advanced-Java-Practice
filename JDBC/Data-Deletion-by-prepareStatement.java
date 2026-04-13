// Data Deletion throught prepareStatement

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
      String query="delete from student1 where id=?";
              PreparedStatement pst=con.prepareStatement(query);
              pst.setInt(1,2);
              pst.executeUpdate();
              System.out.println("Data Deleted successfully");
       } catch (Exception e) {
	            e.printStackTrace();
	        }
	    }
	}
	

