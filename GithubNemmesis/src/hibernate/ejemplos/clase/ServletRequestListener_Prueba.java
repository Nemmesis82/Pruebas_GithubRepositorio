package hibernate.ejemplos.clase;

import javax.servlet.ServletRequestEvent;
import javax.servlet.ServletRequestListener;

public class ServletRequestListener_Prueba implements ServletRequestListener 
{

	@Override
	public void requestDestroyed(ServletRequestEvent arg0)
	{
		System.out.println(" DESTRUIR ha pasado por ServletRequestListener_Prueba");
		
	}

	@Override
	public void requestInitialized(ServletRequestEvent arg0) 
	{
		System.out.println("INICIALIZAR ha pasado por ServletRequestListener_Prueba");
		
		
		
	}

}
