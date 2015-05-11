package copia.repositorio.todo;

import java.util.Scanner;

/**
 * 
 * 
 * @author Val
 *
 *El código de esta clase, es un poco misterioso. Algún programador Clase "C", no ha usado
 *nombres descriptivos y ahora, nos toca pegarnos y descubrir qué narices hace este código, 
 *para poder usarlo en nuestro proyecto.
 *
 *
 *Se pide:
 *
 *1) Adivinar la funcionalidad del método adivinaQueHace = PALINDROMO
 *2) Una vez descubierto, aplicar un nombre apropiado al método y a la clase = PALINDROMO -->INTRODUCEPALINDROMO
 *3) Idear un método equivalente, pero distinto. Es decir, crear un método 
 *que haga lo mismo que adivinaQueHace, pero de otra manera. HACER UN METODO PARECIDO A ESTE DEL PALINDROMO
 *4) EXTRA: Sólo si resolviste los puntos anteriores, implementa una versión recursiva
 *
 */
public class PalinDromo 
{
	private static boolean introducePalindromo (String cad)
	{
		boolean bd = true;
		
		int i = 0;
		int j = cad.length()-1;
		
		while ((i<=j)&&(bd))
		{
			bd = cad.charAt(i)==cad.charAt(j);
			i++;
			j--;
		}
		
		
		return bd;
	}
	public static void main(String[] args) 
	{
		
		/**
		 * Declaro un variable objeto de OtroPal
		 */
		OtroPal pal=new OtroPal();
				
		String frase=null;
		
		System.out.println("Introduzca frase: ");
		
		Scanner escaner= new Scanner(System.in);
	
		frase = escaner.next(); 
	
		//frase = "la ruta nos aporto otro paso natural" ;
		
        if(pal.espalindromo(frase))
        
        	{
            	System.out.println("Es un Palindromo ");
        	}
        else
        	{
        		System.out.println("No es un  Palindromo");
        	}
        		
	if (introducePalindromo("polop"))
		{
			System.out.println("VERDADERO");
		} else 
		{
			System.out.println("FALSO");
		}

	}

}
