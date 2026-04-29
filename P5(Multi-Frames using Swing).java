import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class p4 {
    public static void main(String[] args) {
        // Frame 1 
        JFrame f1 = new JFrame("Frame 1");
        JButton nextBtn = new JButton("Go to Frame 2");
        BorderLayout bl = new BorderLayout(); // Layout Manager
        f1.add(nextBtn,bl.NORTH);
        // Navigation Logic to Frame 2
        nextBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                f1.setVisible(false); // hide Frame 1
                // Frame 2 
                JFrame f2 = new JFrame("Frame 2");
                JButton backBtn = new JButton("Back to Frame 1");
                f2.setSize(500, 500);
                f2.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                f2.add(backBtn,bl.CENTER);
                f2.setVisible(true);
                // Navigation Logic to Frame 1
                backBtn.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        f2.dispose();
                        f1.setVisible(true); //show Frame 1
                    }
                });
            }
        });
        f1.setSize(500, 500);
        f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Termination
        f1.add(nextBtn);
        f1.setVisible(true);
    }
}
