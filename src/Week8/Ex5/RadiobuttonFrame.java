package Week8.Ex5;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class RadiobuttonFrame extends JFrame {
    private JTextField textField;
    private Font plainFont, boldFont, italicFont, boldItalicFont;
    private JRadioButton plainJRadioButton, boldJRadioButton, italicJRadioButton, boldItalicJRadioButton;
    private ButtonGroup radioGroup;

    public RadiobuttonFrame() {
        super("Radiobutton Test");
        setLayout(new FlowLayout());

        // Create textfield
        textField = new JTextField("Watch the font style change", 25);
        add(textField);

        // Create our buttons
        plainJRadioButton = new JRadioButton("Plain", true);
        boldJRadioButton = new JRadioButton("Bold", false);
        italicJRadioButton = new JRadioButton("Italic", false);
        boldItalicJRadioButton = new JRadioButton("Bold/Italic", false);
        add(plainJRadioButton);
        add(boldJRadioButton);
        add(italicJRadioButton);
        add(boldItalicJRadioButton);

        // Setup button group
        radioGroup = new ButtonGroup();
        radioGroup.add(plainJRadioButton);
        radioGroup.add(boldJRadioButton);
        radioGroup.add(italicJRadioButton);
        radioGroup.add(boldItalicJRadioButton);

        // Create fonts,
        plainFont = new Font(Font.SANS_SERIF, Font.PLAIN, 14);
        boldFont = new Font(Font.SANS_SERIF, Font.BOLD, 14);
        italicFont = new Font(Font.SANS_SERIF, Font.ITALIC, 14);
        boldItalicFont = new Font(Font.SANS_SERIF, Font.BOLD + Font.ITALIC, 14);
        textField.setFont(plainFont);

        // Register for event handling
        plainJRadioButton.addItemListener(new RadiobuttonHandler(plainFont));
        boldJRadioButton.addItemListener(new RadiobuttonHandler(boldFont));
        italicJRadioButton.addItemListener(new RadiobuttonHandler(italicFont));
        boldItalicJRadioButton.addItemListener(new RadiobuttonHandler(boldItalicFont));
    }

    private class RadiobuttonHandler implements ItemListener {

        private Font f;

        public RadiobuttonHandler(Font font) {
            f = font;
        }

        @Override
        public void itemStateChanged(ItemEvent e) {
            textField.setFont(f);
        }
    }
}
