package hibernate.ejemplos.clase;

import java.util.List;

public class ClaseServicesEmpleados 
{
	/**
	 * Creo un objeto de la clase employeesDAO 
	 * para hacer las llamadas a la clase DAO
	 */
	

	EmployeesDAO empDAO;
	
	/**
	 * Hago el constructor de la clase 	
	 */
	
	public ClaseServicesEmpleados()
	{
		empDAO= new EmployeesDAO();

	}

	/**
	 * Metodo para hacer el incremento Salario
	 * 
	 * que devuelvo true o false dependiendo si esta correcto o no
	 *  @return
	 */
	
	public boolean incrementarSalario ()
	{
		boolean incSal= false;	
		incSal=empDAO.incrementarSalario();
		
		return incSal;
	}
	
	/**
	 * Metodo para obtener el maximo salario de todos los departamentos
	 * @return
	 */
	
	public List<Employees> obtenerMaximoSalario()
	{
		List<Employees> listE= null;
		
		listE= empDAO.obtenerMaximoSalario();
		
		return listE ;	
		}

	/**
	 * Metodo para obtener todos los empleados por el departamento indicado
	 * @param dep
	 * @return
	 */
	public List<Employees> obtenerEmpleadosporDepartamento(Departments dep)
	{
		List<Employees> listD= null;
		
		listD= empDAO.obtenerEmpleadosporDepartamento(dep);
		
		return listD ;
	}
	
	public List<Employees> obtenerTodosEmpleados()
	{
		List<Employees> listEm= null;
		
		listEm=empDAO.recuperarEmpleadosBBDD();
		
		return listEm;
	}
	
	
}
