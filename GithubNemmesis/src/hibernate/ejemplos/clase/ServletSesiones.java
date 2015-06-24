package hibernate.ejemplos.clase;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.servlet.http.HttpSessionListener;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


public class ServletSesiones extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private final Logger log = LogManager.getRootLogger();   
   
    public ServletSesiones() {
       
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		HttpSession htsesion = null;
		
		//si la sesion tiene una peticion asociada y sino la tiene se la doy
		
		if (null == (htsesion = request.getSession(false)))
		{
			request.getSession(true);
			log ("No tiene la sesion asignada");
			//System.out.println("No tiene la sesion asignada");
		}
		else
		{
			request.getSession(false);
			log ("Tiene una sesion asignada");
			//System.out.println("Tiene la sesion asignada");
		}
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

}
