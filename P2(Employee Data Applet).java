import java.applet.Applet;
import java.awt.Font;
import java.awt.Graphics;
//xml code
/*
<applet code="EmpApplet.class" width="500" height="230">
    <param name="empName" value="John Doe">
    <param name="designation" value="Software Engineer">
    <param name="salary" value="70000">
</applet>
*/
public class EmpApplet extends Applet {
    String name, desig;
    double sal, tax;
    public void init() {
        name = getParameter("empName");
        desig = getParameter("designation");
        String salStr = getParameter("salary");
        //calculating tax
        if (salStr != null) {
            sal = Double.parseDouble(salStr);
            tax = sal * 0.05; // Assuming 5% tax
        }
    }
    //
    public void paint(Graphics g) {
        g.setFont(new Font("Arial",Font.BOLD,30));
        g.drawString("Employee Name: " + name, 30, 50);
        g.drawString("Designation: " + desig, 30, 100);
        g.drawString("Salary: $" + sal, 30, 150);
        g.drawString("Tax (5%): $" + tax, 30, 200);
    }
}
