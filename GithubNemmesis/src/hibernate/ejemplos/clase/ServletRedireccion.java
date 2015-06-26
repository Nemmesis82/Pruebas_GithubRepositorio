package hibernate.ejemplos.clase;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


public class ServletRedireccion extends HttpServlet 
{
	private static final long serialVersionUID = 1L;
       
    public ServletRedireccion() 
    {

    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		final Logger log = LogManager.getRootLogger();
		log.info("Mando a facebook");
		response.sendRedirect("http://www.facebook.com");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
	
	}

}
