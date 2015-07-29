package practica1.curso;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Leer_Txt 
{

	public static String [] ficTxt (String nom)
	{
	 int conta=0;
	 File archivo = null;
     FileReader fr = null;
     BufferedReader br = null;
     String []array = null;
     String linea;
   //  String Str = new String();
     String mail = new String();
     int u=0;
     int a=0;
  
     try {
        /**
         *  Apertura del fichero y creamos el BufferedReader para poder hacer una lectura
         */
    	//String [] array= null;
        archivo = new File (nom);
        fr = new FileReader (archivo);
        br = new BufferedReader(fr);
        
        /**
         * Lectura del fichero
         */
     
        
        while((linea=br.readLine())!=null)
        	{
        
        		Pattern pat = Pattern.compile(".*@.*");
        		Matcher mat = pat.matcher(linea);
             
             if (mat.matches()) 
             {
            	conta= conta+1;
            	//Para que siga en la misma linea tengo que poner un while para que mientras 
            	//encuentre *** sigue con la busqueda
                while (linea.indexOf("***")!= -1) //te busca el patron y te devulve la posicion
                	// sino lo encuentra devuelve -1
                {
                	u=linea.indexOf("***");
           	 		a=linea.indexOf("///");
           	 		u = u+3;
          	 		mail += linea.substring(u,a) + ":";
          	 		// aqui es donde muestro y corto a partir de las //
          	 		linea =linea.substring(a+3,linea.length());
                }
        	 	//System.out.println(mail);
        	 	//System.out.println(conta + "-. " + "La cuenta de correo es :" + mail);         	 	
            	} 
            else 
            	{
                 //System.out.println("NO");
            	}
         
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
	 
     array=new String[conta];  //Aqui meto el contador en el array para saber cuantos correos tiene.
     
 //Aqui en el string de mail le pongo despues de cada correo : para poder cortarlo
     array = mail.split(":");
     
      Arrays.sort(array);
     
     for (int i = 0; i < array.length; i++) 
     {
		System.out.println(array[i]);
     }
     
     return null;
	}
	
}
