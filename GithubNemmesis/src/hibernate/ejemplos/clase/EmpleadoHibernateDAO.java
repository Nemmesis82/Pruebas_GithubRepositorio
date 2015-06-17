package hibernate.ejemplos.clase;
import org.hibernate.Session;

public class EmpleadoHibernateDAO implements IRecuperable
{
	Session sesion;
	
	@Override
	public Object leerEmpleado(int n) 
	{
	
		Employees emp= new Employees();
		
		this.sesion= SesionManager.obtenerSesionNueva();
		
		emp=(Employees) this.sesion.get(Employees.class,n);
				
		SesionManager.cerrarSession(this.sesion);
		
		return emp;
	}
	
	
	
	
}
