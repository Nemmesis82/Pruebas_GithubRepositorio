package hibernateJPA;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Principal 
{
	public Principal() 
	{
	
	}

	public static void main(String[] args) 
	{
		long empId = 190; // emp 190 - Timothy Gates
		
		Employee yo = null;
				
		//Sesion Manager
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("UnidadPersonas");
		
		//creo la sesion
		EntityManager em = emf.createEntityManager();
	
		try 
		{
			//comienzo la transacción
			em.getTransaction().begin();
			//encuentrame el em en el 
			yo = em.find(Employee.class, empId);
			
			System.out.println(yo.toString());
			
			// em.persist(yo);
			em.getTransaction().commit();
		}
		catch (Exception e) 
		{
			em.getTransaction().rollback();
			e.printStackTrace();
		}

		finally 
		{
			em.close();
			System.exit(0);// no sé pporqué no acaba sólo...parace que se queda
							// conlgando si no le pongo esto
		}
	}
}