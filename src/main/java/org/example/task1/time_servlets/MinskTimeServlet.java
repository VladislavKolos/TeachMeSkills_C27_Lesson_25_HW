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
 * Servlet class to display the current time in Minsk.
 */
@WebServlet(value = "/minsk", name = "MinskTimeServlet")
public class MinskTimeServlet extends HttpServlet {

    /**
     * Method for processing GET requests. Displays the current time in Minsk.
     */
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        resp.setContentType("text/html");
        PrintWriter printWriter = resp.getWriter();
        printWriter.println("<html><head><title>Current time in Minsk</title></head><body>");
        printWriter.println("<h2>Current time in Minsk</h2>");
        printWriter.println("<p>" + ZonedDateTime.now(ZoneId.of("Europe/Minsk")) + "</p>");
        printWriter.println("</body></html>");
    }
}
