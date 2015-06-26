 package hibernate.ejemplos.clase;

import java.io.IOException;
import java.util.HashMap;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


public class SesionesActivas extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	
    
    public SesionesActivas() {

    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		final Logger log = LogManager.getRootLogger();
		HashMap<String,HttpSession> sesion= new HashMap<String,HttpSession>();
		log.info("El numero de sesiones activas son las siguientes: " + sesion.size());
		response.getWriter().println("El número de sesiones activas" + sesion.size());
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
	
	}

}
