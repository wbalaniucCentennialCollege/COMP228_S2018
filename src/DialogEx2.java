import javax.swing.JOptionPane;

public class DialogEx2 {
    public static void main(String[] args) {
        // Prompt the user to enter name
        String name = JOptionPane.showInputDialog("Enter patient name:");

        // Create a custom message
        String message = String.format("Welcome, %s, to Java Programming!", name);

        System.out.println(message);

        JOptionPane.showMessageDialog(null, message);
    }
}
