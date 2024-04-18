package org.example.task2.age_servlets;

import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.example.task2.age_validator.AgeValidator;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.stream.Collectors;

/**
 * Servlet class for checking majority by age.
 */
@WebServlet(value = "/ageVerify", name = "AgeVerificationServlet")
public class AgeVerificationServlet extends HttpServlet {

    /**
     * Method for processing POST-requests
     * takes the age in the request body as an input and returns information about the age of majority.
     */
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        try {
            String ageStr = req.getReader().lines().collect(Collectors.joining());
            JsonObject jsonObject = JsonParser.parseString(ageStr).getAsJsonObject();
            double age = jsonObject.get("age").getAsDouble();

            if (ageStr.isEmpty() || age < 0 || age > 150) {
                resp.setStatus(HttpServletResponse.SC_BAD_REQUEST);
                resp.setContentType("text/html");
                PrintWriter printWriter = resp.getWriter();
                printWriter.println("<html><body>");
                printWriter.println("<h1>Error</h1>");
                printWriter.println("<p>Age was not specified or incorrect</p>");
                printWriter.println("</body></html>");

            } else {
                int finalAge = (int) Math.floor(age);
                String status = AgeValidator.validateAge(finalAge);

                resp.setContentType("text/html");
                PrintWriter printWriter = resp.getWriter();
                printWriter.println("<html><body>");
                printWriter.println("<h1>Age verification result</h1>");
                printWriter.println("<p>Age: " + finalAge + "</p>");
                printWriter.println("<p>Status: " + status + "</p>");
                printWriter.println("</body></html>");
            }

        } catch (NumberFormatException e) {
            resp.setStatus(HttpServletResponse.SC_BAD_REQUEST);
            resp.setContentType("text/htm");
            PrintWriter printWriter = resp.getWriter();
            printWriter.println("<html><body>");
            printWriter.println("<h1>Error</h1>");
            printWriter.println("<p>Incorrect age format</p>");
            printWriter.println("</body></html>");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
