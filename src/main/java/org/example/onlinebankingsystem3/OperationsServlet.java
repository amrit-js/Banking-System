package org.example.onlinebankingsystem3;

import java.io.IOException;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;
import jakarta.servlet.http.HttpServlet;

@WebServlet("/org.example.onlinebankingsystem3.OperationsServlet")
public class OperationsServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String operation = request.getParameter("operation");
        double amount = Double.parseDouble(request.getParameter("amount"));

        switch (operation) {
            case "deposit":
                // Logic to deposit amount
                break;
            case "withdraw":
                // Logic to withdraw amount
                break;
            case "transfer":
                // Logic to transfer amount
                break;
            default:
                throw new ServletException("Invalid operation");
        }

        response.sendRedirect("operations.jsp?success=Operation completed");
    }
}