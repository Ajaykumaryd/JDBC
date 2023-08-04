import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class First {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver"); // Make sure to use the correct driver class name

            String url = "jdbc:mysql://localhost:3306/yt";
            String username = "root";
            String password = "Ajay@2001";

            // Use the connection to execute SQL queries or perform database operations
            Connection connection = DriverManager.getConnection(url, username, password);


//            connection.close(); // Close the connection when done
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
    }
    }

