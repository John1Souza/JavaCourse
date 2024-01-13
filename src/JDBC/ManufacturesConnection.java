package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ManufacturesConnection {
    public static Connection getConnection(){
        try {
            final String url = "jdbc:mysql://localhost?verifyServerCertificate=false&useSSL=true";
            final String user = "root";
            final String password = "123456";

            return DriverManager.getConnection(url, user, password);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }
}
