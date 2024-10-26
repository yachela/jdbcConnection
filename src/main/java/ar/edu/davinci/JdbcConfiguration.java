package ar.edu.davinci;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JdbcConfiguration {

    private static String url = "jdbc:postgresql://localhost:5432/prueba";
    private static String user = "root";
    private static String password = "";
    private static Connection myConn;

    public static Connection getInstance() throws SQLException {
        if (myConn == null){
            myConn = DriverManager.getConnection(url, user, password);

        }
        return myConn;
    }


}
