package hibernate.ejemplos.clase;

import java.util.Scanner;

public class MainRecuperable
{

	public static void main(String[] args)
	{
		//Creo una variable de empleado services para hacer la llamada al metodo
		EmpleadoServices eS = new EmpleadoServices();

		//llamada a la sesion Hibernate
		//Creo una variable de la Interfaz Recuperable
		IRecuperable rec_hibernate = new EmpleadoHibernateDAO();
		
		//CReo una variable empleado para asignar el valor recibido
		Employees e = new Employees();
		
		eS.setIRecuperable(rec_hibernate);
		e= (Employees) eS.leerEmpleado(150);
					
		System.out.println(e);
		
	
		//llamada a la sesion JDBCDAO
		IRecuperable rec_jdbc = new EmpleadoJDBCDAO();
		
		eS.setIRecuperable(rec_jdbc);
		
		e=(Employees) eS.leerEmpleado(150);

		//llamada a la sesion JPADAO
		IRecuperable rec_jpa = new EmpleadoJPADAO();
	
		eS.setIRecuperable(rec_jdbc);
		
		e=(Employees) eS.leerEmpleado(150);
					
		
	}
	
	
}
