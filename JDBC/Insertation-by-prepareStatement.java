// Multiple data Insertation throught prepareStatement
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
                "Khan@2230"
            );
                  System.out.println("Connected");
                                     
            String query="Insert into student1 values(?,?)";
            PreparedStatement pst=con.prepareStatement(query);
            pst.setInt(1, 2);
            pst.setString(2,"Faisal");
            pst.executeUpdate();

            pst.setInt(1, 10);
            pst.setString(2,"Raj");
            pst.executeUpdate();
      
            System.out.println("Data Inserted successfully");
      } catch (Exception e) {
	            e.printStackTrace();
	        }
	    }
	}
