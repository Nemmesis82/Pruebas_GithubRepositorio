package hibernate.ejemplos.clase;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.hibernate.SessionFactory;

public class ServletContextListener_Prueba implements ServletContextListener
{

	private final Logger log = LogManager.getRootLogger();

	@Override
	public void contextDestroyed(ServletContextEvent arg0) 
	{
		System.out.println("DESTRUIR ha pasado por ServletContextListener_Prueba");
		
		try 
		{
			ServletContext sc =arg0.getServletContext();
			
			SessionFactory sf =(SessionFactory) sc.getAttribute("sf");
			
			sf.close();
			
		} catch (Exception e) 
		{
			e.printStackTrace();
		}
	
		
	}

	@Override
	public void contextInitialized(ServletContextEvent arg0) 
	{
		System.out.println(" 1- INICIALIZAR ha pasado por ServletContextListener_Prueba");
		System.out.println(arg0.getServletContext().getInitParameter("contador"));
		try 
		{
		
			ServletContext sc =arg0.getServletContext();
			
			SessionFactory sf =SesionManager.getSessionFactory();
					
			sc.setAttribute("sf", sf);
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
