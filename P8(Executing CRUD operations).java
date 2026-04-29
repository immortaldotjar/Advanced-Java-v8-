package arjunkrprajapati;
import javax.swing.*;
import java.awt.event.*;
import java.sql.*;
public class p8 extends JFrame {
    // Components and JDBC Objects
    JLabel l1, l2, l3;
    JTextField t1, t2, t3;
    JButton b1, b2, b3;
    Connection conn;
    PreparedStatement ps;
    ResultSet rs;
    public p8() {
        l1 = new JLabel("ID:");
        l2 = new JLabel("Name:");
        l3 = new JLabel("Email:");
        t1 = new JTextField();
        t2 = new JTextField();
        t3 = new JTextField();
        b1 = new JButton("Submit");
        b2 = new JButton("View Detail");
        b3 = new JButton("Update");
        l1.setBounds(30, 30, 80, 25);
        t1.setBounds(120, 30, 200, 25);
        l2.setBounds(30, 70, 80, 25);
        t2.setBounds(120, 70, 200, 25);
        l3.setBounds(30, 110, 80, 25);
        t3.setBounds(120, 110, 200, 25);
        b1.setBounds(30, 160, 90, 30);
        b2.setBounds(130, 160, 110, 30);
        b3.setBounds(250, 160, 90, 30);
        add(l1);
        add(t1);
        add(l2);
        add(t2);
        add(l3);
        add(t3);
        add(b1);
        add(b2);
        add(b3);
        b1.addActionListener(e -> insertData());
        b2.addActionListener(e -> fetchData());
        b3.addActionListener(e -> updateData());
        setSize(400, 260);
        setLayout(null);
        setTitle("Employee Application");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
        connectDB();
    }

    // Establishing MySQL Connection
    void connectDB() {
        try {
            Class.forName("com.mysql.jdbc.Driver"); 
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/empdb", "root", "");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "DB Error: " + e.getMessage());
        }
    }
    // CRUD operations
    void insertData() {
        try {
            String query = "INSERT INTO employee VALUES (?, ?, ?)";
            ps = conn.prepareStatement(query);
            ps.setInt(1, Integer.parseInt(t1.getText()));
            ps.setString(2, t2.getText());
            ps.setString(3, t3.getText());
            ps.executeUpdate();
            JOptionPane.showMessageDialog(this, "Data Inserted Successfully!");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Insert Error: " + e.getMessage());
        }
    }
    void fetchData() {
        try {
            String query = "SELECT * FROM employee WHERE id = ?";
            ps = conn.prepareStatement(query);
            ps.setInt(1, Integer.parseInt(t1.getText()));
            rs = ps.executeQuery();
            if (rs.next()) {
                t2.setText(rs.getString("name"));
                t3.setText(rs.getString("email"));
            } else {
                JOptionPane.showMessageDialog(this, "No Record Found!");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Fetch Error: " + e.getMessage());
        }
    }
    void updateData() {
        try {
            String query = "UPDATE employee SET name = ?, email = ? WHERE id = ?";
            ps = conn.prepareStatement(query);
            ps.setString(1, t2.getText());
            ps.setString(2, t3.getText());
            ps.setInt(3, Integer.parseInt(t1.getText()));
            ps.executeUpdate();
            JOptionPane.showMessageDialog(this, "Data Updated Successfully!");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Update Error: " + e.getMessage());
        }
    }
    public static void main(String[] args) {
        new p8();
    }
}
