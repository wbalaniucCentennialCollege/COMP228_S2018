package Week8.Ex6;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class ComboboxFrame extends JFrame {
    private final JComboBox<String> imagesJCombobox;
    private final JLabel label;

    private static final String[] names = {"bug1.gif", "bug2.gif", "travelbug.gif", "buganim.gif"};
    private final Icon[] icons = new Icon[4];
    /*
    private final Icon[] icons = {
            new ImageIcon(getClass().getResource(names[0])),
            new ImageIcon(getClass().getResource(names[1])),
            new ImageIcon(getClass().getResource(names[2])),
            new ImageIcon(getClass().getResource(names[3]))
    };
    */

    public ComboboxFrame() {
        super("Testing JCombobox");
        setLayout(new FlowLayout());

        for(int i = 0; i < names.length; i++) {
            icons[i] = new ImageIcon(getClass().getResource(names[i]));
        }

        imagesJCombobox = new JComboBox<String>(names);
        // imagesJCombobox.setMaximumRowCount(3);

        // Anonymous inner class
        imagesJCombobox.addItemListener(
                new ItemListener() // "Start" of our anonymous inner class//
                {
                    @Override
                    public void itemStateChanged(ItemEvent e) {
                        if(e.getStateChange() == ItemEvent.SELECTED) {
                            label.setIcon(icons[imagesJCombobox.getSelectedIndex()]);
                        }
                    }
                } // End of anonymous inner class
            ); // End call to addItemListener

        add(imagesJCombobox);
        label = new JLabel(icons[0]);
        add(label);
    }
}
