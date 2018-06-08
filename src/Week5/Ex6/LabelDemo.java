package Week5.Ex6;

import java.awt.BorderLayout;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JFrame;

public class LabelDemo {
    public static void main(String[] args) {
        JLabel northLabel = new JLabel("North");

        // Create an icon from an image so we can put it on a JLabel
        ImageIcon labelIcon = new ImageIcon("GUItip.gif");

        // Create a JLabel with an image
        JLabel centerLabel = new JLabel(labelIcon);

        // Create a JLabel with an image and text
        JLabel southLabel = new JLabel(labelIcon);

        southLabel.setText("South");

        JFrame application = new JFrame();
        // Define what happens when we close the window
        application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Add components to the JFrame
        application.add(northLabel, BorderLayout.NORTH);
        application.add(centerLabel, BorderLayout.CENTER);
        application.add(southLabel, BorderLayout.SOUTH);

        // Define the size of the frame
        application.setSize(300, 300);
        application.setVisible(true);
    }
}
