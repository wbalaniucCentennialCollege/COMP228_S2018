package Week10.Ex3;

import java.text.DecimalFormat;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class DivideByZeroTest extends JFrame implements ActionListener {
    private JTextField input1, input2, output;
    private int number1, number2;
    private double result;

    public DivideByZeroTest() {
        super("Demo of Exceptions");

        Container c = getContentPane();
        c.setLayout(new GridLayout(3,2));

        // Added numerator label
        c.add(new JLabel("Enter Numerator ", SwingConstants.RIGHT));

        // Numerator textfield
        input1 = new JTextField(10);
        c.add(input1);

        // Denominator label
        c.add(new JLabel("Enter Denominator ", SwingConstants.RIGHT));

        // Denominator textfield with event handling
        input2 = new JTextField(10);
        c.add(input2);
        input2.addActionListener(this);

        // Result label
        c.add(new JLabel("RESULT ", SwingConstants.RIGHT));

        // Result textfield
        output = new JTextField();
        c.add(output);

        // Set the size of our JFrame
        setSize(425, 100);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        DecimalFormat precision3 = new DecimalFormat("0.000");

        output.setText("");

        try {
            // Get input1 string value and parse to int
            number1 = Integer.parseInt(input1.getText());
            number2 = Integer.parseInt(input2.getText());

            result = quotient(number1, number2);
            output.setText(precision3.format(result));
        }
        catch(NumberFormatException nfe) {
            JOptionPane.showMessageDialog(this, "You must enter two integers", "Invalid Number Format", JOptionPane.ERROR_MESSAGE);
        }
        catch(DivideByZeroException dbze) {
            JOptionPane.showMessageDialog(this, dbze.toString(), "Attempted to Divide By Zero", JOptionPane.ERROR_MESSAGE);
        }
    }

    public double quotient(int numerator, int denominator) throws DivideByZeroException {
        if(denominator == 0) {
            throw new DivideByZeroException();
        }

        return (double) numerator / denominator;
    }

    public static void main(String[] args) {
        DivideByZeroTest app = new DivideByZeroTest();

        app.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosed(WindowEvent e) {
                e.getWindow().dispose();
                System.exit(0);
            }
        });
    }
}
