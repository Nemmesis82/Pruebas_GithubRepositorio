package copia.repositorio.todo;

import java.io.File;

public class Practica1File 
{

	public static void main(String[] args) 
	{
		
		/**
		 * Creo un string donde voy a guardar la direccion donde esta los ficheros ç
		 *NOTA poner \\ porque no acepta la \simple
		 *String Directorio = "c:\\Users\\alumno\\Desktop\\Ruth\\Practica-1-Ficheros\\PracticasFicheros";
		 *
		 *
		 */

		
		String Directorio = "c:\\Users\\alumno\\Desktop\\Ruth\\Practica-1-Ficheros\\PracticasFicheros";
		
		/**
		 * Crear un objeto de tipo File con el nombre del directorio a a listar.
		 */
		File f = new File(Directorio);
		
		/**
		 * Este método devuelve todos los ficheros asociados al Directorio en un array de File de Ficheros.
		 *y utilizo el metodo listfiles para listar los ficheros que tengo guardados en un principio en
		 *Directorio pero que luego lo he pasado a f y lo asigno al array ficheros
		 */

		File[] ficheros = f.listFiles();

		if (ficheros == null)
			  System.out.println("No hay ficheros en el directorio especificado");
			else { 
				for (int i=0;i<ficheros.length;i++)
				{
/**
 * 				//Para obtener el nombre del fichero o directorio utilizamos el método .getName().
 */
				  System.out.println(ficheros[i].getName());
	/**
	 * 			 // System.out.println(Directorio);
	 */
				}
			}
	
	}

}
