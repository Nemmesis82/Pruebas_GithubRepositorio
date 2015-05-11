package copia.repositorio.todo;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Crearpassword 
{
	protected static String TieneMayus()
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Introduzca contraseña: ");
		String cadena1 = sc.next();
		 
		
		
		//[a-zA-Z_]: esto significa Mayusculas Minusculas y el simbolo _
		//{7,20} Numero de caracter minimo 7 hasta 20
		// \\d* Varios digitos
		
		Pattern pat = Pattern.compile("[a-zA-Z_]{7,20}\\d*");
		Matcher mat = pat.matcher(cadena1);
	   
	   	if (mat.matches()) 
	     {
	         System.out.println("Si tiene mas de 5 caracteres");
	     } 
	     else 
	     {
	         System.out.println("No esta correcto vuelva a introducir la contraseña");
	            return Crearpassword.esBuena();
	     }
		return cadena1;
		  		  		
	}
	
	protected static String esBuena()
	{
			Scanner sca= new Scanner(System.in);
			System.out.println("Introduzca contraseña: ");
    		String cadena1 = sca.next();
    		Pattern pat = Pattern.compile("[a-zA-Z_]{7,20}\\d*");
    		Matcher mat = pat.matcher(cadena1);
    		if (mat.matches()) 
   	     		{
   	         	System.out.println("La contraseña contiene letras Mayusculas, Minusculas, digitos y guion bajo");
   	     		} 
   	     	else 
   	     		{
   	     			System.out.println("No esta correcto vuelva a introducir la contraseña");
   	     			return Crearpassword.esBuena();
   	            }
    		return cadena1;
         
		
	}
}
