import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;

@WebServlet("/Add")
public class Servlet12 extends HttpServlet {
    static String url = "jdbc:mysql://localhost:3306/student";
    static String user = "root";
    static String password = "root";
    static Connection conn1;

//    static Connection conn2;

    static PreparedStatement stmt;
    static Statement stmt2;
    @Override
    public void init() throws ServletException {
        try {
             Class.forName("com.mysql.jdbc.Driver");
             conn1 = DriverManager.getConnection(url, user, password);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
          resp.setContentType("text/html");
          PrintWriter p=resp.getWriter();
          int id= Integer.parseInt(req.getParameter("id"));
          String name=req.getParameter("name");
          String city=req.getParameter("city");
          int idremove=Integer.parseInt(req.getParameter("delete"));
        try {
            stmt = conn1.prepareStatement("insert into student values(?,?,?)");
            String query="delete from student where id="+idremove;
            stmt2= conn1.createStatement();
            stmt.setInt(1,id);
            stmt.setString(2,name);
            stmt.setString(3,city);
            stmt.executeUpdate();
            stmt2.execute(query);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void destroy() {
        try {
            stmt.close();
            conn1.close();
//            conn2.close();
            stmt2.close();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
