package copia.repositorio.todo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class MainComparator 
{
	
	public static void main(String[] args) 
	{
		ArrayList<Persona> aLp = new ArrayList<Persona>();
		
		Persona p1 = new Persona("Ruth", 33);
		Persona p2 = new Persona("Esther", 31);
		Persona p3 = new Persona("Carlos", 32);
		Persona p4 = new Persona("Fernando", 65);
		Persona p5 = new Persona("Rosa", 61);
		Persona p6 = new Persona("Xiomara", 31);
		Persona p7 = new Persona("Sergio", 33);
	
		aLp.add(p1);
		aLp.add(p2);
		aLp.add(p3);
		aLp.add(p4);
		aLp.add(p5);
		aLp.add(p6);
		aLp.add(p7);
		
		CompararNumerosComparator cNc = new CompararNumerosComparator();
		CompararNombresComparator cNo = new CompararNombresComparator();
		
		Collections.sort(aLp, cNc);

		System.out.println(aLp);
		
		Collections.sort(aLp, cNo);
		
		System.out.println(aLp);
	}

	
		
	

}
