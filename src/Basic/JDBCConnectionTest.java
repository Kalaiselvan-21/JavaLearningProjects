package Basic;

import java.sql.*;

public class JDBCConnectionTest {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/selenium_users"; // Your database name
        String user = "root"; // Your username
        String password = ""; // Your password (empty if there is none)

        Connection connection = null;

        try {
            // Load the MySQL JDBC driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Establishing the connection
            connection = DriverManager.getConnection(url, user, password);
            if (connection != null) {
                System.out.println("Connection established successfully!");
                Statement statement = connection.createStatement();
                ResultSet resultSet = statement.executeQuery("Select * from superheroes_table");
                while(resultSet.next()){
                    System.out.println(resultSet.getString(1));
                }
            }
        } catch (SQLException e) {
            System.out.println("Connection failed!");
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            System.out.println("MySQL JDBC Driver not found!");
            e.printStackTrace();
        } finally {
            // Close the connection if it was established
            try {
                if (connection != null) {
                    connection.close();
                    System.out.println("Connection closed.");
                }
            } catch (SQLException e) {
                System.out.println("Failed to close connection.");
                e.printStackTrace();
            }
        }
    }
}
