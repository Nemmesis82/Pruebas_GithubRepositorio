package copia.repositorio.todo;

public class Suma_Array 
{

	public static void main(String[] args) 
	{
		  int[] numeros ={3,6,9};
	      int[] resul= Array2(numeros,3);
   	                
	      
	}
	
	 public static int[] Array2 (int[]numeros, int valor)
     {
   	  int[]resul= new int[numeros.length];
   	
   	  for (int i = 0; i < numeros.length; i++)
   	
   	  {
 	        resul[i]= numeros[i]+ valor;
		System.out.println(numeros[i]);

 	            
 	       }
   		  return resul;
     }
	

}
