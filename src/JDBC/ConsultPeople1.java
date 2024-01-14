package JDBC;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class ConsultPeople1 {
    public static void main(String[] args) throws SQLException {
        Connection connection = ManufacturesConnection.getConnection();
        String sql = "SELECT * FROM people";

        Statement stmt = connection.createStatement();
        ResultSet resultSet = stmt.executeQuery(sql);

        List<People> peopleList = new ArrayList<>();

        while(resultSet.next()){
            int code = resultSet.getInt("code");
            String name = resultSet.getString("name");
            peopleList.add(new People(code, name));
        }

        for(People p: peopleList){
            System.out.println(p.getCode() + " ==> " + p.getName());
        }

        stmt.close();
        connection.close();
    }
}
