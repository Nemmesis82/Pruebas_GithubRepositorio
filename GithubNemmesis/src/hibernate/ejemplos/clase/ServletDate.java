package hibernate.ejemplos.clase;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class ServletDate extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public ServletDate() {
       
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
	
		 // set content type
	      response.setContentType("text/html");
		  // open print writer to browser
		  PrintWriter out = response.getWriter();
	     //send data
	      out.println("<HTML>");
		  out.println("<H1>  Mi Primer Servlet desde JSP </H1>");
		  out.println("<BR> <H2>Fecha y hora: "+(new Date())+"<H2>");
		  out.println("</HTML>");
		  out.close();

	}
	
}
