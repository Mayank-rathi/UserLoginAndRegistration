package com.firstTry;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.regex.Pattern;

@WebServlet(
        description = "Login Servlet Testing",
        urlPatterns = {"/LoginServlet"},
        initParams = {
                @WebInitParam(name = "user", value = "Mayank"),
                @WebInitParam(name = "password", value = "Mayankrathi33@")
        }
)
public class LoginServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String user = request.getParameter("user");
        String pwd = request.getParameter("pwd");

        String userID = getServletConfig().getInitParameter("user");
        String password = getServletConfig().getInitParameter("password");

        //Regex For Password
        String PasswordRegex = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=])(?=\\S+$).{8,}$";
        Pattern passwordPattern = Pattern.compile(PasswordRegex);

        //Regex For User Name
        String UserRegex = "^[A-Z]{1}[A-Za-z]{3,}$";
        Pattern userPattern = Pattern.compile(UserRegex);

        if (userID.equals(user) && password.equals(pwd) && pwd.matches(String.valueOf(passwordPattern)) && userID.matches(String.valueOf(userPattern))) {
            request.setAttribute("user", user);
            request.getRequestDispatcher("LoginSuccess.jsp").forward(request, response);
        } else {
            RequestDispatcher rd = getServletContext().getNamedDispatcher("/login.html");
            PrintWriter out = response.getWriter();
            out.println("<font color=red>Either User Name Or Password Is Wrong</font>");
            out.println("<font color=Blue>Or Password Must Required 8 Character</font>");
            out.println("<font color=Blue>1 UpperCase, 1 Numeric Value, 1 Special Character</font>");
            rd.include(request, response);
        }
    }
}
