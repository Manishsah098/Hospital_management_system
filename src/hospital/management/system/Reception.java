package hospital.management.system;

import javax.swing.*;
import java.awt.*;
import java.net.URL;

public class Reception extends JFrame {
    Reception(){

        JPanel panel = new JPanel();
        panel.setLayout(null);
        panel.setBounds(5, 160, 1525, 670);
        panel.setBackground(new Color(109, 164, 170));
        add(panel);

        JPanel panel1 = new JPanel();
        panel1.setLayout(null);
        panel1.setBounds(5, 5, 1525, 150);
        panel1.setBackground(new Color(109, 164, 170));
        add(panel1);

        // Load image safely
        URL imgUrl = getClass().getClassLoader().getResource("icon/dr.png");
        if (imgUrl == null) {
            System.out.println("ERROR: Could not find icon/dr.png on classpath!");
        } else {
            ImageIcon i1 = new ImageIcon(imgUrl);
            Image image = i1.getImage().getScaledInstance(250, 250, Image.SCALE_SMOOTH);
            ImageIcon i2 = new ImageIcon(image);
            JLabel jLabel = new JLabel(i2);
            jLabel.setBounds(1300, 0, 250, 250);
            panel1.add(jLabel);
        }

        setSize(1950, 1090);
        getContentPane().setBackground(Color.white);
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
        new Reception();
    }
}