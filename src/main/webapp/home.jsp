<%--
  Created by IntelliJ IDEA.
  User: Destroyer
  Date: 08-04-2020
  Time: 10:21 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
    <title>Check Your Own Data</title>
</head>
<style>
    table#nat {
        width: 50%;
        background-color: #FA8072;
    }
</style>
</head>
<body>
<% String name = request.getParameter("fullname");
    String Addr = request.getParameter("address");
    String age = request.getParameter("age");
    String company = request.getParameter("company");
/*
    String Persent = request.getParameter("percent");
*/
    String Year = request.getParameter("yop"); %>
<table id="nat">
    <tr>
        <td>Full Name</td>
        <td><%= name %>
        </td>
    </tr>
    <tr>
        <td>Address</td>
        <td><%= Addr %>
        </td>
    </tr>
    <tr>
        <td>Age</td>
        <td><%= age %>
        </td>
    </tr>
    <tr>
        <td>Company Name</td>
        <td><%= company %>
        </td>
    </tr>
   <%-- <tr>
        <td>Password</td>
        <td><%= password %>
        </td>
    </tr>--%>
    <tr>
        <td>Date Of Birth</td>
        <td><%= Year %>
        </td>
    </tr>
</table>
</body>
</html>