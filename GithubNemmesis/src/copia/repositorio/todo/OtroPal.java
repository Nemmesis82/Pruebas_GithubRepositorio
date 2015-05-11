package copia.repositorio.todo;

public class OtroPal 
{
	public boolean espalindromo(String cadena)
	{
	    /**
	     * Declaro una variable boolean para que me devuelva true o false en funcion de lo introducido 
	     */
		boolean valor=true; // me dira si coincide alguna letras en true en false es que no coincide.
	    
	    int i;
	    int ind;     
	    
	    String cadena2="";
	    /**
	     * quitamos los espacios
	     */
	
	    for (int x=0; x < cadena.length(); x++) 
	    {
	    /**
	     * Aqui recorreo la cadena y miro si hay espacio y los quito
	     */
	    	if (cadena.charAt(x) != ' ')
	            cadena2 += cadena.charAt(x);
	    }
	    /**
	     * volvemos a asignar variables
	     */
	    
	    //aqui igualo el valor pasado del main cadena a valor cadena dos que inicialice a null
	    cadena=cadena2;    
	    //contiene el numero del cual consta la cadena pasada
	    ind=cadena.length();
	    
	    //aqui recorreo la cadena
	    for (i= 0 ;i < (cadena.length()); i++)
	    {        //comparo la cadena de adelante atras si son iguales con el equals
	       if (cadena.substring(i, i+1).equals(cadena.substring(ind - 1, ind)) == false ) 
	       {
	           	//si una sola letra no corresponde no es un palindromo por tanto
	            // sale del ciclo con valor false
	            valor=false;
	       }
      
	       ind--; //quito 1 al valor total de la cadena pasada del main hasta que se acabe
	    }
	    return valor;
	}

}
