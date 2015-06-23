package hibernate.ejemplos.clase;

import java.sql.SQLException;
import hibernate.ejemplos.clase.IRecuperable;

public class EmpleadoServices implements IRecuperable
{
	//Atributo de la interfaz Recuperable
	IRecuperable recup;
	
	public void setIRecuperable(IRecuperable recup) 
	{
		this.recup = recup;
	}
	
	/**
	 * este es el metodo que leera los empleados desde el metodo de leerEmpleadoService
	 * @param n es el numero id manager
	 * @return
	 */
	
	public Object leerEmpleado(int n)
	{
		Object o= null;
		
		 o=this.recup.leerEmpleado(n);
		 
		 return o;
	}

}
