package JDBC;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DAO {
    private Connection connection;

    public int include(String sql, Object... attributes){
        try {
            PreparedStatement stmt = getConnection()
                    .prepareStatement(sql, PreparedStatement.RETURN_GENERATED_KEYS);
            addAttribute(stmt, attributes);
            if(stmt.executeUpdate() > 0){
                ResultSet resultSet = stmt.getGeneratedKeys();
                if(resultSet.next()){
                    return resultSet.getInt(1);
                }
            }
            return -1;
        } catch (SQLException e){
            throw new RuntimeException(e);
        }
    }

    private void addAttribute(PreparedStatement stmt, Object[] attributes) throws SQLException{
        int indice = 1;
        for (Object attribute: attributes){
            if(attribute instanceof String){
                stmt.setString(indice, (String) attribute);
            } else if (attribute instanceof Integer){
                stmt.setInt(indice, (Integer) attribute);
            }
            indice++;
        }
    }

    private Connection getConnection(){
        try {
            if(connection != null && !connection.isClosed()){
               return connection;
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        connection = ManufacturesConnection.getConnection();
        return connection;
    }
}
