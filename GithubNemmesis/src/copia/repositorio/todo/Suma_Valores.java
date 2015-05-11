package copia.repositorio.todo;

public class Suma_Valores 
{

	public static void main(String[] args) 
	{
		 
		int c=0;
		//llamada 
		c= Suma(6,8);
		System.out.println(c);

	}
	
		protected static int Suma(int a, int b) 
		{
					
			return a+b;
		
		}
		
		
		/*
		 * 	public static void main(String[] args) 
	{
		 
		int c=0;
		//llamada 
		Suma(6,8,c);
		System.out.println(c);

	}
	
		protected static int Suma(int a, int b, int suma) 
		{
			suma=a+b
			return suma;
		
		}
		Esto me devuelve 0 que es el valor de c xq en la llamada hace una copia no modifica.
		
		 */
	}
