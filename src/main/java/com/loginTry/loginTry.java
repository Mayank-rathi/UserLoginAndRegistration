package com.loginTry;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "loginTry")
public class loginTry extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        User user = new User();
        request.setAttribute("username",request.getParameter("loginname"));
        request.setAttribute("password",request.getParameter("password"));

        if (user.isValidUserCredentials(request.getParameter("loginname"),request.getParameter("password"))) {
            request.getRequestDispatcher("Welcome.jsp").forward(request, response);
        }else{
            request.setAttribute("errorMessage","Invalid Login Name Or Password. Try Again");
           // request.getRequestDispatcher("/loginTry.jsp").forward(request, response);
            RequestDispatcher rd = getServletContext().getNamedDispatcher("loginTry.jsp");
            PrintWriter out = response.getWriter();
            out.println("<font color=red>Either User Name Or Password Is Wrong</font>");
            out.println("<font color=Blue>Or Password Must Required 8 Character</font>");
            out.println("<font color=Blue>1 UpperCase, 1 Numeric Value, 1 Special Character</font>");
            rd.include(request, response);

        }

    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter out = response.getWriter();
        out.print("Login-name " + request.getParameter("loginname") + "Password:" + request.getParameter("password"));

    }
}
