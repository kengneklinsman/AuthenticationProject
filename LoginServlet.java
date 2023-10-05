package controllers;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Hard-coded user name and password for demonstration purposes
        String validUsername = "user";
        String validPassword = "password";

        String username = request.getParameter("username");
        String password = request.getParameter("password");

        if (username.equals(validUsername) && password.equals(validPassword)) {
            // Authentication successful, redirect to the home page
            response.sendRedirect("home.jsp");
        } else {
            // Authentication failed, redirect to the forget password page
            response.sendRedirect("forgetpassword.jsp");
        }
    }
}
