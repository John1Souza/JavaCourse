package JDBC;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class DeletePeople {
    public static void main(String[] args) throws SQLException {

        Scanner input = new Scanner(System.in);
        System.out.println("inform the code: ");
        int code = input.nextInt();

        Connection connection = ManufacturesConnection.getConnection();

        String sql = "DELETE FROM people WHERE code > ?";

        PreparedStatement stmt = connection.prepareStatement(sql);
        stmt.setInt(1, code);

        int count = stmt.executeUpdate();
        if(count > 0){
            System.out.println("People deleted successfully!");
            System.out.println("Affected rows: " + count);
        }else{
            System.out.println("Nothing to do!");
        }
        connection.close();
        input.close();

    }
}
