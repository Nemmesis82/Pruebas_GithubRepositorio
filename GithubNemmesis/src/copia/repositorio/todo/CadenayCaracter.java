package copia.repositorio.todo;

public class CadenayCaracter 
{


	public static void main(String[] args) 
	{
	
		
		
		

	}
	
	public boolean estaCharenCadena(String cadena, char c)
	{
		boolean esta= false;
		
		for (int pos=0; pos < cadena.length(); pos++)
		{
			if (c==cadena.charAt(pos))
			{
				esta =true;
			}
		}
		return esta;
		
		
	}

}
