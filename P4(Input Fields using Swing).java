import java.awt.*;
import javax.swing.*;
public class p4 {
    public static void main(String[] args) {
        // Containers
        JFrame f = new JFrame("Swing");
        f.setSize(500, 500);
        f.setLayout(new FlowLayout()); 
        //User inputs
        JTextField txt = new JTextField("Enter text", 20);
        JCheckBox cb = new JCheckBox("I agree");
        // Radio button creation
        JRadioButton rbtn1 = new JRadioButton("Apple"); 
        JRadioButton rbtn2 = new JRadioButton("Banana");
        //Grouping radio buttons
        ButtonGroup grp = new ButtonGroup();
        grp.add(rbtn1);
        grp.add(rbtn2);
        // Adding components to frame
        f.add(txt);
        f.add(cb);
        f.add(rbtn1);
        f.add(rbtn2);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Exit on Close
    }
}
