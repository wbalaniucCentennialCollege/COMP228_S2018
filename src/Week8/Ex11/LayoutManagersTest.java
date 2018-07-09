package Week8.Ex11;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class LayoutManagersTest extends JFrame {
    // All 16 components!~!~~!~
    private JPanel pNorth, pCenter, pWest, pEast, pSouth;
    private JLabel lblName, lblPosition;
    private JButton left, center, right, bEast, bWest, bSouth1, bSouth2;
    private JTextField txtName, txtPosition;
    private JTextArea txtSouth;

    // Constructor
    public LayoutManagersTest() {
        pNorth = new JPanel();
        pCenter = new JPanel();
        pWest = new JPanel();
        pEast = new JPanel();
        pSouth = new JPanel();

        // Create the buttons
        left = new JButton("Left");
        center = new JButton("Center");
        right = new JButton("Right");

        bWest = new JButton("West");
        bEast = new JButton("East");

        bSouth1 = new JButton("Java Programming");
        bSouth2 = new JButton("COMP 228");

        // Register these buttons for events
        ButtonHandler handler = new ButtonHandler();
        left.addActionListener(handler);
        center.addActionListener(handler);
        right.addActionListener(handler);

        // Adding components to panels
        pNorth.add(left);
        pNorth.add(center);
        pNorth.add(right);
        pNorth.setBackground(Color.red);

        pCenter.setLayout(new GridLayout(2,2,5,5));
        lblName = new JLabel("Name: ");
        lblPosition = new JLabel("Position: ");
        txtName = new JTextField(20);
        txtPosition = new JTextField(20);
        pCenter.add(lblName);
        pCenter.add(txtName);
        pCenter.add(lblPosition);
        pCenter.add(txtPosition);

        pEast.add(bEast);
        pEast.setBackground(Color.green);

        pWest.add(bWest);
        pWest.setBackground(Color.pink);

        //pSouth.add(bSouth1);
       // pSouth.add(bSouth2);
        txtSouth = new JTextArea();
        pSouth.add(txtSouth);
        pSouth.setBackground(Color.orange);

        // Add our panels to the window
        // add(pNorth, BorderLayout.NORTH);
        add(pCenter, BorderLayout.CENTER);
        add(pEast, BorderLayout.EAST);
        // add(pWest, BorderLayout.WEST);
        add(pSouth, BorderLayout.SOUTH);
        pack();
    }

    // Inner class for handling events
    private class ButtonHandler implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            if(e.getSource() == left) {
                pNorth.setLayout(new FlowLayout(FlowLayout.LEFT));
            }
            else if(e.getSource() == center) {
                pNorth.setLayout(new FlowLayout(FlowLayout.CENTER));
            }
            else if(e.getSource() == right) {
                pNorth.setLayout(new FlowLayout(FlowLayout.RIGHT));
            }

            pNorth.validate();
        }
    }

    // main method
    public static void main(String[] args) {
        LayoutManagersTest lmTest = new LayoutManagersTest();
        lmTest.setTitle("Testing layout managers");
        lmTest.setSize(500, 300);
        lmTest.setVisible(true);
    }
}
