package Pildoras.Informaticas;

public class manipula_cadenas 
{

	public static void main(String[] args) 
	{

			String nombre = "Felipe Juan Froilan de todos los santos";
			 System.out.println("Mi nombre es " + nombre);

			// usar metodo length
	
			// me dira que mi nombre tiene 4 letras
			System.out.println("Mi nombre tiene " + nombre.length()+ " letras.");
			
			// metodo chatAt para uqe me diga la posicion de la letra que quiero teniendo en cuenta
			// que la primera es el 0 = R
			
			System.out.println("La primera letra de " + nombre + " es la " + nombre.charAt(0));
	
			// para saber cual es la ultima letra de mi nombre
			
			int ultima_letra;
			
			// el metodo length devuelve el numero de letras hay en mi nombre
			ultima_letra = nombre.length();
			// me dice cual es la ultima letra de mi nombre
			System.out.println("Y la última letra es la " + nombre.charAt(ultima_letra-1));
				
	}

}
