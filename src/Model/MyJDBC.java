package Model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MyJDBC {
    private static String url = "jdbc:mysql://127.0.0.1:3306/userschema";
    private static String user = "root";
    private static String password = "Mgk62701";


    private MyJDBC(){}

    public static Connection getConnection() throws SQLException {
        Connection connection = null;
        connection = DriverManager.getConnection(url,user,password);

        return connection;
    }

}



/* Codigo base para fazer o request no SQL
        try {
            Connection connection = DriverManager.getConnection(
                    "jdbc:mysql://127.0.0.1:3306/userschema",
                    "root",
                    "Mgk62701");

            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT * FROM USERS");

            while (resultSet.next()) {
                System.out.println(resultSet.getString("username"));
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
*/