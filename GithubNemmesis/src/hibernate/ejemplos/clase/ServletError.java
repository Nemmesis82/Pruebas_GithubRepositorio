package hibernate.ejemplos.clase;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


public class ServletError extends HttpServlet 
{
	private static final long serialVersionUID = 1L;
	private final Logger log = LogManager.getRootLogger();       
   
    public ServletError() 
    {
     }
/**
 * primero accedo al request para que me diga todo, luego la extraigo en un log
 */
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		log.info("Error 404");
		log.info(request.getAttribute(getServletName()));
		response.sendRedirect("Error.html");
		
		
	}

	
	

}
