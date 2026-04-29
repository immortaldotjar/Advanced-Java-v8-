package arjunkrprajapati;
import java.awt.*;
import java.awt.event.*;
public class p2 {
    public static void main(String[] args) {
        // Initialize Container
        Frame f = new Frame("Buttons"); //Frame
        Label label = new Label("");
        // Buttons
        Button btn1 = new Button("Button 1");
        Button btn2 = new Button("Button 2");
        Button btn3 = new Button("Button 3");
        Button btn4 = new Button("Button 4");
        // Action Listeners
        btn1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                label.setText("Clicked button 1"); // Callback 1
            }
        });
        btn2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                label.setText("Clicked button 2"); // Callback 2
            }
        });
        btn3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                label.setText("Clicked button 3"); // Callback 3
            }
        });
        btn4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                label.setText("Clicked button 4"); // Callback 4
            }
        });
        // Layout
        btn1.setBounds(100, 100, 100,50);
        btn2.setBounds(210, 100, 100,50);
        btn3.setBounds(320, 100, 100, 50);
        btn4.setBounds(430, 100, 100, 50);
        label.setBounds(800, 600, 100, 100);
        // Adding components to Frame
        f.add(btn1);
        f.add(btn2);
        f.add(btn3);
        f.add(btn4);
        f.add(label);
        f.setSize(700, 300);
        f.setVisible(true);
        f.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                f.dispose(); // Cleanup
            }
        });
    }
}
