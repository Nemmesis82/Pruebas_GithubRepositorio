package copia.repositorio.todo;
import java.io.*;
public class copiarFicheros 
{
	
	 public static boolean copia (String ficheroOriginal, String ficheroCopia)
	    {
		 boolean f = true;   
		 try
	        {
	         /**
	          *  Abro el fichero original para lectura
	          */
	        	
	            FileInputStream fileInput = new FileInputStream(ficheroOriginal);
	            BufferedInputStream bufferedInput = new BufferedInputStream(fileInput);
	             
	            /**
	             *  Abro el fichero donde se hará la copia
	             */
	            
	            FileOutputStream fileOutput = new FileOutputStream (ficheroCopia);
	            BufferedOutputStream bufferedOutput = new BufferedOutputStream(fileOutput);
	             
	            /**
	             * Bucle para leer de un fichero y escribir en el otro.
	             */
	            
	            byte [] array = new byte[1000];
	            
	            int leidos = bufferedInput.read(array);
	            
	            while (leidos > 0)
	            {
	                bufferedOutput.write(array,0,leidos);
	                leidos=bufferedInput.read(array);
	            }
	 
	            /**
	             *  Cierre de los ficheros
	             */
	            bufferedInput.close();
	            bufferedOutput.close();
	        }
	        catch (Exception e)
	        {
	            e.printStackTrace();
	        }
	        return false;
	    }
	
}
