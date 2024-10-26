package ar.edu.davinci;
import java.sql.*;


public class Main {
    public static void main(String[] args) throws ClassNotFoundException {

    Connection myConn = null;
    PreparedStatement myStmt = null;
    String url = "jdbc:mysql://localhost:3306/prueba";
    String user = "root";
    String password = "";
    ResultSet myRs = null;
        try{
            Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
            myConn = DriverManager.getConnection(url, user, password);
            System.out.println("Nos conectamos");
            //myStmt = myConn.createStatement();
            String sql = "INSERT INTO products (product_name, description, price, stock, category) VALUES (?,?,?,?,?)";
            myStmt = myConn.prepareStatement(sql);
            myStmt.setString(1, "Tablet");
            myStmt.setString(2, "");
            myStmt.setInt(3, 20000);
            myStmt.setInt(4, 0);
            myStmt.setString(5, "Memoria total 8 GB");

            int rowsAffected = myStmt.executeUpdate();
            if(rowsAffected > 0){
                System.out.println("Se agrego un nuevo producto :)");
            }
        }catch (SQLException e){
            System.out.println("No nos conectamos :(");
        } catch (InstantiationException e) {
            throw new RuntimeException(e);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        }

    }
}
