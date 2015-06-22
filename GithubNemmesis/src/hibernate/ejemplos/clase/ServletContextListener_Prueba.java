package hibernate.ejemplos.clase;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

import org.hibernate.SessionFactory;

public class ServletContextListener_Prueba implements ServletContextListener
{

	@Override
	public void contextDestroyed(ServletContextEvent arg0) 
	{
		System.out.println("DESTRUIR ha pasado por ServletContextListener_Prueba");
		

		ServletContext sc =arg0.getServletContext();
		
		SessionFactory sf =(SessionFactory) sc.getAttribute("sf");
		
		sf.close();
		
	}

	@Override
	public void contextInitialized(ServletContextEvent arg0) 
	{
		System.out.println(" INICIALIZAR ha pasado por ServletContextListener_Prueba");
		
		ServletContext sc =arg0.getServletContext();
		
		SessionFactory sf =SesionManager.getSessionFactory();
		
		sc.setAttribute("sf", sf);
	}

}
