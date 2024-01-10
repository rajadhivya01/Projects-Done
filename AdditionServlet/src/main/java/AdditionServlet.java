import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class AdditionServlet extends HttpServlet {
  public void doGet(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
    response.setContentType("text/html");
    PrintWriter out = response.getWriter();
    out.println("<html>");
    out.println("<head><title>Addition Servlet</title></head>");
    out.println("<body>");
    out.println("<h1>Addition Servlet</h1>");
    out.println("<form method='POST'>");
    out.println("<label>First number:</label>");
    out.println("<input type='text' name='num1'><br>");
    out.println("<label>Second number:</label>");
    out.println("<input type='text' name='num2'><br>");
    out.println("<input type='submit' value='Add'>");
    out.println("</form>");
    out.println("</body>");
    out.println("</html>");
  }

  public void doPost(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
    int num1 = Integer.parseInt(request.getParameter("num1"));
    int num2 = Integer.parseInt(request.getParameter("num2"));
    int sum = num1 + num2;
    response.setContentType("text/html");
    PrintWriter out = response.getWriter();
    out.println("<html>");
    out.println("<head><title>Addition Result</title></head>");
    out.println("<body>");
    out.println("<h1>Addition Result</h1>");
    out.println("<p>" + num1 + " + " + num2 + " = " + sum + "</p>");
    out.println("</body>");
    out.println("</html>");
  }
}
