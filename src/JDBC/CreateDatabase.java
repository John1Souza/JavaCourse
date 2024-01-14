package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CreateDatabase {
    public static void main(String[] args) throws SQLException {
        final String url = "jdbc:mysql://localhost?verifyServerCertificate=false&useSSL=true";
        final String user = "root";
        final String password = "123456";

        Connection connection = DriverManager.getConnection(url, user, password);

//        Connection connection = ManufacturesConnection.getConnection();

        Statement stmt = connection.createStatement();
        stmt.execute("CREATE DATABASE IF NOT EXISTS java_course");

        System.out.println("Database successfully created!");
        connection.close();
    }
}
