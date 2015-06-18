package hibernate.ejemplos.clase;

import java.util.List;

import pruebas.SessionManager;

public class Main 
{
	public static void main(String[] args)
	{
		
		/**
		 * Esta es la clase Main en donde hare una llamada a la 
		 * clase Services de Empleado donde se ejecutan las sentencias
		 * 
		 */
		
		/**
		 * Ahora creo un objeto de la clase ServicesEmpleado 
		 * para poder hacer la llamada a la clase
		 */
		ClaseServicesEmpleados cSE = new ClaseServicesEmpleados();

		/**
		 * Aqui creo un objeto de Lista de Empleados ListEm
		 */
		
		List<Employees> listEm = null;

		/**
		 * para que guarde los datos que recibira de la llamada 
		 * a clase Obtener todos los datos de los empleados
		 */
		
		listEm = cSE.obtenerTodosEmpleados();

		/**
		 * aqui con el bucle for mostrare los empleados que 
		 * tengo en la llamada anterior
		 */
		
        for (Employees employees : listEm)
		{
			System.out.println(employees);
		}
        
        /**
         * Aqui creo un objeto de Lista de Empleados 
         * con listMaxSalario
         */
        
		List<Employees> listMaxSalario = null;
		
		/**
		 * para que guarde los datos que recibira 
		 * de la llamada a clase para Obtener el maximo salario
		 */
		
		listMaxSalario= cSE.obtenerMaximoSalario();
		
		/**
		 * aqui con el bucle for mostrare los empleados que 
		 * tengo en la llamada anterior
		 */
		for (Employees employees : listMaxSalario) 
		{
			System.out.println("MAXIMO SALARIO");
			System.out.println(employees);
		}
		
		/**
		 * Aqui declaro una variable boolean 
		 * para que me de una respuesta de la llamada al método 
		 */
		boolean iCs=false;
		
		/**
		 * la variable declarada arriba recibira 
		 * el dato de la llamada a la clase incrementar salario.
		 */
		iCs=cSE.incrementarSalario();
		
		/**
		 * Aqui muestro el contenido de la variable
		 */

		System.out.println(iCs);
		
		/**
		 * Creo un lista de empleado en la cual guardare el resultado 
		 * llamada que hago al metodo Obtener empleados por departamento 
		 */
		List<Employees> listEmple = null;
		
		
		/**
		 * Creo una variable de Departamentos para pasarla como 
		 * argumento al metodo obtener Empleados por departamento
		 */
		Departments de= new Departments((short) 80,"Sales");
		
		/**
		 * Aqui asigno a la lista listEmple el resultado de la 
		 * llamada a obtener empleadoporDepartamento pasandole los datos 
		 * de la variable de departamento a la cual quiero conocer sus empleados
		 */
		
		listEmple= cSE.obtenerEmpleadosporDepartamento(de);
		
		
		/**
		 * Creo una variable para comprobar cuantos registros me muestra del
		 * listado de empleados
		 */
		int i =0;
		
		/**
		 * Aqui muestro el resultado de la lista de empleaso para que se me 
		 * imprima por pantalla 
		 */
		
		for (Employees employees : listEmple) 
		{
			i++;
			System.out.println(employees);
			System.out.println(i);
		}
		
		SesionManager.cerrarSessionFactory();
	}
}