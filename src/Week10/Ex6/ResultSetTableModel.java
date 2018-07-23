package Week10.Ex6;

import java.sql.*;
import javax.swing.table.AbstractTableModel;

public class ResultSetTableModel extends AbstractTableModel {

    private Connection con;
    private Statement stmt;
    private ResultSet resultSet;
    private ResultSetMetaData metaData;
    private int numberOfRows;

    private boolean connectedToDatabase = false;

    public ResultSetTableModel(String driver, String url, String query) throws SQLException, ClassNotFoundException {
        Class.forName(driver);

        con = DriverManager.getConnection(url);

        stmt = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);

        connectedToDatabase = true;

        // Run a query
        // setQuery(query);
    }


    @Override
    public int getRowCount() {
        return 0;
    }

    @Override
    public int getColumnCount() {
        return 0;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        return null;
    }
}
