//Java Database Connectivity

import java.sql.Connection;
import java.sql.DriverManager;

public class DBconnect {

	public static void main(String[] args) {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con = DriverManager.getConnection(
				"jdbc:oracle:thin:@localhost:1521:XE",
				"System",
				"Khan@2230"
			);
			System.out.println("Connected");
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
}
