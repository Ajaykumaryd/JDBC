import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CreateTable {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver"); // Make sure to use the correct driver class name

            String url = "jdbc:mysql://localhost:3306/yt";
            String username = "root";
            String password = "Ajay@2001";

            // Use the connection to execute SQL queries or perform database operations
            Connection connection = DriverManager.getConnection(url, username, password);

            //Create a Query
            String q="create table table1(tId int(20) primary key auto_increment,tName varchar(200) not null,tCity varchar(400))";

            Statement statement= connection.createStatement();

            statement.executeUpdate(q);

            System.out.println("table created in base");


        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
    }
}
