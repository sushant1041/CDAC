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
@WebServlet("/WithdrawServlet")
public class Withdraw extends HttpServlet {

    private static final String url = "jdbc:mysql://localhost:3306/Banking?useSSL=false&allowPublicKeyRetrieval=true&serverTimezone=UTC";
    private static final String user = "root";
    private static final String pass = "root";

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        HttpSession session = req.getSession();
        if (session == null || session.getAttribute("userID") == null) {
            resp.sendRedirect("index.jsp");
            return;
        }

        int userid = (int) session.getAttribute("userID");
        double amountWithdraw;

            amountWithdraw = Double.parseDouble(req.getParameter("amount"));


        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection c = DriverManager.getConnection(url, user, pass);

            String query = "SELECT Balance FROM Accounts WHERE UserID = ?";
            PreparedStatement stmt = c.prepareStatement(query);
            stmt.setInt(1, userid);
            ResultSet rs = stmt.executeQuery();

            if (rs.next()) {
                double currentBalance = rs.getDouble("Balance");

                if (currentBalance < amountWithdraw) {
                    resp.getWriter().println("<script>alert('Insufficient funds!'); window.location = 'dashboard.jsp';</script>");
                    c.close();

                }

                double newBalance = currentBalance - amountWithdraw;

                String updateQuery = "UPDATE Accounts SET Balance = ? WHERE UserID = ?";
                PreparedStatement updateStmt = c.prepareStatement(updateQuery);
                updateStmt.setDouble(1, newBalance);
                updateStmt.setInt(2, userid);
                updateStmt.executeUpdate();

                resp.getWriter().println("<script>alert('Withdraw successful! New Balance: " + newBalance + "'); window.location = 'dashboard.jsp';</script>");
            } else {
                resp.getWriter().println("<script>alert('Account not found!'); window.location = 'dashboard.jsp';</script>");
            }
            c.close();
        } catch (Exception e) {
            e.printStackTrace();
            resp.getWriter().println("<script>alert('Error: " + e.getMessage() + "'); window.location = 'dashboard.jsp';</script>");
        }
    }
}
