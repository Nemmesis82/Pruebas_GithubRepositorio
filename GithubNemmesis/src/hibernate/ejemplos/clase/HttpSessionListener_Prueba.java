package hibernate.ejemplos.clase;

import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

public class HttpSessionListener_Prueba implements HttpSessionListener
{

	@Override
	public void sessionCreated(HttpSessionEvent arg0) 
	{
		System.out.println(" CREAR ha pasado por HttpSessionListener_Prueba");
		
	}

	@Override
	public void sessionDestroyed(HttpSessionEvent arg0) 
	{
		System.out.println("DESTRUIR ha pasado por HttpSessionListener_Prueba");
		
	}

}
