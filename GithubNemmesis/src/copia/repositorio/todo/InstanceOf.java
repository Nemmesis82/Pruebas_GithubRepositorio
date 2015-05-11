package copia.repositorio.todo;

public class InstanceOf 
{

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		Persona p = null;
		
		
		if (p instanceof Persona)
		{
			System.out.println("Verdad");
			
		}
		else 
			System.out.println("No es Persona");

	}

}
