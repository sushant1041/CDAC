<%@ page session="true" %>
<%@ page import="java.net.*" %>
<%
    if (session.getAttribute("userID") == null) {
        response.sendRedirect("login.jsp");
        return;
    }
%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Dashboard</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            margin: 0;
            padding: 0;
        }
        .navbar {
            background-color: #333;
            overflow: hidden;
            display: flex;
            padding: 10px;
        }
        .navbar a {
            color: white;
            padding: 14px 20px;
            text-decoration: none;
            display: block;
        }
        .navbar a:hover {
            background-color: #575757;
        }
        .dashboard {
            display: flex;
            flex-wrap: wrap;
            justify-content: center;
            margin-top: 20px;
        }
        .option {
            background-color: #f4f4f4;
            border: 1px solid #ddd;
            border-radius: 5px;
            width: 150px;
            height: 150px;
            margin: 20px;
            display: flex;
            align-items: center;
            justify-content: center;
            font-size: 16px;
            text-align: center;
            cursor: pointer;
            transition: background-color 0.3s ease;
        }
        .option:hover {
            background-color: #ddd;
        }
    </style>
</head>
<body>
    <!-- Navbar -->
    <div class="navbar">
        <a href="dashboard.jsp">Home</a>
        <a href="deposite.jsp">Deposit</a>
        <a href="Withdrawpage.jsp">Withdraw</a>
        <a href="banktype.jsp">Bank Type</a>
        <a href="transaction.jsp">Transactions</a>

    </div>

    <div style="text-align: center; margin-top: 20px;">
        <h2>Welcome, <%= session.getAttribute("userName") %>!</h2>
    </div>

    <div class="dashboard">
        <a class="option" href="deposite.jsp">Deposit</a>
        <a class="option" href="Withdrawpage.jsp">Withdraw</a>
        <a class="option" href="banktype.jsp">Bank Type</a>
        <a class="option" href="transaction.jsp">Transactions</a>

    </div>
</body>
</html>
