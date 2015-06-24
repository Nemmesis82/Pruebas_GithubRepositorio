package hibernate.ejemplos.clase;

import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class HttpSessionListener_Prueba implements HttpSessionListener
{
	private final Logger log = LogManager.getRootLogger();
	@Override
	public void sessionCreated(HttpSessionEvent arg0) 
	{
		System.out.println(" CREAR ha pasado por HttpSessionListener_Prueba");

		System.out.println("Se ha creador la sesion" + " " + arg0.getSession().getId());
		
	}

	@Override
	public void sessionDestroyed(HttpSessionEvent arg0) 
	{
		System.out.println("DESTRUIR ha pasado por HttpSessionListener_Prueba");
		
	}

}
