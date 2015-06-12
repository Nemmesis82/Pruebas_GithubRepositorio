package hibernate.ejemplos.clase;

import java.util.Iterator;
import java.util.List;

public class MostrarVentas
{

	public void mostrarVentas()
	{
		
		SessionManager sM2 = new SessionManager();
		System.out.println("Departamente de ventas y sus integrantes");
		
		try {
			
			sM2.transaction = SessionManager.session.beginTransaction();
			
			@SuppressWarnings("unchecked")
		
			List<Employees> listE2;
			
			listE2 = sM2.session.createSQLQuery("SELECT * FROM EMPLOYEES WHERE DEPARTMENT_ID =(SELECT DEPARTMENT_ID FROM DEPARTMENTS WHERE DEPARTMENT_NAME like 'Sales') ").addEntity(Employees.class).list();
			
			Iterator<Employees> itEmplo = listE2.iterator();
			
			while (itEmplo.hasNext()) 
			{
				System.out.println(itEmplo.next());
			}
			
			sM2.transaction.commit();
		
		}
		catch (Exception e) 
		{
			e.printStackTrace();
		
			sM2.transaction.rollback();
		}
		finally 
		{
			sM2.disconectSession();
		}

	}

}
