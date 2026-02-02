package com.company.myservlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

public class RegistrationServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // SOAP
        resp.setContentType("text/html");
        PrintWriter out = resp.getWriter();

        // Form - data read
        String firstName = req.getParameter("firstName");
        String lastName = req.getParameter("lastName");
        String email = req.getParameter("email");
        String password = req.getParameter("password");
        String terms = req.getParameter("terms");

        // JDBC

        if(terms != null) {
            out.println("<h2>Your details have been recorded successfully! </h2>");
            out.println("<p>Full Name - " + firstName + " " + lastName + " </p>") ;
            out.println("<p>Email - " + email + "</p>");
            out.println("<p>Password - " + password + "</p>");
            out.println("<p>Terms - " + terms + "</p>");
        } else {
            out.println("<h2>Your details has NOT been recorded, please agree to the conditions & try again! </h2>");
        }
    }
}
