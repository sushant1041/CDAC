package jdbc;

import java.sql.*;

class JdbcConn{
   static String url = "jdbc:mysql://localhost:3306/student";
   static String user = "root";
    static String password = "root";
}

public class Conn extends JdbcConn{
    public static void main(String[] args) {
       // Connection conn1 ;
       // Statement stmt;

        try {
            // Step 1: Load The Driver
            Class.forName("com.mysql.jdbc.Driver");

            // Step 2: Open a connection
            Connection conn1 = DriverManager.getConnection(url, user, password);

            // Step 3: create
            Statement stmt = conn1.createStatement();
            String sql = "SELECT * FROM student";
            ResultSet rs = stmt.executeQuery(sql);

            // Step 4: Process the result set
            while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("name");
                String City =rs.getString("city");
                System.out.println("ID: " + id + " - Name: " + name+" - City :"+City);
            }


            rs.close();
            stmt.close();
            conn1.close();

        } catch (SQLException se) {
            se.printStackTrace();}
        catch (Exception e) {
            e.printStackTrace();
        }
    }
}

