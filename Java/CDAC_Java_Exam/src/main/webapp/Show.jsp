<%@ page import="java.sql.*"%>
<!DOCTYPE html>
<html>
<head>
    <title>User Data</title>
    <style>
        table {
            width: 50%;
            margin: auto;
            border-collapse: collapse;
        }
        th, td {
            padding: 10px;
            text-align: left;
            border: 1px solid #ddd;
        }
        th {
            background-color: #f4f4f4;
        }
    </style>
</head>
<body>
    <h1 style="text-align: center;">User Information</h1>
    <table>
        <thead>
            <tr>
                <th>ID</th>
                <th>Name</th>
                <th>City</th>
            </tr>
        </thead>
        <tbody>
                <%
                     ResultSet rs=(ResultSet)request.getAttribute("resultset");
                     if(rs!=null){
                     while(rs.next()){
                %>
                <tr>
                   <td><%=rs.getInt("id")%></td>
                   <td><%=rs.getString("name")%></td>
                   <td><%=rs.getString("city")%></td>
                </tr>
                <%
                        }
                     }
                %>
        </tbody>

    </table>
</body>
</html>


