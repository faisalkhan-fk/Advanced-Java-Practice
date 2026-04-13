//Menu driven program 
import java.sql.*;
import java.util.Scanner;

public class scrollrs1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

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

            int choice;

            do {
                System.out.println("\n===== MENU =====");
                System.out.println("1. Insert");
                System.out.println("2. Update");
                System.out.println("3. Delete");
                System.out.println("4. Retrieve");
                System.out.println("5. Exit");
                System.out.print("Enter your choice: ");

                choice = sc.nextInt();

                switch (choice) {

                    case 1:
                        System.out.print("Enter ID: ");
                        int id = sc.nextInt();
                        sc.nextLine();

                        System.out.print("Enter Name: ");
                        String name = sc.nextLine();

                        String insertQuery = "INSERT INTO student1 VALUES (?, ?)";
                        PreparedStatement pst1 = con.prepareStatement(insertQuery);
                        pst1.setInt(1, id);
                        pst1.setString(2, name);

                        pst1.executeUpdate();
                        System.out.println("Record Inserted!");
                        break;

                    case 2:
                        System.out.print("Enter ID to update: ");
                        int uid = sc.nextInt();
                        sc.nextLine();

                        System.out.print("Enter new Name: ");
                        String newName = sc.nextLine();

                        String updateQuery = "UPDATE student1 SET name=? WHERE id=?";
                        PreparedStatement pst2 = con.prepareStatement(updateQuery);
                        pst2.setString(1, newName);
                        pst2.setInt(2, uid);

                        int rows = pst2.executeUpdate();
                        if (rows > 0)
                            System.out.println("Record Updated!");
                        else
                            System.out.println("Record Not Found!");
                        break;

                    case 3:
                        System.out.print("Enter ID to delete: ");
                        int did = sc.nextInt();

                        String deleteQuery = "DELETE FROM student1 WHERE id=?";
                        PreparedStatement pst3 = con.prepareStatement(deleteQuery);
                        pst3.setInt(1, did);

                        int drows = pst3.executeUpdate();
                        if (drows > 0)
                            System.out.println("Record Deleted!");
                        else
                            System.out.println("Record Not Found!");
                        break;

                    case 4:
                        String selectQuery = "SELECT * FROM student1";
                        PreparedStatement pst4 = con.prepareStatement(selectQuery);

                        ResultSet rs = pst4.executeQuery();

                        System.out.println("\n--- Student Records ---");
                        while (rs.next()) {
                            System.out.println("ID: " + rs.getInt(1)
                                    + " Name: " + rs.getString(2));
                        }
                        break;

                    case 5:
                        System.out.println("Exiting...");
                        break;

                    default:
                        System.out.println("Invalid Choice!");
                }

            } while (choice != 5);

            con.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
