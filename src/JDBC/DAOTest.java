package JDBC;

public class DAOTest {
    public static void main(String[] args) {
        DAO dao = new DAO();

        String sql = "INSERT INTO people (name) VALUES (?)";
        System.out.println(dao.include(sql, "John Doe"));
        System.out.println(dao.include(sql, "Mary Doe"));
        System.out.println(dao.include(sql, "Peter Doe"));
        System.out.println(dao.include(sql, "Joseph Faraday"));

        dao.close();
    }
}
