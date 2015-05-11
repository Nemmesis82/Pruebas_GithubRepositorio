package copia.repositorio.todo;
/*este es el programa del ejercicio 5 del primer test*/
public class Prueba 
{
	/* public static int calcula() 
	 /* para que salga correctamente tenemos que poner static public static int calcula() 
	  {
		  return 1+1;
	   }
	  public static void main (String[] argumentos)
	   {
		   System.out.println(calcula());
	    } */
	
	public int calcula() 
	/* para que salga correctamente tenemos que poner static public static int calcula()*/
	{
		return 50*4;
	}
	
	public static void main(String[] args) 
	{

		Prueba  prueba=null; /*Defino la clase /tipo Prueba y la igualo a null*/
		int resultado=0; /*aqui pongo una variable de entero y la inicializo a 0*/
				
		prueba= new Prueba(); /*Aqui le doy un nuevo valor a prueba*/
		resultado= prueba.calcula();/*aqui le asigno el resultado de prueba calcula a resultado*/
		
		System.out.println(resultado); /*Esto es lo que muestra el resultado*/

	}

}
