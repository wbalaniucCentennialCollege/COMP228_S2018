package Week8.Ex9;

import java.awt.BorderLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;
import javax.swing.JButton;

public class BorderLayoutFrame extends JFrame implements ActionListener {
    private final JButton[] buttons;
    private static final String[] names = {"Hide North", "Hide South", "Hide East", "Hide West", "Hide Center"};
    private final BorderLayout layout;

    // Constructor
    public BorderLayoutFrame() {
        super("Borderlayout Demo");

        layout = new BorderLayout(5, 5);
        setLayout(layout);
        buttons = new JButton[names.length];

        for(int count = 0; count < names.length; count++) {
            buttons[count] = new JButton(names[count]); // Create a button and name is properly based on the names array.

            buttons[count].addActionListener(this);
        }

        add(buttons[0], BorderLayout.NORTH);
        add(buttons[1], BorderLayout.SOUTH);
        add(buttons[2], BorderLayout.EAST);
        add(buttons[3], BorderLayout.WEST);
        add(buttons[4], BorderLayout.CENTER);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        for(JButton button : buttons) {
            if(e.getSource() == button) {
                button.setVisible(false);
            }
            else {
                button.setVisible(true);
            }
        }

        layout.layoutContainer(getContentPane()); // Redraw the components in the container (aka the window)
    }
}
