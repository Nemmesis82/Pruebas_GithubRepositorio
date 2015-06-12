package hibernate.ejemplos.clase;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

public class SessionManager 
{

	public static Session session;
	public static Configuration configuration;
	public static StandardServiceRegistryBuilder builder;
	public static SessionFactory factory;
	public static Transaction transaction;
	
	
	public SessionManager()
 {
		//hago la conexion 
		configuration = new Configuration().configure();
		builder = new StandardServiceRegistryBuilder().applySettings(configuration.getProperties());
		factory = configuration.buildSessionFactory(builder.build());
	
		setSession(factory.openSession());
	
	}
	
	public static Session getSession() 
	{
		return session;
	}

	public static void setSession(Session session) 
	{
		SessionManager.session = session;
	}


	@SuppressWarnings("unused")
	public static void obtenerSession()
	{
		session = factory.getCurrentSession(); 
	}
	
	@SuppressWarnings("unused")
	public static void disconectSession()
	{
		session.disconnect();
	}
	
	public void closeSession()
	{
		try
		{
		
			session.close();
		
			factory.close();

		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	
	
}
