package Week8.Ex2;

import java.awt.FlowLayout;
import java.awt.event.ActionListener; // Listening for a specific event (INTERFACES)
import java.awt.event.ActionEvent; // Part of listening
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JOptionPane;

public class TextFieldFrame extends JFrame {
    private final JTextField textField1;
    private final JTextField textField2;
    private final JTextField textField3;
    private final JPasswordField passwordField;

    public TextFieldFrame() {
        super("Testing JTextField and JPasswordField");
        setLayout(new FlowLayout());

        // Construct a textfield with 10 columns
        textField1 = new JTextField(10);
        add(textField1);

        textField2 = new JTextField("Enter text here");
        add(textField2);

        textField3 = new JTextField("Uneditable text field", 21);
        textField3.setEditable(false);
        add(textField3);

        passwordField = new JPasswordField("Hidden text");
        add(passwordField);

        // Register event handlers
        TextFieldHandler handler = new TextFieldHandler();
        textField1.addActionListener(handler);
        textField2.addActionListener(handler);
        textField3.addActionListener(handler);
        passwordField.addActionListener(handler);
    }

    // Inner class for event handling
    private class TextFieldHandler implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            String string = "";

            if(e.getSource() == textField1) {
                string = String.format("textField1: %s", e.getActionCommand());
            }
            else if(e.getSource() == textField2) {
                string = String.format("textField2: %s", e.getActionCommand());
            }
            else if(e.getSource() == textField3) {
                string = String.format("textField3: %s", e.getActionCommand());
            }
            else if(e.getSource() == passwordField) {
                string = String.format("passwordField: %s", e.getActionCommand());
            }

            JOptionPane.showMessageDialog(null, string);
        }
    }
}
