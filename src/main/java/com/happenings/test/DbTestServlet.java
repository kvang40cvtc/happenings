package com.happenings.test;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;

@WebServlet("/db-test")
public class DbTestServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/plain");
        PrintWriter out = response.getWriter();

        try {
            String url = System.getenv("DB_URL");
            String user = System.getenv("DB_USERNAME");
            String pass = System.getenv("DB_PASSWORD");

            Connection conn = DriverManager.getConnection(url, user, pass);

            out.println("Database connection successful!");

            conn.close();

        } catch (Exception e) {
            out.println("Database connection failed:");
            e.printStackTrace(out);
        }
    }
}