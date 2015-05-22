package copia.repositorio.todo;

import java.util.Iterator;

public class Recorrer implements Iterator<Persona>
{
		int conta=0;
	public boolean hasNext() 
	{
		// TODO Auto-generated method stub
		conta++;
		return false;
	}

	public Persona next() 
	{
		// TODO Auto-generated method stub
		conta ++;
		return null;
	}

	public void remove() 
	{
		// TODO Auto-generated method stub
		conta --;
	}

	
}
