import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.swing.plaf.nimbus.State;

@WebServlet("/UserServlet")
public class UserServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
       resp.setContentType("text/html");
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/student","root","root");
            Statement stmt= conn.createStatement();
            String query="select * from student";
            ResultSet rs= stmt.executeQuery(query);

            req.setAttribute("resultset",rs);
            req.getRequestDispatcher("Show.jsp").forward(req,resp);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }catch(SQLException e)
        {
            System.out.println(e);
        }


    }
}














//    protected void doGet(HttpServletRequest request, HttpServletResponse response)
//            throws ServletException, IOException {
//        response.setContentType("text/html");
//        PrintWriter out = response.getWriter();
//        Connection conn = null;
//        Statement stmt = null;
//        ResultSet rs = null;
//
//        try {
//            Class.forName("com.mysql.jdbc.Driver");
//
//            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/student", "root", "root");
//
//            stmt = conn.createStatement();
//            rs = stmt.executeQuery("SELECT * FROM student");
//
//            request.setAttribute("resultSet", rs);
//
//            request.getRequestDispatcher("Show.jsp").forward(request, response);
//
//        } catch (Exception e) {
//            out.println("<h3>Error: " + e.getMessage() + "</h3>");
//        } finally {
//            try {
//                if (rs != null) rs.close();
//                if (stmt != null) stmt.close();
//                if (conn != null) conn.close();
//            } catch (SQLException e) {
//                e.printStackTrace();
//            }
//        }
//    }

