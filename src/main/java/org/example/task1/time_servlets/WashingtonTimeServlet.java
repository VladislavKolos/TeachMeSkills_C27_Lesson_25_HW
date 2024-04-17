package org.example.task1.time_servlets;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;
import java.time.ZoneId;
import java.time.ZonedDateTime;

/**
 * Servlet class to display the current time in Washington.
 */
@WebServlet(value = "/washington", name = "WashingtonTimeServlet")
public class WashingtonTimeServlet extends HttpServlet {

    /**
     * Method for processing GET requests. Displays the current time in Washington.
     */
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        resp.setContentType("text/html");
        PrintWriter printWriter = resp.getWriter();
        printWriter.println("<html><head><title>Current time in Washington</title></head><body>");
        printWriter.println("<h2>Current time in Washington</h2>");
        printWriter.println("<p>" + ZonedDateTime.now(ZoneId.of("UTC-4")));
        printWriter.println("</body></html>");
    }
}
