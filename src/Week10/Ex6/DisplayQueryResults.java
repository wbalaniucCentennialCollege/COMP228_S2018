package Week10.Ex6;

// IMPORTS!!!
import java.awt.BorderLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.sql.SQLException;
import java.util.regex.PatternSyntaxException;
import javax.swing.*;
import javax.swing.table.*;

public class DisplayQueryResults extends JFrame {
    public static final String DRIVER = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
    public static final String DATABASE_URL = "jdbc:sqlserver://localhost:1433;database=Games;integratedSecurity=true";

    public static final String DEFAULT_QUERY = "SELECT * FROM Game";

    public ResultSetTableModel tableModel;
    public JTextArea queryArea;

    // Constructor
    public DisplayQueryResults() {
        super("Displaying Query Results");

        // Initialize ResultSetTableModel and display database table
        try {
            tableModel = new ResultSetTableModel(DRIVER, DATABASE_URL, DEFAULT_QUERY);

            // --- Setup our GUI  --- //
            // Setup text area
            queryArea = new JTextArea(DEFAULT_QUERY, 3, 100); // Set default text to DEFAULT_QUERY
            queryArea.setWrapStyleWord(true); // Wrap text
            queryArea.setLineWrap(true);

            // Setup scrollpane
            JScrollPane scrollPane = new JScrollPane(queryArea,
                    ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED,       // Scrollbar appears only when needed
                    ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED);

            // Setup a "submit query button"
            JButton submitButton = new JButton("Submit Query");

            // Create a simple box to manage placement of queryarea and submit button in GUI
            Box boxNorth = Box.createHorizontalBox(); // Factory design model.
            boxNorth.add(scrollPane);
            boxNorth.add(submitButton);

            // Creating a JTabel to display database information
            JTable resultTable = new JTable(tableModel);

            // Create filter components
            JLabel filterLabel = new JLabel("Filter: ");
            JTextField filterText = new JTextField();
            JButton filterButton = new JButton("Apply Filter");

            // Create a simple box to manage placement of resultTable and filter components
            Box boxSouth = boxNorth.createHorizontalBox();
            boxSouth.add(filterLabel);
            boxSouth.add(filterText);
            boxSouth.add(filterButton);

            // Place boxes into window (content pane)
            add(boxNorth, BorderLayout.NORTH);
            add(new JScrollPane(resultTable), BorderLayout.CENTER);
            add(boxSouth, BorderLayout.SOUTH);

            // Listen for events...
            submitButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    try {
                        tableModel.setQuery(queryArea.getText());
                    }
                    catch(SQLException ex) {
                        JOptionPane.showMessageDialog(null, ex.getMessage(),
                                "Database Error", JOptionPane.ERROR_MESSAGE);

                        // Try to execute the default query again
                        try {
                            tableModel.setQuery(DEFAULT_QUERY);
                            queryArea.setText(DEFAULT_QUERY);
                        }
                        catch (SQLException exc) {
                            JOptionPane.showMessageDialog(null, exc.getMessage(),
                                    "Database Error", JOptionPane.ERROR_MESSAGE);

                            // Close all connections to database
                            tableModel.disconnectFromDatabase();

                            // Terminate our application
                            System.exit(1); // 0 = Normal termination; Non-zero = Abnormal termination
                        }
                    }
                }
            });

            // Create a TableRowSorter as a helper for sorting the JTable
            TableRowSorter<TableModel> sorter = new TableRowSorter<TableModel>(tableModel);
            resultTable.setRowSorter(sorter);

            // Listen for filter button event
            filterButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    String text = filterText.getText();

                    // If no text in filterText, apply no filter
                    if(text.length() == 0) {
                        sorter.setRowFilter(null);
                    }
                    else { // We do have text in filterText
                        try {
                            sorter.setRowFilter(RowFilter.regexFilter(text));
                        }
                        catch (PatternSyntaxException pse) {
                            JOptionPane.showMessageDialog(null, "Bad REGEX Pattern",
                                    "Bad Regex Pattern", JOptionPane.ERROR_MESSAGE);
                        }
                    }
                }
            });
            // Set window size and display = true
            setSize(500, 250);
            setVisible(true);
        }
        catch(ClassNotFoundException e) {
            JOptionPane.showMessageDialog(null, "Database Driver not Found",
                    "Driver Not Found", JOptionPane.ERROR_MESSAGE);

            System.exit(1);
        }
        catch(SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage(),
                    "Database error", JOptionPane.ERROR_MESSAGE);

            tableModel.disconnectFromDatabase();

            System.exit(1);
        }

        // Listen to window event
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);

        // Clikced the x button to close the application
        addWindowListener(
            new WindowAdapter() {
                @Override
                public void windowClosed(WindowEvent e) {
                    tableModel.disconnectFromDatabase(); // Safely close all connections
                    System.exit(0);
                }
            }
        );
    }

    public static void main(String[] args) {
        new DisplayQueryResults();
    }
}













