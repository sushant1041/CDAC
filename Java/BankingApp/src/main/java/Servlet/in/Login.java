package Servlet.in;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/LoginServlet")
public class Login extends HttpServlet {
    private static final String DB_URL = "jdbc:mysql://localhost:3306/Banking";
    private static final String DB_USER = "root";
    private static final String DB_PASSWORD = "root";

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String email = request.getParameter("email");
        String password = request.getParameter("password");

        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection connection = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);

            String sql = "SELECT * FROM Users WHERE Email = ?";
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setString(1, email);
            ResultSet resultSet = statement.executeQuery();

            if (resultSet.next()) {
                String storedPassword = resultSet.getString("Password");

                if (password.equals(storedPassword)) {
                    HttpSession session = request.getSession();
                    session.setAttribute("userID", resultSet.getInt("UserID"));
                    session.setAttribute("userName", resultSet.getString("FirstName"));
                    response.sendRedirect("dashboard.jsp");
                } else {
                    response.getWriter().println("<script>alert('Incorrect password!'); window.location = 'login.jsp';</script>");
                }
            } else {
                response.getWriter().println("<script>alert('Email not registered!'); window.location = 'login.jsp';</script>");
            }
            connection.close();
        } catch (Exception e) {
            e.printStackTrace();
            response.getWriter().println("<h3>Something went wrong. Please try again later.</h3>");
        }
    }
}
