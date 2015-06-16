package hibernate.ejemplos.clase;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.swing.text.html.ListView;

import org.hibernate.Session;

public class EmployeesDAO 
{
	Session sesion;
	
	public List<Employees> recuperarEmpleadosBBDD()
	{
		List<Employees> listE = null;
		
		this.sesion = SesionManager.obtenerSesionNueva();
		
		listE=sesion.createSQLQuery("SELECT * FROM EMPLOYEES").addEntity(Employees.class).list(); 
		
		SesionManager.cerrarSession(sesion);
		
		return listE;
	}

	public List<Employees> obtenerMaximoSalario()
	{
		List<Employees> listE2 = null;
		
		this.sesion = SesionManager.obtenerSesionNueva();
		
		listE2=sesion.createSQLQuery("SELECT * FROM EMPLOYEES WHERE (SALARY, DEPARTMENT_ID) IN (SELECT MAX(salary), department_id FROM EMPLOYEES GROUP BY DEPARTMENT_ID)").addEntity(Employees.class).list(); 
		
		SesionManager.cerrarSession(sesion);
		
		return listE2;
	}
	
	public boolean incrementarSalario()
	{
		boolean iS= false;
		
		List<Employees> listE3 = null;
		
		this.sesion = SesionManager.obtenerSesionNueva();
		
		listE3=sesion.createSQLQuery("SELECT * FROM EMPLOYEES WHERE DEPARTMENT_ID =(SELECT DEPARTMENT_ID FROM DEPARTMENTS WHERE DEPARTMENT_NAME like 'Sales')").addEntity(Employees.class).list(); 
		
		Iterator<Employees> itEmplo = listE3.iterator();
		
		Employees employees =null;
		
		BigDecimal numero_salary = new BigDecimal("0");
		
		BigDecimal incremento = new BigDecimal("1.2");
		

		while(itEmplo.hasNext())
		{
		
			employees=itEmplo.next();
			//numero_salary= employees.getSalary().divide(incremento,RoundingMode.HALF_UP);
			numero_salary= employees.getSalary().multiply(incremento);
			//.divide
			//multiply

			employees.setSalary(numero_salary);
			//Salvo la sesion y actualizo
			//session.saveOrUpdate(employees);
			System.out.println(employees);
			
		}
		
		SesionManager.cerrarSession(sesion);
		
		return iS=true;
		
	}
	
	

}
