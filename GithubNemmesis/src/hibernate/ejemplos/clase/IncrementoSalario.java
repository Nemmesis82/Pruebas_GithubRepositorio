package hibernate.ejemplos.clase;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Iterator;
import java.util.List;

public class IncrementoSalario 
{
	
	
	public void incrementoSalario20()
	{
		SessionManager sM1 = new SessionManager();
		
		try 
		{
			
						
			sM1.transaction = sM1.session.beginTransaction();
						
			@SuppressWarnings("unchecked")
						
		    List<Employees> listE; 
		    
		    listE= sM1.session.createSQLQuery("SELECT * FROM EMPLOYEES WHERE DEPARTMENT_ID =(SELECT DEPARTMENT_ID FROM DEPARTMENTS WHERE DEPARTMENT_NAME like 'Sales') ").addEntity(Employees.class).list();
			
			Iterator<Employees> itEmplo = listE.iterator();
			
			Employees employees =null;
			
			BigDecimal numero_salary = new BigDecimal("0");
			
			BigDecimal incremento = new BigDecimal("1.2");
			

			while(itEmplo.hasNext())
			{
			
				employees=itEmplo.next();
				//System.out.println("while employed");
				//numero_salary= employees.getSalary().divide(incremento,RoundingMode.HALF_UP);
				numero_salary= employees.getSalary().multiply(incremento);
				//.divide
				//multiply
				
				//System.out.println("while numero salary");
				
				employees.setSalary(numero_salary);
				//Salvo la sesion y actualizo
				//session.saveOrUpdate(employees);
				System.out.println(employees);
				
		}
			
			sM1.transaction.commit();
			
		}
		
		catch (Exception e) 
		
		{
			e.printStackTrace();
			
			sM1.transaction.rollback();
		}
		
		finally
		
		{
			sM1.disconectSession();
			System.out.println("Termino de incrementar el salario a los empleados");
			
		}
	}
}