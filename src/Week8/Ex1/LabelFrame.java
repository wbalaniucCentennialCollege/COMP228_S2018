package Week8.Ex1;

import java.awt.FlowLayout;         // Specifies how componnents are arranged
import javax.swing.JFrame;          // Provides basic window features
import javax.swing.JLabel;          // Display text and images
import javax.swing.SwingConstants;  // Common constant values used with SWING
import javax.swing.Icon;            // Interface used to manipulate images
import javax.swing.ImageIcon;       // Loads images

public class LabelFrame extends JFrame {

    // Variables
    private final JLabel label1;
    private final JLabel label2;
    private final JLabel label3;

    public LabelFrame() {
        super("JLabel Demo"); // Calls the JFrame constructor and sets the title of the window
        setLayout(new FlowLayout());

        // Create label1 and define it's features
        label1 = new JLabel("Label with text");
        label1.setToolTipText("Label1 tooltip text");
        add(label1);

        // Create label2 with a string, an image and alignment
        Icon bug = new ImageIcon(getClass().getResource("GUItip.gif"));
        label2 = new JLabel("Label with text and icon", bug, SwingConstants.RIGHT);
        label2.setToolTipText("This is label2");
        add(label2);

        // Create label3
        label3 = new JLabel();
        label3.setText("Label with icon and text AT THE BOTTOM");
        label3.setIcon(bug);
        label3.setHorizontalTextPosition(SwingConstants.CENTER);
        label3.setVerticalTextPosition(SwingConstants.BOTTOM);
        label3.setToolTipText("This is label3");
        add(label3);
    }
}












