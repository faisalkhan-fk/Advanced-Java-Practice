// Delete data from the table

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class DBconnect {

    public static void main(String[] args) {
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

            // Create Statement
            Statement st = con.createStatement();
               
            String query="delete from student1 where id=3";
            st.execute(query);
            System.out.println("Data Deleted");
          st.close();
            con.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
