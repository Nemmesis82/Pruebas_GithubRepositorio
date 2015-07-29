package practica1.curso;

import java.io.FileWriter;
import java.io.PrintWriter;

public class EscribirFichero 
{

	public boolean arrayToFichero(String nombre,String[] fichero_array)
	{
		boolean b=true;
		
		FileWriter fichero = null;
        PrintWriter pw = null;
        
        try
        {
        	/**
             *  Apertura del fichero y escribimos con PrintWrite
             */
            
        	fichero = new FileWriter(nombre);
            pw = new PrintWriter(fichero);
            
            /**
             * Creo un buble for para que me recorra todo el fichero hasta el final y lo guarde en la variable pw 
             */
            
            for (int i = 0; i < 10; i++)
            {
                pw.println("Linea " + i);
            }
        } 
        catch (Exception e) 
        {
            e.printStackTrace();
        } 
        finally 
        {
           try 
           {
        	   	 
        	   /**
        	    * El finally para asegurarnos que se cierra el fichero. 
        	    */
        	   
        	   if (null != fichero)
        	   {
        		   fichero.close();
        	   }
           }
           catch (Exception e2) 
           {
              e2.printStackTrace();
           }
        }
	return b=false;
	}

}
