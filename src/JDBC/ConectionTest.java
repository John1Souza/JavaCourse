package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConectionTest {
    public static void main(String[] args)  throws SQLException {
        final String url = "jdbc:mysql://localhost";
        final String user = "root";
        final String password = "123456";

        Connection connection = DriverManager.getConnection(url, user, password);

        System.out.println("Connection made successfully!");
        connection.close();

    }
}
