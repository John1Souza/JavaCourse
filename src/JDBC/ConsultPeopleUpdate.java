package JDBC;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ConsultPeopleUpdate {
    public static void main(String[] args) throws SQLException {
        Scanner input = new Scanner(System.in);
        Connection connection = ManufacturesConnection.getConnection();

        System.out.println("What's the name you want to change? ");
        String nameToChange = input.nextLine();

        System.out.println("tell me the code from this name? ");
        int customCode = input.nextInt();

        String sql = "update people set name = ? where code = ?";
        PreparedStatement stmt = connection.prepareStatement(sql);
        stmt.setString(1, nameToChange);
        stmt.setInt(2, customCode);

        int rowsAffected = stmt.executeUpdate();

        System.out.println("Rows affected: " + rowsAffected);

        stmt.close();
        connection.close();
        input.close();
    }
}
