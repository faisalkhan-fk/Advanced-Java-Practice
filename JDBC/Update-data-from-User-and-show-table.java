//Updation in the table and after update show table

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
           Scanner sc=new Scanner(System.in);
            String num=sc.nextLine();
            
            String query4="update student1 set name='"+num+"' where id=2";
            st.executeUpdate(query4);
            
            String query="select * from student1";
            ResultSet rs=st.executeQuery(query);
            while(rs.next()) {
            	int id=rs.getInt("id");
            	String name=rs.getString(2);
            	System.out.println(id+" "+name);
            }

            // Close connection
            st.close();
            con.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
