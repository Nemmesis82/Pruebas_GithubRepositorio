package practica1.curso;

public class LeerFichero
{

	public static void main(String[] args) 
	{
		String[] lectura =null;
		String lee = "c:\\Users\\alumno\\Desktop\\Ruth\\Practica-1-Ficheros\\PracticasFicheros\\ATAJOS ECLIPSE.txt";
		String lee2 = "c:\\Users\\alumno\\Desktop\\clases Ruth 703\\Mayo\\Clase05\\Practica1File";
		
		
		EscribirFichero aTF;
				
		/**
		 * Hago la llamada al metodo para leer al array
		 */
		
		lectura = LeerFicheroArray.ficheroToArray(lee);
		
		aTF = new EscribirFichero();
		aTF.arrayToFichero(lee2, lectura);
	
		 
	}
}
