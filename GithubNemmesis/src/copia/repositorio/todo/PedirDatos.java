package copia.repositorio.todo;

import java.util.Scanner;

public class PedirDatos 
{
	//pedir nombre
	public static String pedirNombre()
	{
	// 	Las funciones siempre va la primera miniscula y despues la siguiente mayuscula

		String nombre = null; //declaro e inicializo la variable a null
		
		Scanner sca= new Scanner(System.in); //pido por scanner para que introduzca el nombre
		
		System.out.println("Introduzca Nombre: "); // aqui entro y pongo el nombre
		
		nombre = sca.next(); //aqui lo asigno a la variable nombre desde el scanner
		
		//System.out.println(nombre); //aqui imprimo el nombre
		
		//sca.close(); // cierro el scanner
		
		return nombre; // esto es lo que devuelve
	}
	
	//pedir edad
	public static int pedirEdad()
	{
		int edad; //declaro la edad
		int edad_Nueva;
		final int anos_Mas=10;
		
		Scanner sc= new Scanner(System.in); // pido por scanner para que introduzca la edad
		
		System.out.println("Introduzca Edad: "); // Aqui entro y pongo la edad
		
		edad = sc.nextInt();// aqui lo asigno a la edad
		//caso 2
		//edad_Nueva= edad + anos_Mas;
		
		//System.out.println(edad); //aqui lo imprimo
		
		//sc.close(); // cierro el scanner
	
			
		return edad;
		//return edad_Nueva; //y devuelvo edad
	}
	//Primer caso
	
	public static Persona MasEdad(Persona p, int inc)
	{
			
		Persona m= null;
		m= new Persona(p.nombre,p.edad+inc);
		return m;		
	}
	
	  
	
}
