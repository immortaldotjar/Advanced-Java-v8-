import java.sql.*;
public class p6 {
    public static void main(String[] args) {
        // variables
        String url = "jdbc:mysql://localhost:3306/studentlistdb";
        String user = "root";
        String pass = "";
        try {
            // Driver connection
            Class.forName("com.mysql.jdbc.Driver");
            // Establishing Session
            Connection conn = DriverManager.getConnection(url, user, pass);
            System.out.println("MySQL Connected!");

            // Query Execution
            String query = "SELECT * FROM stud";
            Statement s = conn.createStatement();
            ResultSet rs = s.executeQuery(query);
            // Data Retreiving/Fetching Data
            while (rs.next()) {
                int id = rs.getInt("ID");
                String name = rs.getString("Student_Name");
                String email = rs.getString("Email");
                System.out.println(id + " | " + name + " | " + email);
            }
            rs.close();
            s.close();
            conn.close();
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
