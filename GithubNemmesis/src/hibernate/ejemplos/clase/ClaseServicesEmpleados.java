package hibernate.ejemplos.clase;

import java.util.List;

public class ClaseServicesEmpleados 
{
	
	EmployeesDAO empDAO;
	
	
	
	public ClaseServicesEmpleados()
	{
		empDAO= new EmployeesDAO();

	}

	public boolean incrementarSalario ()
	{
		boolean incSal= false;	
		incSal=empDAO.incrementarSalario();
		
		return incSal;
	}
	
	
	public List<Employees> obtenerMaximoSalario()
	{
		List<Employees> listE= null;
		
		listE= empDAO.obtenerMaximoSalario();
		
		return listE ;	
		}

	public List<Employees> obtenerEmpleadosporDepartamento(Departments dep)
	{
		List<Employees> listE= null;
		
		/**/
		return listE ;
	}
	
	public List<Employees> obtenerTodosEmpleados()
	{
		List<Employees> listEm= null;
		
		listEm=empDAO.recuperarEmpleadosBBDD();
		
		return listEm;
	}
	
	
}
