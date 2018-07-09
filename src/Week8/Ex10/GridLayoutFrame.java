package Week8.Ex10;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class GridLayoutFrame extends JFrame implements ActionListener {
    private final JButton[] buttons;
    private static final String[] names = {"One", "Two", "Three", "Four", "Five", "Six"};
    private boolean toggle = true;
    private final Container container;
    private final GridLayout gridLayout1;
    private final GridLayout gridLayout2;

    public GridLayoutFrame() {
        super("GridLayout Demo");

        gridLayout1 = new GridLayout(2, 3, 5, 5);
        gridLayout2 = new GridLayout(3,2);

        container = getContentPane();

        setLayout(gridLayout1); // Default layout

        buttons = new JButton[names.length];

        for(int i = 0; i < names.length; i++) {
            buttons[i] = new JButton(names[i]);
            buttons[i].addActionListener(this);
            add(buttons[i]);
        }
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if(toggle) {
            container.setLayout(gridLayout2);
        } else {
            container.setLayout(gridLayout1);
        }

        toggle = !toggle;
        container.validate(); // Re-lay out the container. Used when we are setting a brand new layout obj
    }
}
