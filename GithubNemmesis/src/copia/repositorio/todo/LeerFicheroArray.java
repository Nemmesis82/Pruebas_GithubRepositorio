package copia.repositorio.todo;
import java.io.*;

public class LeerFicheroArray 
{
	public static String [] ficheroToArray (String nom)
	{
		 
	 File archivo = null;
     FileReader fr = null;
     BufferedReader br = null;

     try {
        /**
         *  Apertura del fichero y creamos el BufferedReader para poder hacer una lectura
         */
        
        archivo = new File (nom);
        fr = new FileReader (archivo);
        br = new BufferedReader(fr);

        /**
         * Lectura del fichero
         */
        String linea;
        	while((linea=br.readLine())!=null)
        	{
        		System.out.println(linea);
     		}
     	}
        catch(Exception e)
        	{
        		e.printStackTrace();
        	}
        	
     finally
        	{
        /**
         *  En el finally cerramos el fichero, para asegurarnos que se cierra tanto si todo va bien como si salta una excepcion.
         */

     
    	try
    	 	{                    
           if( null != fr )
           		{   
        	   		fr.close();     
           		}                  
    	 	}
    	 catch (Exception e2)
    	 { 
           e2.printStackTrace();
    	 }
    	           
     }
     return null;
	}
}
 
 
	

