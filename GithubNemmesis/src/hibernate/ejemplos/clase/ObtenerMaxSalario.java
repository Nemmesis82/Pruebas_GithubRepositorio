package hibernate.ejemplos.clase;

import java.math.BigDecimal;
import java.util.Iterator;
import java.util.List;

public class ObtenerMaxSalario 
{

	public void obtenerSalarioAltoDepartamento()
	{
	
		SessionManager sM4 = new SessionManager();
	
	try 
	{					
		sM4.transaction = sM4.session.beginTransaction();
					
		@SuppressWarnings("unchecked")
					
	    List<Employees> listE; 
	    
	    listE= sM4.session.createSQLQuery("SELECT * FROM EMPLOYEES WHERE (SALARY, DEPARTMENT_ID) IN (SELECT MAX(salary), department_id FROM EMPLOYEES GROUP BY DEPARTMENT_ID)").addEntity(Employees.class).list();
		
	   for (int i = 0; i < listE.size(); i++) 
	   {
		   System.out.println(listE.get(i));
	   }
	    
	
		sM4.transaction.commit();
		
	}
	
	catch (Exception e) 
	
	{
		e.printStackTrace();
		
		sM4.transaction.rollback();
	}
	
	finally	
	{
		sM4.disconectSession();
				
	}
}
	
}
