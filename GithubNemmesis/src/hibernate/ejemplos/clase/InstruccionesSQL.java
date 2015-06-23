package hibernate.ejemplos.clase;

public class InstruccionesSQL 
{
	//public static string consultaSueldo
	
	public static String leerEmpleadoPorID()
	{
		return "select * from EMPLOYEES WHERE Employee_ID=?";
	}
}