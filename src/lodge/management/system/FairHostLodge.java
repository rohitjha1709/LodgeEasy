package lodge.management.system;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class FairHostLodge extends JFrame implements ActionListener {

    JLabel l1;
    JButton b1;

    public FairHostLodge() {                    
        // Get the screen size
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        int width = screenSize.width;
        int height = screenSize.height;

        setSize(width, height);
        setLayout(null);
        setLocation(0, 0);

        l1 = new JLabel("");
        b1 = new JButton("Next");

        b1.setBackground(Color.WHITE);
        b1.setForeground(Color.BLACK);
        b1.setBounds(width - 150, 20, 120, 30); // Position the button at top-right corner

        // Load and scale the image to fit the full screen size
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/third.jpg"));
        Image i3 = i1.getImage().getScaledInstance(width, height, Image.SCALE_DEFAULT);
        ImageIcon i2 = new ImageIcon(i3);
        l1 = new JLabel(i2);

        JLabel lid = new JLabel("LodgeEasy");
        lid.setBounds(510, 100, 1500, 120);
        lid.setFont(new Font("serif", Font.BOLD, 100));
        lid.setForeground(Color.red);
        l1.add(lid);

        l1.setBounds(0, 0, width, height);
        l1.add(b1);
        add(l1);

        b1.addActionListener(this);
        setVisible(true);

        // Blink effect for the label
        while (true) {
            lid.setVisible(false);
            try {
                Thread.sleep(500); // 1000 = 1 second
            } catch (Exception e) {}
            lid.setVisible(true);
            try {
                Thread.sleep(500);
            } catch (Exception e) {}
        }
    }

    public void actionPerformed(ActionEvent ae) {
        new Login().setVisible(true);
        this.setVisible(false);
    }

    public static void main(String[] args) {
        FairHostLodge window = new FairHostLodge();
        window.setVisible(true);			
    }
}
