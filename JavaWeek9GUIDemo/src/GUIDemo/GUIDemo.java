package GUIDemo;

import javax.swing.*;
import java.awt.*;

public class GUIDemo {

    public static void main (String[] args) {

        JFrame frame = new JFrame();
        JPanel panel = new JPanel();


        frame.setResizable(true);
        frame.setBounds(40, 50, 640, 480);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //W-out this, closing with X does not end the code!


        frame.setBackground(new Color(152, 169, 0));
        panel.setBackground(new Color(0, 189, 183, 255));
        panel.setBounds(200, 300, 320, 240);
        panel.setLayout(null);
        frame.add(panel);

        JLabel firstLabel = new JLabel();
        JTextField enterText = new JTextField();
        firstLabel.setFont(new Font("Arial", Font.BOLD, 15));
        firstLabel.setText("Hello World!");
        firstLabel.setBounds(450, 300, 100, 60);
        firstLabel.setBackground(new Color(125, 125, 125));
        firstLabel.setForeground(new Color(255, 0, 0));

        enterText.setBounds(470, 300, 160, 25);
        panel.add(firstLabel);
        panel.add(enterText);

        frame.setVisible(true);



    }
}
