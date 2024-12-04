package org.example.onlinebankingsystem2;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import org.example.onlinebankingsystem3.DatabaseConnection;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String username = request.getParameter("username");
        String password = request.getParameter("password");

        // Validate user credentials
        if (validateUser(username, password)) {
            HttpSession session = request.getSession();
            session.setAttribute("username", username); // Store username in session
            response.sendRedirect("operations.jsp"); // Redirect to operations page
        } else {
            response.sendRedirect("login.jsp?error=Invalid credentials");
        }
    }

    private boolean validateUser(String username, String password) {
        try (Connection connection = DatabaseConnection.getConnection()) {
            String sql = "SELECT * FROM users WHERE username = ? AND password = ?";
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setString(1, username);
            statement.setString(2, password); // Direct comparison (not secure)
            ResultSet resultSet = statement.executeQuery();
            System.out.println(sql);
            return resultSet.next(); // Returns true if user exists
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false; // Return false if user not found or error occurs
    }
}