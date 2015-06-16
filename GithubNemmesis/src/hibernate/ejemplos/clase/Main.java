package hibernate.ejemplos.clase;

import java.util.List;

public class Main {
	public static void main(String[] args) {
		/*
		 * SessionManager sM = new SessionManager(); IncrementoSalario iS = new
		 * IncrementoSalario(); MostrarRegiones mR = new MostrarRegiones();
		 * MostrarVentas mV = new MostrarVentas(); ObtenerMaxSalario oM = new
		 * ObtenerMaxSalario(); ObtenerEmpleadoPorDepartamento oEpD = new
		 * ObtenerEmpleadoPorDepartamento();
		 * 
		 * sM.setSession(null); iS.incrementoSalario20(); mR.mostrarRegiones();
		 * mV.mostrarVentas(); oM.obtenerSalarioAltoDepartamento();
		 * oEpD.obtenerEmpleadoPorDepartamento();
		 */

		ClaseServicesEmpleados cSE = new ClaseServicesEmpleados();

		List<Employees> listEm = null;

		listEm = cSE.obtenerTodosEmpleados();

       /* for (Employees employees : listEm)
		{
			System.out.println(employees);
		}*/

		List<Employees> listMaxSalario = null;
		
		listMaxSalario= cSE.obtenerMaximoSalario();
		
		for (Employees employees : listMaxSalario) 
		{
			System.out.println("MAXIMO SALARIO");
			System.out.println(employees);
		}
		
		
		
	}
}