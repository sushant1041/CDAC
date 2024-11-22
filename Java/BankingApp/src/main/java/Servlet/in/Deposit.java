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

@WebServlet("/DepositServlet")
public class Deposit extends HttpServlet {
    private static final String url = "jdbc:mysql://localhost:3306/Banking";
    private static final String user = "root";
    private static final String pass = "root";

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession(false);

        if (session == null || session.getAttribute("userID") == null) {
            response.sendRedirect("login.jsp");
            return;
        }

        int userID = (int) session.getAttribute("userID");
        String amountStr = request.getParameter("amount");
        double depositAmount = Double.parseDouble(amountStr);

        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection connection = DriverManager.getConnection(url, user, pass);

            String selectQuery = "SELECT Balance FROM Accounts WHERE UserID = ?";
            PreparedStatement selectStatement = connection.prepareStatement(selectQuery);
            selectStatement.setInt(1, userID);
            ResultSet resultSet = selectStatement.executeQuery();

            if (resultSet.next()) {
                double currentBalance = resultSet.getDouble("Balance");
                double newBalance = currentBalance + depositAmount;

                String updateQuery = "UPDATE Accounts SET Balance = ? WHERE UserID = ?";
                PreparedStatement updateStatement = connection.prepareStatement(updateQuery);
                updateStatement.setDouble(1, newBalance);
                updateStatement.setInt(2, userID);
                updateStatement.executeUpdate();

                response.getWriter().println("<script>alert('Deposit successful! New Balance: " + newBalance + "'); window.location = 'dashboard.jsp';</script>");
            } else {
                response.getWriter().println("<script>alert('Account not found!'); window.location = 'dashboard.jsp';</script>");
            }

            connection.close();
        } catch (Exception e) {
            e.printStackTrace();
            response.getWriter().println("<script>alert('Something went wrong. Please try again later.'); window.location = 'dashboard.jsp';</script>");
        }
    }
}
