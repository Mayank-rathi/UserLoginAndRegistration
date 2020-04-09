<%--
  Created by IntelliJ IDEA.
  User: Destroyer
  Date: 08-04-2020
  Time: 11:40 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
    <title>Insert title here</title>
</head>
<style>
    div.ex {
        text-align: right;
        width: 300px;
        padding: 10px;
        border: 5px solid grey;
        margin: 0px
    }
</style>
<body>
<h1>Registration Form</h1>
<div class="ex">
    <form action="RegistrationController" method="post">
        <table style="with: 50%">
            <tr>
                <td>Full Name</td>
                <td><input type="text" name="fullname"/></td>
            </tr>
            <tr>
                <td>Address</td>
                <td><input type="text" name="address"/></td>
            </tr>
            <tr>
                <td>Age</td>
                <td><input type="text" name="age"/></td>
            </tr>
            <tr>
                <td>Company Name</td>
                <td><input type="text" name="company"/></td>
            </tr>
           <%-- <tr>
                <td>Password</td>
                <td><input type="password" name="password"/></td>
            </tr>
            <tr>--%>
                <td>Date Of Birth</td>
                <td><input type="text" name="yop"/></td>
            </tr>
        </table>
        <input type="submit" value="register"/>
    </form>
</div>
</body>
</html>