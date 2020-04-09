<%--
  Created by IntelliJ IDEA.
  User: Destroyer
  Date: 08-04-2020
  Time: 08:49 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Welcome</title>
</head>
<body>
<h1>Welcome</h1>

<p>UserName Is :<%=request.getAttribute("username")%></p>
<p>Password Is :<%=request.getAttribute("password")%></p>

</body>
</html>
