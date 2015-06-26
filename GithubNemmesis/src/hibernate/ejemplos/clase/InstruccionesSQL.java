package hibernate.ejemplos.clase;

@SuppressWarnings("serial")
public class InstruccionesSQL
{
	//public static string consultaSueldo
		
	public static String leerEmpleadoPorID()
	{
		return "select * from EMPLOYEES WHERE Employee_ID=?";
	}
	
	//public static String buscaruser = "SELECT * from users Where USER_NAME='Ruth' and USER_PASS='Nemmesis82'";

	public static String buscarUsuario()
	{
		return "SELECT * from users Where USER_NAME=? AND USER_PASS=?";
		
	}
}