package hibernate.ejemplos.clase;

import java.util.ArrayList;
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
		
		listE3=sesion.createSQLQuery("SELECT * FROM EMPLOYEES WHERE DEPARTMENT_ID =(SELECT DEPARTMENT_ID FROM DEPARTMENTS WHERE DEPARTMENT_NAME").addEntity(Employees.class).list(); 
		
		SesionManager.cerrarSession(sesion);
		
		
		return iS;
	}
	
	

}
