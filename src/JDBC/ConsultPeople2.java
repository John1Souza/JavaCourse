package JDBC;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ConsultPeople2 {
    public static void main(String[] args) throws SQLException {
        Scanner input = new Scanner(System.in);
        System.out.print("What do you want to search: ");
        String searchFor = input.nextLine();
        String selectedOption = "";
        String searchForManipulated = "";

        System.out.println("[ 1 ] - If you need all name who initialize with some letter");
        System.out.println("[ 2 ] - If you need all name ended with some letter");
        System.out.println("[ 3 ] - If you need all name who have specified letters");
        System.out.println("What do you want: ");
        int searchForOption = input.nextInt();

        switch (searchForOption){
            case 1:
                searchForManipulated = searchFor + "%" ;
                selectedOption = "all name who initialize with '" + searchFor + "' letter";
                break;
            case 2:
                searchForManipulated = "%" + searchFor;
                selectedOption = "all name who ended with '" + searchFor + "' letter";
                break;
            case 3:
                searchForManipulated = "%" + searchFor + "%" ;
                selectedOption = "all name who have '" + searchFor + "' letter";
                break;
            default:
                break;
        }
        //System.out.println(searchFor);

        Connection connection = ManufacturesConnection.getConnection();

        String sql = "select * from people where name like ?";

        PreparedStatement stmt = connection.prepareStatement(sql);
        stmt.setString(1, searchForManipulated);

        ResultSet resultSet = stmt.executeQuery();
        List<People> peopleList = new ArrayList<>();

        while(resultSet.next()){
            int code = resultSet.getInt("code");
            String name = resultSet.getString("name");
            peopleList.add(new People(code, name));
        }

        System.out.println("Here are the results of " + selectedOption);
        for (People p: peopleList){
            System.out.println(p.getCode() +  " --> " + p.getName());
        }

        stmt.close();
        connection.close();
        input.close();
    }
}
