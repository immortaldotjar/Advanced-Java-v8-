import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class p7 {
    public static void main(String[] args) {
        // Components
        JFrame f = new JFrame("Image Viewer");
        JButton btn = new JButton("Show Image");
        JButton reset = new JButton("Reset Image");
        JLabel label = new JLabel();
        f.setSize(750, 750);
        f.setLayout(new BorderLayout());
        // Adding component to frmae
        f.add(reset,BorderLayout.SOUTH);
        f.add(btn,BorderLayout.NORTH);
        f.add(label,BorderLayout.CENTER);
        // Image Reneder Event Handler
        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Resource Path
                ImageIcon img = new ImageIcon("img.jpg");
                label.setIcon(img);
            }
        });
        // Reset Action Handler`
        reset.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                label.setIcon(null);
            }
        });
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }
}
