package hibernate.ejemplos.clase;

import java.math.BigDecimal;
import java.util.Iterator;
import java.util.List;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;


public class IncrementoSalario 
{
	//declaro las variables para la conexion
	private static Session session;
	private static Configuration configuration;
	private static StandardServiceRegistryBuilder builder;
	private static SessionFactory factory;
	private static Transaction transaction;
	

	public IncrementoSalario()
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
		IncrementoSalario.session = session;
	}


	@SuppressWarnings("unused")
	private static void obtenerSession()
	{
		session = factory.getCurrentSession(); 
	}
	
	private static void disconectSession()
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
	
	public void incrementoSalario20()
	{
		try 
		{
			System.out.println("Incrementando el salario del departamento:");
			System.out.println("\n");
		
			//comienzo el incremento abriendo la transaccion
			transaction = session.beginTransaction();
		
			@SuppressWarnings("unchecked")
			
			//creo lista de empleado con la cual realizo la sentencia 
		    List<Employees> listE; 
		    
		    listE= session.createSQLQuery("SELECT * FROM EMPLOYEES WHERE DEPARTMENT_ID =(SELECT DEPARTMENT_ID FROM DEPARTMENTS WHERE DEPARTMENT_NAME like 'Sales') ").addEntity(Employees.class).list();
			
			Iterator<Employees> itEmplo = listE.iterator();
			
			Employees employees =null;
			
			BigDecimal numero_salary = new BigDecimal(0);
			
			BigDecimal incremento = new BigDecimal(1.2);
			

			while(itEmplo.hasNext())
			{
			
				employees=itEmplo.next();
			
				numero_salary= employees.getSalary().divide(incremento);
				//.divide
				//multiply
				
				employees.setSalary(numero_salary);
				//Salvo la sesion y actualizo
				//session.saveOrUpdate(employees);
		}
			
			transaction.commit();
			
		}
		
		catch (Exception e) 
		
		{
			e.printStackTrace();
			
			transaction.rollback();
		}
		
		finally
		
		{
			System.out.println("Termino de incrementar el salario a los empleados");
			
		}
	}
	
	public void mostrarVentas()
	{
		System.out.println("Departamente de ventas y sus integrantes");
		
		try {
			
			transaction = session.beginTransaction();
			
			@SuppressWarnings("unchecked")
		
			List<Employees> listE2;
			
			listE2 = session.createSQLQuery("SELECT * FROM EMPLOYEES WHERE DEPARTMENT_ID =(SELECT DEPARTMENT_ID FROM DEPARTMENTS WHERE DEPARTMENT_NAME like 'Sales') ").addEntity(Employees.class).list();
			
			Iterator<Employees> itEmplo = listE2.iterator();
			
			while (itEmplo.hasNext()) 
			{
				System.out.println(itEmplo.next());
			}
			
			transaction.commit();
		
		}
		catch (Exception e) 
		{
			e.printStackTrace();
		
			transaction.rollback();
		}
		finally 
		{
			disconectSession();
		}

	}
	
	public void mostrarRegiones()
	{
		System.out.println("Mostrar regiones");
		
		try {
			
			transaction = session.beginTransaction();
			
			@SuppressWarnings("unchecked")
		
			List<Regions> listR;
			
			Regions r= null;
			Countries c=null;
			
			listR = session.createSQLQuery("SELECT * FROM REGIONS").addEntity(Regions.class).list();
			
			Iterator<Regions> itREG = listR.iterator();
			
			while (itREG.hasNext()) 
			{
				r = itREG.next();				
				Iterator<Countries> itREG2 = r.getCountrieses().iterator();
				System.out.println("El nombre del continente es "+ r.getRegionName());
				 while (itREG2.hasNext())
				{
					
					System.out.println(itREG2.next().getCountryName());
				}
				
			}
			
			transaction.commit();
		
		}
		catch (Exception e) 
		{
			e.printStackTrace();
		
			transaction.rollback();
		}
		finally 
		{
			disconectSession();
		}

	}
	
}