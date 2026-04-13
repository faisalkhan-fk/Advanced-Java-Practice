//Update in table JDBC

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
                "Faisal@123"
            );

            System.out.println("Connected");

            // Create Statement
            Statement st = con.createStatement();
           String query="Update student1 set name='Vaibhav' where id=2";
            st.execute(query);
            System.out.println("Data Updated");
           st.close();
            con.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
