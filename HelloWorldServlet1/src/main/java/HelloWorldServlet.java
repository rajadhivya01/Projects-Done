import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class HelloWorldServlet extends HttpServlet {

   public void doGet(HttpServletRequest request, HttpServletResponse response)
               throws ServletException, IOException {
      
      response.setContentType("text/html");


      PrintWriter out = response.getWriter();
      out.println("<h1>Welcome to my Example Program For Servlet!!10Decoders</h1>");
   }
}
