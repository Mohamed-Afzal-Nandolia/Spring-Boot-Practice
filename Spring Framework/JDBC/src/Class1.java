import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/*
* 1.
* Add the MySQL connector file (https://dev.mysql.com/downloads/file/?id=537130) in the project structure
* Open Project Structure -> Click on Library -> + Add java -> Navigate to the jar file -> Apply and Ok
* */
public class Class1 {
    public static void main(String[] args) throws Exception{
        /*
        * 2.
        * JDBC Driver → A software component that enables Java to communicate with the database.
        * Connection → Represents a session with the database.
        * Statement / PreparedStatement → Used to execute SQL queries.
        * ResultSet → Holds the data retrieved from a query.
        * */

        String sql = "Select * from emp_name";

        String url = "jdbc:mysql://localhost:3306/practise";
        String username = "root";
        String password = "root";

        Connection con = DriverManager.getConnection(url, username, password);
        Statement st = con.createStatement();// Using Statement
        ResultSet rs = st.executeQuery(sql);

        rs.next();

        while (rs.next()) {
            System.out.println(rs.getString("first_name"));
        }

        con.close();

    }
}