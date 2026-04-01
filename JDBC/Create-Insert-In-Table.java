//Create table and Insert data into the table in java

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

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

            // SQL Query
            String query = "Insert into student1 values('1','Faisal Khan')";

            // Execute Query
            st.executeUpdate(query);

            System.out.println("Data Inserted");

            // Close connection
            st.close();
            con.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
