package hospital.management.system;

import javax.swing.*;
import java.awt.*;

public class Reception extends JFrame {
    Reception(){

        JPanel panel =new JPanel();
        panel.setLayout(null);
        panel.setBounds(5,160,1525,670);
        panel.setBackground(new Color(109,164,170));
        add(panel);

        JPanel panel1 =new JPanel();
        panel1.setLayout(null);
        panel1.setBounds(5,5,1525,150);
        panel1.setBackground(new Color(109,164,170));
        add(panel1);


        setSize(1950,1090);
        getContentPane().setBackground(Color.white);
        setLayout(null);
        setVisible(true);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/dr.png"));        Image image = i1.getImage().getScaledInstance(250,250,Image.SCALE_DEFAULT);
        ImageIcon i2 = new ImageIcon(image);
        JLabel jLabel = new JLabel(i2);
        jLabel.setBounds(1300,0,250,250);
        panel1.add(label);
    }
    public static void main(String[] args){
        new Reception();

    }
}
