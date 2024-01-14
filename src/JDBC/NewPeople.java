package JDBC;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class NewPeople {
    public static void main(String[] args) throws SQLException {
        Scanner input = new Scanner(System.in);

        System.out.println("Type the name: ");
        String name = input.nextLine();

        Connection connection = ManufacturesConnection.getConnection();

        String sql = "INSERT INTO people (name) VALUES (?)";
        PreparedStatement stmt = connection.prepareStatement(sql);
        stmt.setString(1, name);
        //stmt.setInt(2, 100);
        stmt.execute();

        System.out.println("People included successfully!");
        input.close();
    }
}
