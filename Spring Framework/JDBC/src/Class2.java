import java.sql.*;

public class Class2 {
    public static void main(String[] args) throws Exception{

        String sql = "Select * from emp_name where id = ?";

        String url = "jdbc:mysql://localhost:3306/practise";
        String username = "root";
        String password = "root";

        Connection con = DriverManager.getConnection(url, username, password);
        PreparedStatement pst = con.prepareStatement(sql);
        // setInt(int parameterIndex, int value) → This method sets an integer value for a specific placeholder (?) in the SQL query.
        pst.setInt(1, 2);
        ResultSet rs = pst.executeQuery();
        // By default, JDBC runs in auto-commit mode
        // You can disable it con.setAutoCommit(false); but then you will have to manually do it -> con.commit();

        rs.next();
        System.out.println(rs.getString("first_name"));

        rs.close();
        pst.close();
        con.close();
        /*
        * 3.
        * JDBC is manual & lower-level, while ORMs like Hibernate provide abstraction
        * and automation for database operations. If you need full control over queries,
        * use JDBC. If you want easier database interaction, consider Hibernate.
        * */
    }
}
