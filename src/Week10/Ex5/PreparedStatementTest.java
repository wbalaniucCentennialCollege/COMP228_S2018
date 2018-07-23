package Week10.Ex5;

import java.sql.*;

public class PreparedStatementTest {
    private PreparedStatement pst;
    private Connection con;

    // JDBC driver name and database URL
    private static final String DRIVER = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
    private static final String DATABASE_URL = "jdbc:sqlserver://localhost:1433;database=Games;integratedSecurity=true";

    public PreparedStatementTest() {
        try {
            Class.forName(DRIVER);

            // Establish connection
            con = DriverManager.getConnection(DATABASE_URL);

            pst = con.prepareStatement("INSERT into Game (id, game_name, game_desc, game_price) VALUES(?,?,?,?)");
            pst.setInt(1, 4);
            pst.setString(2, "Battlefield 5");
            pst.setString(3, "A modern day FPS");
            pst.setDouble(4, 69.99);

            pst.executeUpdate();
        }
        catch (SQLException e) {
            e.printStackTrace();
        }
        catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        finally {
            System.out.println("Done!");
            try {
                pst.close();
                con.close();
            }
            catch (Exception e) {}
        }
    }

    public static void main(String[] args) {
        PreparedStatementTest pst = new PreparedStatementTest();
    }
}






