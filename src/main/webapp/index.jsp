<%@ page import="java.util.Date" %>
<%@ page contentType="text/html; ISO-8859-1" language="java" %>
<html>
<head>
    <title>Welcome</title>
</head>
<body>
<div style="text-align: center;">
    Welcome To User Registration And Login Page
</div>

<%
    Date date = new Date();
    System.out.print("<h2>" + date.toString() + "</h2>");
%>
</body>
</html>
